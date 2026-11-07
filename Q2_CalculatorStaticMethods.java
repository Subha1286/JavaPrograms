// Exp-03 Q2: Static methods for integer and double exponentiation
import java.util.Scanner;

public class Q2_CalculatorStaticMethods {
    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    public static double powerDouble(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integer numbers (base and power): ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1 + " ^ " + num2 + " = " + powerInt(num1, num2));

        System.out.print("Enter two decimal numbers (base and power): ");
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();
        System.out.println(num3 + " ^ " + num4 + " = " + powerDouble(num3, num4));

        sc.close();
    }
}
