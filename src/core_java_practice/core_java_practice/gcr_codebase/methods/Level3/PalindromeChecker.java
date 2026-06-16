package core_java_practice.core_java_practice.gcr_codebase.methods.Level3;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeChecker {

    public static int[] storeDigits(int number) {

        String str = String.valueOf(number);
        int[] digits = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }

        return digits;
    }

    public static int[] reverseArray(int[] digits) {

        int[] reverse = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            reverse[i] = digits[digits.length - 1 - i];
        }

        return reverse;
    }

    public static boolean compareArrays(int[] a, int[] b) {

        return Arrays.equals(a, b);
    }

    public static boolean isPalindrome(int[] digits) {

        return compareArrays(digits, reverseArray(digits));
    }

    public static boolean isDuckNumber(int[] digits) {

        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        int[] digits = storeDigits(number);

        System.out.println("Palindrome Number = " + isPalindrome(digits));
        System.out.println("Duck Number = " + isDuckNumber(digits));
    }
}