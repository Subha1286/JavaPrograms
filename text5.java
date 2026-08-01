public class chekpalindrome {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int temp = num;
        int rev = 0, rem;

        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        if (temp == rev) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
}