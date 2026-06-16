package core_java_practice.core_java_practice.gcr_codebase.methods.Level2;

import java.util.Scanner;

public class BMIProgram {

    public static double calculateBMI(double weight, double heightCm) {

        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }

    public static String getStatus(double bmi) {

        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][3];

        for (int i = 0; i < 10; i++) {

            System.out.print("Weight (kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            data[i][1] = sc.nextDouble();

            data[i][2] = calculateBMI(data[i][0], data[i][1]);
        }

        System.out.println("\nWeight Height BMI Status");

        for (int i = 0; i < 10; i++) {

            System.out.printf("%.2f %.2f %.2f %s\n",
                    data[i][0],
                    data[i][1],
                    data[i][2],
                    getStatus(data[i][2]));
        }
    }
}