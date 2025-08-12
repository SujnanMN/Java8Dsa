package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class MultiThread {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        AtomicInteger count = new AtomicInteger();

        Runnable run = () -> {
            List<Integer> list = new ArrayList<>();
            System.out.println(Thread.currentThread().getName());
            for(int i=0;i<10;i++) {
                list.add(i);
                count.incrementAndGet();
            }
        };

        Thread t1 = new Thread(run);
        t1.setName("trr-1");
        t1.setPriority(5);
        t1.setDaemon(true);
        Thread t2 = new Thread(run);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(count);
    }
}
