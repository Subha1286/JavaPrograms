import java.util.Scanner;

class Test2 {

    int num, rem, sum = 0;

    public void calc() {

        System.out.println("Enter a number:");

        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        while (num > 0) {

            rem = num % 10;
            sum = sum + rem;
            num = num / 10;

        }

        System.out.println("The sum of digits is " + sum);

        sc.close();
    }

    public static void main(String args[]) {

        Test2 ob = new Test2();
        ob.calc();

    }
}