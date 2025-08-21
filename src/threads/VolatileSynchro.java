package threads;

public class VolatileSynchro {
    private static volatile boolean b=true;
    private static int count=0;

    public static void main(String[] args) throws InterruptedException {
        volatileTest();
        synchroTest();
    }

    private static synchronized void increment(){
        count++;
    }

    private static  synchronized int getCount(){
        return count;
    }

    private static void synchroTest() throws InterruptedException {
        Runnable run = () -> {
            for(int i=0; i<100000; i++){
                increment();
            }
        };

        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);

        t1.start(); t2.start();

        t1.join(); t2.join();
        System.out.println(count);

    }

    private static void volatileTest() {
        Thread t1 = new Thread(() -> {
            while(b)
                System.out.println("Thread running");
        });

        Thread t2 = new Thread(() -> {
            b=false;
        });

        t1.start();
        t2.start();
    }
}
