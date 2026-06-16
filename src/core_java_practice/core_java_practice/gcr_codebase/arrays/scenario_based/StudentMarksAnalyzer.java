package core_java_practice.core_java_practice.gcr_codebase.arrays.scenario_based;

import java.util.Scanner;

public class StudentMarksAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        int highest, lowest;
        int countAbove75 = 0;
        double sum = 0;

        System.out.println("Enter marks:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();

            if (i == 0) {
                highest = lowest = marks[i];
            }
        }

        highest = lowest = marks[0];

        for (int i = 0; i < n; i++) {
            if (marks[i] > highest)
                highest = marks[i];

            if (marks[i] < lowest)
                lowest = marks[i];

            if (marks[i] > 75)
                countAbove75++;

            sum += marks[i];
        }

        double average = sum / n;

        System.out.println("\nHighest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
        System.out.println("Students scoring above 75: " + countAbove75);
        System.out.printf("Average Marks: %.2f%n", average);

        System.out.println("Marks greater than average:");
        for (int mark : marks) {
            if (mark > average)
                System.out.print(mark + " ");
        }

        sc.close();
    }
}