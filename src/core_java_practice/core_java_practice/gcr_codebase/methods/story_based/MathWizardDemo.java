package core_java_practice.core_java_practice.gcr_codebase.methods.story_based;

import java.util.*;

public class MathWizardDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MathWizard wizard = new MathWizard();

        System.out.print("Enter a number to check Prime: ");
        int n = sc.nextInt();

        System.out.println("Is Prime? " + wizard.isPrime(n));

        System.out.print("\nEnter integer for factorial: ");
        int intNum = sc.nextInt();
        System.out.println("Factorial = " + wizard.factorial(intNum));

        System.out.print("\nEnter double for overloaded factorial: ");
        double doubleNum = sc.nextDouble();
        System.out.println("Factorial = " + wizard.factorial(doubleNum));

        System.out.print("\nEnter number of Fibonacci terms: ");
        int terms = sc.nextInt();
        wizard.fibonacci(terms);

        System.out.print("\nEnter two numbers for GCD and LCM: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("GCD = " + wizard.gcd(a, b));
        System.out.println("LCM = " + wizard.lcm(a, b));

        System.out.print("\nEnter base and exponent: ");
        int base = sc.nextInt();
        int exp = sc.nextInt();

        System.out.println("Power = " + wizard.power(base, exp));

        System.out.println("\nScope Demonstration:");
        wizard.demonstrateScope();

        sc.close();
    }
}