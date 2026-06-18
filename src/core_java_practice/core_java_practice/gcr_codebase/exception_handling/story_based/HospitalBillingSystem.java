package core_java_practice.core_java_practice.gcr_codebase.exception_handling.story_based;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    static void processPayment(double billAmount, double payment)
            throws InsufficientFundsException {

        if (payment < billAmount) {
            throw new InsufficientFundsException(
                    "Payment failed: Insufficient funds.");
        }

        System.out.println("Payment Successful");
    }

    public static void main(String[] args) {

        int[] patientIds = {101, 102, 103};

        // ArithmeticException
        try {
            int totalBill = 5000;
            int items = 0;
            double avgBill = totalBill / items;

            System.out.println(avgBill);
        } catch (ArithmeticException e) {
            System.out.println(
                    "Error: Cannot divide bill by zero items.");
        }

        // ArrayIndexOutOfBoundsException
        try {
            System.out.println(patientIds[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                    "Error: Invalid patient index.");
        }

        // NumberFormatException
        try {
            int amount = Integer.parseInt("ABC");
            System.out.println(amount);
        } catch (NumberFormatException e) {
            System.out.println(
                    "Error: Invalid numeric input.");
        }

        // Custom Exception
        try {
            processPayment(5000, 3000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}