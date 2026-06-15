package core_java_practice.core_java_practice.gcr_codebase.strings.Level3;

import java.util.Scanner;

public class FrequencyNestedLoop {

    public static String[] findFrequency(String text) {

        char[] chars = text.toCharArray();
        int[] frequency = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {

            frequency[i] = 1;

            for (int j = i + 1; j < chars.length; j++) {

                if (chars[i] == chars[j]) {
                    frequency[i]++;
                    chars[j] = '0';
                }
            }
        }

        String[] result = new String[chars.length];

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] != '0') {
                result[i] = chars[i] + " -> " + frequency[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[] result = findFrequency(text);

        for (String s : result) {
            if (s != null) {
                System.out.println(s);
            }
        }

        sc.close();
    }
}