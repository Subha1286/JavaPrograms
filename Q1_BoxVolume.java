// Exp-03 Q1: Box volume calculation using parameterized constructor
class Box {
    double width;
    double height;
    double depth;

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }
}

public class Q1_BoxVolume {
    public static void main(String[] args) {
        Box b = new Box(10.0, 5.0, 3.0);
        System.out.println("Volume of the Box: " + b.volume());
    }
}
