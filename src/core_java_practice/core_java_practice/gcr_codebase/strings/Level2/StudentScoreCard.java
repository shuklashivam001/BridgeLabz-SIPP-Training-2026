package core_java_practice.core_java_practice.gcr_codebase.strings.Level2;

import java.util.Scanner;

public class StudentScoreCard {

    public static int[][] generateScores(int students) {

        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {

            scores[i][0] =
                    (int)(Math.random() * 100);

            scores[i][1] =
                    (int)(Math.random() * 100);

            scores[i][2] =
                    (int)(Math.random() * 100);
        }

        return scores;
    }

    public static double[][] calculateResult(
            int[][] scores) {

        double[][] result =
                new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {

            double total =
                    scores[i][0] +
                            scores[i][1] +
                            scores[i][2];

            double average = total / 3;

            double percentage =
                    (total / 300) * 100;

            result[i][0] =
                    Math.round(total * 100) / 100.0;

            result[i][1] =
                    Math.round(average * 100) / 100.0;

            result[i][2] =
                    Math.round(percentage * 100) / 100.0;
        }

        return result;
    }

    public static String[] calculateGrade(
            double[][] result) {

        String[] grade =
                new String[result.length];

        for (int i = 0; i < result.length; i++) {

            double percentage = result[i][2];

            if (percentage >= 90)
                grade[i] = "A+";
            else if (percentage >= 80)
                grade[i] = "A";
            else if (percentage >= 70)
                grade[i] = "B";
            else if (percentage >= 60)
                grade[i] = "C";
            else if (percentage >= 50)
                grade[i] = "D";
            else
                grade[i] = "F";
        }

        return grade;
    }

    public static void display(int[][] scores,
                               double[][] result,
                               String[] grade) {

        System.out.println(
                "Phy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < scores.length; i++) {

            System.out.println(
                    scores[i][0] + "\t" +
                            scores[i][1] + "\t" +
                            scores[i][2] + "\t" +
                            result[i][0] + "\t" +
                            result[i][1] + "\t" +
                            result[i][2] + "\t" +
                            grade[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int students = sc.nextInt();

        int[][] scores = generateScores(students);

        double[][] result =
                calculateResult(scores);

        String[] grade =
                calculateGrade(result);

        display(scores, result, grade);

        sc.close();
    }
}