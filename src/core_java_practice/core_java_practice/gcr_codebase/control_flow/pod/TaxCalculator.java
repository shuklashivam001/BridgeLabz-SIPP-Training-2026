package core_java_practice.core_java_practice.gcr_codebase.control_flow.pod;

import java.util.*;

public class TaxCalculator {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int income = scan.nextInt();
//        System.out.printf("Income = %d | Tax = %.2f", income, taxCalculator(income));
        double totalTax = 0;
        int[] incomeArray = {8000, 12000, 25000, 55000, 7000, 48000, 51000, 3000, 15000, 60000};
        for (int i=0; i<10; i++) {
            int income = incomeArray[i];
            double tax = taxCal(income);
            String bracket;

            if (income < 10000) bracket = "5%";
            else if (income <= 50000) bracket = "15%";
            else bracket = "30%";

            totalTax += tax;

            System.out.printf("Citizen %d: Income = %d | Bracket = %s | Tax = %.2f%n",
                    (i+1), income, bracket, tax);
        }
        System.out.printf("%nTotal Tax Collected = %.2f%n", totalTax);
    }
    static double taxCal(int income){
        double tax = 0;
        if(income < 10000) tax = 5 * income / 100.0;
        else if(income <= 50000)  tax = 15 * income / 100.0;
        else tax = 30 * income / 100.0;
        return tax;
    }
}
