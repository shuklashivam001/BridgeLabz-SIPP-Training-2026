package core_java_practice.core_java_practice.gcr_codebase.strings.story_based;

import java.util.*;

public class SpyAgencyAnalyzer {

    // Reverse String
    static String reverseMessage(String msg) {
        String reversed = "";
        for (int i = msg.length() - 1; i >= 0; i--) {
            reversed += msg.charAt(i);
        }
        return reversed;
    }

    // Check Palindrome
    static boolean isPalindrome(String msg) {
        String reversed = reverseMessage(msg);
        return msg.equalsIgnoreCase(reversed);
    }

    // Count Vowels and Consonants
    static void countVowelsConsonants(String msg) {
        int vowels = 0, consonants = 0;

        for (int i = 0; i < msg.length(); i++) {
            char ch = Character.toLowerCase(msg.charAt(i));

            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    // Check Anagram
    static boolean isAnagram(String s1, String s2) {
        s1 = s1.toLowerCase().replaceAll("\\s", "");
        s2 = s2.toLowerCase().replaceAll("\\s", "");

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    // First Non-Repeating Character
    static char firstNonRepeatingChar(String log) {
        for (int i = 0; i < log.length(); i++) {
            char ch = log.charAt(i);

            if (log.indexOf(ch) == log.lastIndexOf(ch))
                return ch;
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Secret Message
        System.out.print("Enter secret message: ");
        String message = sc.nextLine();

        System.out.println("\nReversed Message: " +
                reverseMessage(message));

        if (isPalindrome(message))
            System.out.println("Message is a Palindrome.");
        else
            System.out.println("Message is NOT a Palindrome.");

        countVowelsConsonants(message);

        // Intercepts
        System.out.print("\nEnter first intercept: ");
        String intercept1 = sc.nextLine();

        System.out.print("Enter second intercept: ");
        String intercept2 = sc.nextLine();

        if (isAnagram(intercept1, intercept2))
            System.out.println("Intercepts are Anagrams.");
        else
            System.out.println("Intercepts are NOT Anagrams.");

        // Surveillance Log
        System.out.print("\nEnter surveillance log: ");
        String log = sc.nextLine();

        char result = firstNonRepeatingChar(log);

        if (result != '\0')
            System.out.println("First Non-Repeating Character: " + result);
        else
            System.out.println("No Non-Repeating Character Found.");

        sc.close();
    }
}