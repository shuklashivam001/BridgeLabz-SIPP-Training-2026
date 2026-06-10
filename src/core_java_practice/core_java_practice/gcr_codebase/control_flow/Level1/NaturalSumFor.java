package core_java_practice.core_java_practice.gcr_codebase.control_flow.Level1;

import java.util.Scanner;

public class NaturalSumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0) {
            int formulaSum = n * (n + 1) / 2;

            int loopSum = 0;

            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            System.out.println("Sum using formula = " + formulaSum);
            System.out.println("Sum using for loop = " + loopSum);
            System.out.println("Both results are equal: "
                    + (formulaSum == loopSum));
        } else {
            System.out.println("Not a natural number");
        }
    }
}
