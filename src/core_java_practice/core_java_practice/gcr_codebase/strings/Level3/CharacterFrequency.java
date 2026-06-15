package core_java_practice.core_java_practice.gcr_codebase.strings.Level3;

import java.util.Scanner;

public class CharacterFrequency {

    public static void frequency(String text) {

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        System.out.println("Character\tFrequency");

        for (int i = 0; i < 256; i++) {

            if (freq[i] > 0) {
                System.out.println((char)i + "\t\t" + freq[i]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        frequency(text);

        sc.close();
    }
}