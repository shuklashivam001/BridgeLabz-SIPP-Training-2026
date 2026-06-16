package core_java_practice.core_java_practice.gcr_codebase.strings.scenario_based;

import java.util.Arrays;
import java.util.Scanner;

public class WordMatchSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Convert to lowercase for comparison
        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean isAnagram = Arrays.equals(arr1, arr2);

        System.out.println("\nFirst String (Uppercase): "
                + str1.toUpperCase());
        System.out.println("Second String (Uppercase): "
                + str2.toUpperCase());

        System.out.println("Length of First String: "
                + str1.length());
        System.out.println("Length of Second String: "
                + str2.length());

        if (isAnagram)
            System.out.println("Result: Both strings are ANAGRAMS.");
        else
            System.out.println("Result: Both strings are NOT ANAGRAMS.");

        sc.close();
    }
}