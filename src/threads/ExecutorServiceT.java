package threads;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ExecutorServiceT {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService ss1 = Executors.newCachedThreadPool();
        ExecutorService ss2 = Executors.newSingleThreadExecutor();
        ExecutorService ss3 = Executors.newScheduledThreadPool(3);
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(3);


        ExecutorService ss = Executors.newFixedThreadPool(3);
        ss.submit(()-> {
            AtomicInteger at = new AtomicInteger();
            int i=1000;
            while(i!=0) {
                at.incrementAndGet();
                i--;
            }
            System.out.println(at);
        });

        Future<AtomicInteger> f = ss.submit(()-> {
            AtomicInteger at = new AtomicInteger();
            int i=1000;
            while(i!=0) {
                at.incrementAndGet();
                i--;
            }
            return at;
        });

        ss.shutdown();

        CompletableFuture<AtomicInteger> cf = CompletableFuture.supplyAsync(()-> {
            AtomicInteger at = new AtomicInteger();
            int i=1000;
            while(i!=0) {
                at.incrementAndGet();
                i--;
            }
            return at;
        });

        cf.thenApply(res->res.get()*2).thenAccept(System.out::println);

        CompletableFuture<Integer> cf1 = CompletableFuture.supplyAsync(()->{
            throw new RuntimeException();
        });

        //When exception
        cf1.exceptionally(ex-> {

            System.out.println("Error: "+ ex);
            return 0;
        }).thenAccept(System.out::println);

        cf1.handle((res,ex)->{
            if (ex==null)
                return res;
            System.out.println("Error: "+ ex);
            return ex;
        }).thenAccept(System.out::println);

        cf1.whenComplete((res,ex)->{
            if (ex==null)
                System.out.println("Error: " +ex);

        }).exceptionally(ex->0).thenAccept(System.out::println);

        //Combine and block main thread
        CompletableFuture.allOf(cf,cf1).join();

        cf.thenAccept(System.out::print);




    }
}
