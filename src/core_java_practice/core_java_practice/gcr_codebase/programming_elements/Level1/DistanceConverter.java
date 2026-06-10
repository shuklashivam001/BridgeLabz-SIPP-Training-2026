package core_java_practice.core_java_practice.gcr_codebase.programming_elements.Level1;

import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distanceInFeet = sc.nextDouble();

        double yards = distanceInFeet / 3;
        double miles = yards / 1760;

        System.out.println("Distance in yards is " + yards +
                " and distance in miles is " + miles);
    }
}
