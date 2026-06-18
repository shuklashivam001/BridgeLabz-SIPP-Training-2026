package core_java_practice.core_java_practice.gcr_codebase.exception_handling.scenario_based;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

public class HospitalBilling {

    static void processPayment(double bill, double payment)
            throws InsufficientFundsException {

        if (payment < bill) {
            throw new InsufficientFundsException(
                    "Payment failed: Insufficient funds.");
        }

        System.out.println("Payment Successful");
    }

    public static void main(String[] args) {

        int[] patients = {101, 102, 103};

        try {
            // ArithmeticException
            int billAmount = 1000;
            int items = 0;
            System.out.println(billAmount / items);

            // ArrayIndexOutOfBoundsException
            System.out.println(patients[5]);

            // NumberFormatException
            int amount = Integer.parseInt("ABC");

            processPayment(5000, 3000);

        } catch (ArithmeticException e) {
            System.out.println("Error: Bill cannot be divided by zero items.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}