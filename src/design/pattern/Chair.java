package design.pattern;

public interface Chair {
    void sit();
}

interface Table {
    void use();
}

class ModernChair implements Chair{

    @Override
    public void sit() {
        System.out.println("Sitting on modern chair");
    }
}

class ModernTable implements Table{
    @Override
    public void use() {
        System.out.println("Using modern table");
    }
}

class VitorianChair implements Chair{

    @Override
    public void sit() {
        System.out.println("Sitting on victorian chair");
    }
}

class VictorianTable implements Table{
    @Override
    public void use() {
        System.out.println("Using victorian table");
    }
}

interface FurnitureFactory {
    Chair getChair();
    Table getTable();
}

class ModernFactory implements FurnitureFactory{

    @Override
    public Chair getChair() {
        return new ModernChair();
    }

    @Override
    public Table getTable() {
        return new ModernTable();
    }
}

class VictorianFactory implements FurnitureFactory{

    @Override
    public Chair getChair() {
        return new VitorianChair();
    }

    @Override
    public Table getTable() {
        return new VictorianTable();
    }
}
