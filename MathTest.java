import mathpack.Calculator;

public class MathTest {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println("Addition: " + obj.add(20, 10));
        System.out.println("Subtraction: " + obj.subtract(20, 10));
        System.out.println("Multiplication: " + obj.multiply(20, 10));
        System.out.println("Division: " + obj.divide(20, 10));
    }
}
