package core_java_practice.core_java_practice.gcr_codebase.recursion;

public class SumOfNatural {
    static int sum(int n) {
        if (n == 1)
            return 1;
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}