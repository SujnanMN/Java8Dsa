package design.pattern;

import org.w3c.dom.stylesheets.DocumentStyle;

public class Test {

    public static void main(String[] args) {
        testFactory();
        testFof();
        testBuilder();
        testPrototype();
    }

    private static void testPrototype() {
        Docs doc = new Docs("abc");
        Docs doc2 = doc.clone();
    }

    private static void testBuilder() {
        HouseBuild hb = new HouseBuild.Builder().setRoof("22").build();
    }

    private static void testSingleton(){
        Singleton sing = Singleton.getInstance();
        Singleton sing1 = Singleton.getInstance();

        System.out.println(sing.display()+ sing.display());
    }

    private static void testFactory() {
        Factory factory = new Factory();
        Shape instance= factory.getShape("Square");
        instance.draw();

    }

    private static void testFof(){
        FurnitureFactory ff = new ModernFactory();
        FurnitureFactory ff1 = new VictorianFactory();

        Chair chair = ff.getChair();
        Table table = ff.getTable();

        chair.sit();
        table.use();

    }
  }
