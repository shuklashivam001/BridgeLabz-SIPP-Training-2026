package core_java_practice.core_java_practice.gcr_codebase.recursion;

public class Permutations {

    static void permutations(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            String left = str.substring(0, i);
            String right = str.substring(i + 1);

            permutations(left + right, ans + ch);
        }
    }

    public static void main(String[] args) {
        permutations("ABC", "");
    }
}