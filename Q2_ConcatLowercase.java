// Exp-06 Q2: Concatenate two strings and convert to lowercase
import java.util.Scanner;

public class Q2_ConcatLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter another string: ");
        String s2 = sc.nextLine();

        String result = (s1 + s2).toLowerCase();
        System.out.println("Result: " + result);

        sc.close();
    }
}
