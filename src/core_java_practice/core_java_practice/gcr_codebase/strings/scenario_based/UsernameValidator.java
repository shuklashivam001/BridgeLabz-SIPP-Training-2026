package core_java_practice.core_java_practice.gcr_codebase.strings.scenario_based;

import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        // Check for spaces
        if (username.contains(" "))
            System.out.println("Username contains spaces.");
        else
            System.out.println("Username does not contain spaces.");

        // Count characters
        System.out.println("Total characters: " + username.length());

        // Convert to uppercase
        System.out.println("Uppercase Username: " + username.toUpperCase());

        // Check palindrome
        String reversed = "";
        for (int i = username.length() - 1; i >= 0; i--) {
            reversed += username.charAt(i);
        }

        if (username.equalsIgnoreCase(reversed))
            System.out.println("Username is a Palindrome.");
        else
            System.out.println("Username is not a Palindrome.");

        sc.close();
    }
}