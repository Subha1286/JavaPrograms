// Exp-07 Q5: Execution of finally block
public class Q5_FinallyBlockDemo {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero.");
        } finally {
            System.out.println("Finally block is always executed.");
        }
    }
}
