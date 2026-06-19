package core_java_practice.core_java_practice.gcr_codebase.Java_IO.scenario_based;

import java.io.*;
import java.util.Scanner;

public class DailyExpenseLogger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("expenses.txt", true);

            System.out.print("Enter Category: ");
            String category = sc.nextLine();

            System.out.print("Enter Amount: ");
            int amount = sc.nextInt();

            fw.write(category + " - " + amount + "\n");

            fw.close();

            System.out.println("Expense Saved.");
        }
        catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}