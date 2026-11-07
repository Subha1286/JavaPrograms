// Exp-06 Q4: First half of string if length is even, else null
import java.util.Scanner;

public class Q4_FirstHalfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (str.length() % 2 == 0) {
            String firstHalf = str.substring(0, str.length() / 2);
            System.out.println("Result: " + firstHalf);
        } else {
            System.out.println("Result: null");
        }

        sc.close();
    }
}
