package Java8.inter;


public interface FunctionalInt {
     void fly();
     void kick();

     default void run() {
         System.out.println("Running ");
         sit();
    }

    static void sleep() {
        System.out.println("Sleeping");
    }

    private void sit() {
        System.out.println("Siting");
    }
    //Object
}
