package core_java_practice.core_java_practice.gcr_codebase.recursion;

public class Factorial {
    static void printNumbers(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        printNumbers(5);
    }
}