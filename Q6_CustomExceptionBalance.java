// Exp-07 Q6: User-defined checked exception InsufficientBalanceException
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class Q6_CustomExceptionBalance {
    static void withdraw(double balance, double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: ₹" + balance);
    }

    public static void main(String[] args) {
        double balance = 5000.0;
        double amount = 6000.0;

        try {
            withdraw(balance, amount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
