package core_java_practice.core_java_practice.gcr_codebase.exception_handling;

import java.util.*;

public class DivisionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Result = " + (a / b));
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter numeric values only");
        }
    }
}