// Exp-07 Q4: Multiple catch blocks for ArithmeticException and ArrayIndexOutOfBoundsException
public class Q4_MultipleExceptions {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            System.out.println("Division: " + (a / b));

            int[] arr = {10, 20, 30};
            System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: Index out of bounds.");
        }
    }
}
