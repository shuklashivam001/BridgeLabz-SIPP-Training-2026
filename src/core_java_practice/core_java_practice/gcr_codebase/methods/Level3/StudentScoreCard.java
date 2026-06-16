package core_java_practice.core_java_practice.gcr_codebase.methods.Level3;

import java.util.Scanner;

public class StudentScoreCard {

    public static int[][] generateMarks(int students) {

        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++) {

            marks[i][0] = (int)(Math.random() * 90) + 10;
            marks[i][1] = (int)(Math.random() * 90) + 10;
            marks[i][2] = (int)(Math.random() * 90) + 10;
        }

        return marks;
    }

    public static double[][] calculateResults(int[][] marks) {

        double[][] result = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];

            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100) / 100.0;
            result[i][2] = Math.round(percentage * 100) / 100.0;
        }

        return result;
    }

    public static void display(int[][] marks, double[][] result) {

        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%");

        for (int i = 0; i < marks.length; i++) {

            System.out.println(
                    marks[i][0] + "\t"
                            + marks[i][1] + "\t"
                            + marks[i][2] + "\t"
                            + result[i][0] + "\t"
                            + result[i][1] + "\t"
                            + result[i][2]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int students = sc.nextInt();

        int[][] marks = generateMarks(students);
        double[][] result = calculateResults(marks);

        display(marks, result);
    }
}