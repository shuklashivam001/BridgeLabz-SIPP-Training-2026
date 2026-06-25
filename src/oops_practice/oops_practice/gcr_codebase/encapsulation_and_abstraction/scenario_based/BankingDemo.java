package oops_practice.oops_practice.gcr_codebase.encapsulation_and_abstraction.scenario_based;

abstract class BankAccount {

    private String accountNumber;
    private String holderName;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }

    abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {

    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}

class CurrentAccount extends BankAccount {

    private double monthlyBonusRate;

    public double getMonthlyBonusRate() {
        return monthlyBonusRate;
    }

    public void setMonthlyBonusRate(double monthlyBonusRate) {
        this.monthlyBonusRate = monthlyBonusRate;
    }

    double calculateInterest() {
        return getBalance() * monthlyBonusRate / 100;
    }
}

public class BankingDemo {

    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount();
        sa.setAccountNumber("SA101");
        sa.setHolderName("Shivam");
        sa.setBalance(50000);
        sa.setInterestRate(5);

        sa.deposit(5000);
        sa.withdraw(2000);

        CurrentAccount ca = new CurrentAccount();
        ca.setAccountNumber("CA201");
        ca.setHolderName("Aman");
        ca.setBalance(40000);
        ca.setMonthlyBonusRate(2);

        ca.deposit(3000);
        ca.withdraw(1000);

        System.out.println("Savings Account");
        sa.displayAccountDetails();
        System.out.println("Interest: " + sa.calculateInterest());

        System.out.println();

        System.out.println("Current Account");
        ca.displayAccountDetails();
        System.out.println("Interest: " + ca.calculateInterest());
    }
}