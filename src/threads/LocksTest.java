package threads;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LocksTest {
    static final Lock lock = new ReentrantLock();
    private static int count=0;
    public static void main(String[] args) throws InterruptedException {
        Runnable run = ()->{
            for(int i=0; i<10000; i++) {
                try {
                    incrementTryLock();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);

        t1.start(); t2.start();
        t1.join(); t2.join();

        System.out.print(count);
    }

    private static void increment(){
        lock.lock();
        try{
            count++;
        } finally{
            lock.unlock();
        }
    }

    private static void incrementTryLock() throws InterruptedException {
        if (lock.tryLock(2, TimeUnit.SECONDS)) {
            try {
                increment();
            } finally {
                lock.unlock();
            }

        }else
            System.out.println("Lock access denied");
    }
}
