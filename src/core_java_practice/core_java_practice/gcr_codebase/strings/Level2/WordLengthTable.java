package core_java_practice.core_java_practice.gcr_codebase.strings.Level2;

import java.util.Scanner;

public class WordLengthTable {

    public static String[] splitWords(String text) {
        return text.split(" ");
    }

    public static int findLength(String word) {

        int count = 0;

        try {
            while (true) {
                word.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }

        return count;
    }

    public static String[][] getWordDetails(String[] words) {

        String[][] details = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            details[i][0] = words[i];
            details[i][1] = String.valueOf(findLength(words[i]));
        }

        return details;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[][] result =
                getWordDetails(splitWords(text));

        System.out.println("Word\tLength");

        for (String[] row : result) {
            System.out.println(row[0] + "\t" +
                    Integer.parseInt(row[1]));
        }

        sc.close();
    }
}