package core_java_practice.core_java_practice.gcr_codebase.strings.Level3;

import java.util.Scanner;

public class BMIReport {

    public static String[][] calculateBMI(double[][] data) {

        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {

            double weight = data[i][0];
            double height = data[i][1] / 100.0;

            double bmi = weight / (height * height);

            String status;

            if (bmi < 18.5)
                status = "Underweight";
            else if (bmi < 25)
                status = "Normal";
            else if (bmi < 30)
                status = "Overweight";
            else
                status = "Obese";

            result[i][0] = String.valueOf(data[i][1]);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }

        return result;
    }

    public static void display(String[][] result) {

        System.out.println("Height\tWeight\tBMI\tStatus");

        for (String[] row : result) {
            System.out.println(row[0] + "\t" +
                    row[1] + "\t" +
                    row[2] + "\t" +
                    row[3]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] person = new double[10][2];

        for (int i = 0; i < 10; i++) {

            System.out.print("Weight (kg): ");
            person[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            person[i][1] = sc.nextDouble();
        }

        display(calculateBMI(person));

        sc.close();
    }
}