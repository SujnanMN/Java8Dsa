package solid;

//OCP
interface Shape {
    void print();
}

class Triangle implements Shape {

    @Override
    public void print() {
        System.out.println("Triangle");
    }
}

class Rectangle implements Shape {

    @Override
    public void print() {
        System.out.println("Rectangle");

    }
}

class ShapeService {
    public void getShape(Shape s){
        s.print();
    }
}

//For addition of new shape just extend shape
class Main {
    public static void main(String[] args) {
        ShapeService service = new ShapeService();
        service.getShape(new Triangle());

    }
}
