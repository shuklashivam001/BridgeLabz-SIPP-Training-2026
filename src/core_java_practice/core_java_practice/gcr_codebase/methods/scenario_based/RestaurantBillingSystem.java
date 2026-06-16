package core_java_practice.core_java_practice.gcr_codebase.methods.scenario_based;

import java.util.Scanner;

public class RestaurantBillingSystem {

    static double calculateFoodCost(double price, int quantity) {
        return price * quantity;
    }

    static double calculateGST(double amount) {
        return amount * 0.18; // 18% GST
    }

    static double calculateDiscount(double amount) {
        if (amount >= 1000)
            return amount * 0.10; // 10% Discount
        return 0;
    }

    static double generateFinalBill(double foodCost,
                                    double gst,
                                    double discount) {
        return foodCost + gst - discount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter food price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double foodCost = calculateFoodCost(price, quantity);
        double gst = calculateGST(foodCost);
        double discount = calculateDiscount(foodCost);

        double finalBill =
                generateFinalBill(foodCost, gst, discount);

        System.out.println("\n----- Restaurant Bill -----");
        System.out.println("Food Cost : Rs. " + foodCost);
        System.out.println("GST       : Rs. " + gst);
        System.out.println("Discount  : Rs. " + discount);
        System.out.println("Final Bill: Rs. " + finalBill);

        sc.close();
    }
}