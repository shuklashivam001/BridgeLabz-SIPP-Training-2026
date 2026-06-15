package core_java_practice.core_java_practice.gcr_codebase.strings.Level3;

import java.util.Scanner;

public class FrequencyUsingUnique {

    public static char[] uniqueCharacters(String text) {

        char[] unique = new char[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {

            boolean found = false;

            for (int j = 0; j < i; j++) {

                if (text.charAt(i) == text.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                unique[index++] = text.charAt(i);
            }
        }

        char[] result = new char[index];

        for (int i = 0; i < index; i++) {
            result[i] = unique[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char[] unique = uniqueCharacters(text);

        System.out.println("Character\tFrequency");

        for (char ch : unique) {
            System.out.println(ch + "\t\t" + freq[ch]);
        }

        sc.close();
    }
}