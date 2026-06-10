package core_java_practice.core_java_practice.gcr_codebase.programming_elements.Level1;

import java.util.Scanner;

public class KmToMiles2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double km = sc.nextDouble();
        double miles = km / 1.6;

        System.out.println("The total miles is " + miles +
                " mile for the given " + km + " km");
    }
}
