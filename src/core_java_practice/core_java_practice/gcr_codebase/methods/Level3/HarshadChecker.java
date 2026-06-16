package core_java_practice.core_java_practice.gcr_codebase.methods.Level3;

import java.util.Scanner;

public class HarshadChecker {

    public static int[] storeDigits(int number) {

        String str = String.valueOf(number);
        int[] digits = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }

        return digits;
    }

    public static int sumDigits(int[] digits) {

        int sum = 0;

        for (int digit : digits) {
            sum += digit;
        }

        return sum;
    }

    public static double sumSquareDigits(int[] digits) {

        double sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }

        return sum;
    }

    public static boolean isHarshad(int number, int[] digits) {

        int sum = sumDigits(digits);

        return number % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {

        int[][] frequency = new int[10][2];

        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }

        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        int[] digits = storeDigits(number);

        System.out.println("Sum = " + sumDigits(digits));
        System.out.println("Sum of Squares = " + sumSquareDigits(digits));
        System.out.println("Harshad Number = " + isHarshad(number, digits));

        int[][] freq = digitFrequency(digits);

        System.out.println("\nDigit Frequency");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " -> " + freq[i][1]);
        }
    }
}