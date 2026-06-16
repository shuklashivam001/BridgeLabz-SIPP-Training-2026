package core_java_practice.core_java_practice.gcr_codebase.methods.Level1;

import java.util.Scanner;

public class Handshakes {

    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int handshakes = calculateHandshakes(students);

        System.out.println("Maximum possible handshakes = " + handshakes);
    }
}
