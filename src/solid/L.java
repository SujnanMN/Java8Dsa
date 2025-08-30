package solid;

public class L{ }

abstract class Bird {
    abstract void eat();
}
//Create flyable seperately so that object of child can be substitutable for parent
interface FlyableBird{
     void fly();
}

class Penguin extends Bird{

    @Override
    void eat() {
        System.out.println("Eating");
    }
}

class Sparrow extends Bird implements FlyableBird {

    @Override
    void eat() {
        System.out.println("Eating");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }
}