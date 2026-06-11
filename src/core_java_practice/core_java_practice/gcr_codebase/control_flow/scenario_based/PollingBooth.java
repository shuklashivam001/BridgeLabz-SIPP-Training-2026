package core_java_practice.core_java_practice.gcr_codebase.control_flow.scenario_based;

import java.util.*;

public class PollingBooth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int candidate1 = 0;
        int candidate2 = 0;
        int candidate3 = 0;

        while (true) {
            System.out.print("Enter age (or -1 to exit): ");
            int age = scan.nextInt();

            // Special code to stop voting
            if (age == -1) {
                break;
            }

            // Check eligibility
            if (age >= 18) {
                System.out.println("1. Candidate A");
                System.out.println("2. Candidate B");
                System.out.println("3. Candidate C");
                System.out.print("Enter your vote (1-3): ");
                int vote = scan.nextInt();

                switch (vote) {
                    case 1:
                        candidate1++;
                        System.out.println("Vote recorded for Candidate A.");
                        break;
                    case 2:
                        candidate2++;
                        System.out.println("Vote recorded for Candidate B.");
                        break;
                    case 3:
                        candidate3++;
                        System.out.println("Vote recorded for Candidate C.");
                        break;
                    default:
                        System.out.println("Invalid vote!");
                }
            } else {
                System.out.println("Not eligible to vote.");
            }
        }

        System.out.println("\n----- Election Results -----");
        System.out.println("Candidate A: " + candidate1 + " votes");
        System.out.println("Candidate B: " + candidate2 + " votes");
        System.out.println("Candidate C: " + candidate3 + " votes");
    }
}
