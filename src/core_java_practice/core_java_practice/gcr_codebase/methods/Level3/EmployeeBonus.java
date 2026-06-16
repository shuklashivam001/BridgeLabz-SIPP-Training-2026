package core_java_practice.core_java_practice.gcr_codebase.methods.Level3;

import java.util.Arrays;

public class EmployeeBonus {

    public static double[][] generateEmployeeData() {

        double[][] employees = new double[10][2];

        for (int i = 0; i < employees.length; i++) {

            employees[i][0] = (int)(Math.random() * 90000) + 10000;
            employees[i][1] = (int)(Math.random() * 10) + 1;
        }

        return employees;
    }

    public static double[][] calculateBonus(double[][] employees) {

        double[][] result = new double[10][4];

        for (int i = 0; i < employees.length; i++) {

            double oldSalary = employees[i][0];
            double years = employees[i][1];

            double bonus;

            if (years > 5)
                bonus = oldSalary * 0.05;
            else
                bonus = oldSalary * 0.02;

            double newSalary = oldSalary + bonus;

            result[i][0] = oldSalary;
            result[i][1] = years;
            result[i][2] = bonus;
            result[i][3] = newSalary;
        }

        return result;
    }

    public static void display(double[][] data) {

        double totalOld = 0;
        double totalBonus = 0;
        double totalNew = 0;

        System.out.println("OldSalary\tYears\tBonus\tNewSalary");

        for (int i = 0; i < data.length; i++) {

            System.out.printf("%.0f\t\t%.0f\t%.2f\t%.2f\n",
                    data[i][0], data[i][1], data[i][2], data[i][3]);

            totalOld += data[i][0];
            totalBonus += data[i][2];
            totalNew += data[i][3];
        }

        System.out.println("\nTotal Old Salary = " + totalOld);
        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total New Salary = " + totalNew);
    }

    public static void main(String[] args) {

        double[][] employees = generateEmployeeData();
        double[][] result = calculateBonus(employees);

        display(result);
    }
}