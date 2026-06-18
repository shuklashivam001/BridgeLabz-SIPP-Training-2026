package core_java_practice.core_java_practice.gcr_codebase.exception_handling.scenario_based;

class InsufficientBalanceException extends Exception {

    private double balance;
    private double withdrawalAmount;

    public InsufficientBalanceException(
            String message,
            double balance,
            double withdrawalAmount) {

        super(message);
        this.balance = balance;
        this.withdrawalAmount = withdrawalAmount;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawalAmount() {
        return withdrawalAmount;
    }
}

public class ATMWithdrawlSystem {

    static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient Balance!",
                    balance,
                    amount);
        }

        System.out.println(
                "Withdrawal Successful. Remaining Balance = ₹"
                        + (balance - amount));
    }

    public static void main(String[] args) {

        double balance = 5000;
        double withdrawalAmount = 8000;

        try {
            withdraw(balance, withdrawalAmount);
        }
        catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());
            System.out.println("Available Balance: ₹" + e.getBalance());
            System.out.println("Requested Amount: ₹" + e.getWithdrawalAmount());
        }
    }
}