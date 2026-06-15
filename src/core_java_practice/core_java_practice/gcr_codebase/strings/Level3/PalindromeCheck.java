package core_java_practice.core_java_practice.gcr_codebase.strings.Level3;

import java.util.Scanner;

public class PalindromeCheck {

    // Method 1
    public static boolean isPalindrome(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {

            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    // Method 2 - Recursion
    public static boolean palindromeRecursive(
            String text, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return palindromeRecursive(
                text, start + 1, end - 1);
    }

    // Method 3 - Reverse Array
    public static boolean palindromeArray(String text) {

        char[] original = text.toCharArray();
        char[] reverse = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            reverse[i] =
                    text.charAt(text.length() - 1 - i);
        }

        for (int i = 0; i < original.length; i++) {

            if (original[i] != reverse[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        System.out.println("Method 1 = "
                + isPalindrome(text));

        System.out.println("Method 2 = "
                + palindromeRecursive(
                text, 0, text.length() - 1));

        System.out.println("Method 3 = "
                + palindromeArray(text));

        sc.close();
    }
}