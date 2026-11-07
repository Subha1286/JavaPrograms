// Exp-06 Q6: Repeat last n characters n times
import java.util.Scanner;

public class Q6_RepeatLastNChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n >= 0 && n <= str.length()) {
            String last = str.substring(str.length() - n);
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < n; i++) {
                result.append(last);
            }
            System.out.println("New String: " + result.toString());
        } else {
            System.out.println("Invalid value of n.");
        }

        sc.close();
    }
}
