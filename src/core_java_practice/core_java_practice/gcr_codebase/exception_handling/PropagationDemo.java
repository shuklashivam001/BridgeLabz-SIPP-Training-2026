package core_java_practice.core_java_practice.gcr_codebase.exception_handling;

public class PropagationDemo {

    static void method1() {
        int x = 10 / 0;
    }

    static void method2() {
        method1();
    }

    public static void main(String[] args) {

        try {
            method2();
        }
        catch (ArithmeticException e) {
            System.out.println(
                    "Handled exception in main");
        }
    }
}