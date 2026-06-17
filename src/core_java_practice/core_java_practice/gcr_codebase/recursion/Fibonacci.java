package core_java_practice.core_java_practice.gcr_codebase.recursion;

public class Fibonacci {
    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }
}