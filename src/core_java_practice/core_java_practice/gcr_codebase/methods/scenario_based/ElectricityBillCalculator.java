package core_java_practice.core_java_practice.gcr_codebase.methods.scenario_based;

import java.util.Scanner;

public class ElectricityBillCalculator {

    static int acceptUnits() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        return sc.nextInt();
    }

    static double calculateBill(int units) {
        double bill;

        if (units <= 100)
            bill = units * 5;
        else if (units <= 300)
            bill = (100 * 5) + ((units - 100) * 7);
        else
            bill = (100 * 5) + (200 * 7) + ((units - 300) * 10);

        return bill;
    }

    static void displayBill(int units, double bill) {
        System.out.println("\n----- Electricity Bill -----");
        System.out.println("Units Consumed : " + units);
        System.out.println("Bill Amount    : Rs. " + bill);
    }

    public static void main(String[] args) {
        int units = acceptUnits();
        double bill = calculateBill(units);
        displayBill(units, bill);
    }
}