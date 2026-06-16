package core_java_practice.core_java_practice.gcr_codebase.scenario_based;

import java.util.Scanner;

public class ResultGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            total += sc.nextInt();
        }

        double average = total / 5.0;
        System.out.println("Average Marks: " + average);

        int gradeCode;

        if (average >= 90)
            gradeCode = 1;
        else if (average >= 75)
            gradeCode = 2;
        else if (average >= 60)
            gradeCode = 3;
        else if (average >= 40)
            gradeCode = 4;
        else
            gradeCode = 5;


        switch (gradeCode) {
            case 1:
                System.out.println("Grade: A");
                break;
            case 2:
                System.out.println("Grade: B");
                break;
            case 3:
                System.out.println("Grade: C");
                break;
            case 4:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: F");
        }
    }
}
