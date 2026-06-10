package core_java_practice.core_java_practice.gcr_codebase.control_flow.Level3;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int count = 0;

        while (number != 0) {
            number = number / 10;
            count++;
        }

        System.out.println("Number of Digits = " + count);
    }
}
