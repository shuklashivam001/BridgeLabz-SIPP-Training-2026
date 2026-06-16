package core_java_practice.core_java_practice.gcr_codebase.methods.Level2;

import java.util.Scanner;

public class NumberAnalysis {

    public static boolean isPositive(int n) {
        return n >= 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int n1, int n2) {

        if (n1 > n2)
            return 1;
        else if (n1 == n2)
            return 0;
        else
            return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number: ");
            numbers[i] = sc.nextInt();
        }

        for (int n : numbers) {

            if (isPositive(n)) {

                if (isEven(n))
                    System.out.println(n + " is Positive Even");
                else
                    System.out.println(n + " is Positive Odd");

            } else {
                System.out.println(n + " is Negative");
            }
        }

        int result = compare(numbers[0], numbers[4]);

        if (result == 1)
            System.out.println("First element is Greater");
        else if (result == 0)
            System.out.println("Both are Equal");
        else
            System.out.println("First element is Smaller");
    }
}