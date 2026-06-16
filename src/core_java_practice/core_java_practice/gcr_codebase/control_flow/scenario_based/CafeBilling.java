package core_java_practice.core_java_practice.gcr_codebase.control_flow.scenario_based;

import java.util.Scanner;

public class CafeBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double GST_RATE = 0.18; // 18% GST

        while (true) {
            System.out.print("Enter coffee type (Espresso/Latte/Cappuccino) or 'exit' to quit: ");
            String coffeeType = sc.next();

            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Exiting billing system...");
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            double price = 0;

            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    price = 120;
                    break;
                case "latte":
                    price = 150;
                    break;
                case "cappuccino":
                    price = 180;
                    break;
                default:
                    System.out.println("Invalid coffee type!");
                    continue;
            }

            double totalBill = price * quantity;
            double gst = totalBill * GST_RATE;
            double finalAmount = totalBill + gst;

            System.out.println("\n----- Bill -----");
            System.out.println("Coffee Type : " + coffeeType);
            System.out.println("Quantity    : " + quantity);
            System.out.println("Total Bill  : ₹" + totalBill);
            System.out.println("GST (18%)   : ₹" + gst);
            System.out.println("Final Amount: ₹" + finalAmount);
            System.out.println("----------------\n");
        }
    }
}
