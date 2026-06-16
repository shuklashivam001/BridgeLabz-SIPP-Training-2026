package core_java_practice.core_java_practice.gcr_codebase.scenario_based;

import java.util.Scanner;

public class MetroFareSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 500; // Initial card balance

        while (balance > 0) {
            System.out.println("\nCurrent Balance: ₹" + balance);
            System.out.print("Enter distance in km (or -1 to quit): ");
            int distance = sc.nextInt();

            if (distance == -1) {
                break;
            }

            double fare = (distance <= 5) ? 10 :
                    (distance <= 15) ? 20 : 30;

            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare Deducted: ₹" + fare);
                System.out.println("Remaining Balance: ₹" + balance);
            } else {
                System.out.println("Insufficient Balance!");
                break;
            }
        }

        System.out.println("Card balance exhausted or user exited.");
        sc.close();
    }
}