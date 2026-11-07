// Exp-05 Q2: Interface references and runtime polymorphism
interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class Q2_ShapePolymorphism {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();

        s = new Rectangle();
        s.draw();
    }
}
