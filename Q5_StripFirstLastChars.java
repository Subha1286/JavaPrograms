// Exp-06 Q5: Return string without first and last characters
import java.util.Scanner;

public class Q5_StripFirstLastChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (str.length() <= 2) {
            System.out.println("String must have more than 2 characters.");
        } else {
            String result = str.substring(1, str.length() - 1);
            System.out.println("New string: " + result);
        }

        sc.close();
    }
}
