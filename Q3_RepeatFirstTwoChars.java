// Exp-06 Q3: Repeat first 2 characters n times where n = length
import java.util.Scanner;

public class Q3_RepeatFirstTwoChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int n = s.length();
        if (n < 2) {
            System.out.println("String must have at least 2 characters.");
        } else {
            String sub = s.substring(0, 2);
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < n; i++) {
                result.append(sub);
            }
            System.out.println("Result: " + result.toString());
        }

        sc.close();
    }
}
