package core_java_practice.core_java_practice.gcr_codebase.recursion;

public class StringReverse {
    static String reverse(String str) {
        if (str.length() == 0)
            return "";
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }
}