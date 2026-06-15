package core_java_practice.core_java_practice.gcr_codebase.arrays.Level2;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();

        double[] percentage = new double[n];
        String[] grade = new String[n];

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Physics: ");
            physics[i] = sc.nextInt();

            System.out.print("Chemistry: ");
            chemistry[i] = sc.nextInt();

            System.out.print("Maths: ");
            maths[i] = sc.nextInt();

            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid Marks");
                i--;
                continue;
            }

            percentage[i] =
                    (physics[i] + chemistry[i] + maths[i]) / 3.0;

            if (percentage[i] >= 90)
                grade[i] = "A";
            else if (percentage[i] >= 75)
                grade[i] = "B";
            else if (percentage[i] >= 60)
                grade[i] = "C";
            else if (percentage[i] >= 40)
                grade[i] = "D";
            else
                grade[i] = "F";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                    " Percentage = " + percentage[i] +
                    " Grade = " + grade[i]);
        }

        sc.close();
    }
}