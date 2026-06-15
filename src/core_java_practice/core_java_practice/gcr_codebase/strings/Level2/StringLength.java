package core_java_practice.core_java_practice.gcr_codebase.strings.Level2;

import java.util.Scanner;

public class StringLength {

    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String text = sc.next();

        System.out.println("Length Using Method = " + findLength(text));
        System.out.println("Length Using Built-in = " + text.length());

        sc.close();
    }
}