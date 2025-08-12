package design.pattern;

public interface Shape {
    void draw();
}

class Triangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}

class Factory {

    public Shape getShape(String shapeName) {
        if (shapeName.equals("Triangle")) {
            return new Triangle();
        } else if (shapeName.equals("Square")) {
            return new Square();
        }
        return null;
    }

}
