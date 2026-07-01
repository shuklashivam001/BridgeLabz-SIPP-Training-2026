package oops_practice.oops_practice.gcr_codebase.collections.scenario_based;

import java.util.ArrayList;
import java.util.HashMap;

public class AttendanceTracker {
    static HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    static void markAttendance(String subject, String student) {
        if (!attendance.containsKey(subject)) {
            attendance.put(subject, new ArrayList<>());
        }

        ArrayList<String> list = attendance.get(subject);

        if (list.contains(student)) {
            System.out.println(student + " already marked in " + subject);
        } else {
            list.add(student);
            System.out.println(student + " marked present in " + subject);
        }
    }

    static void displayAttendance() {
        for (String subject : attendance.keySet()) {
            ArrayList<String> list = attendance.get(subject);

            System.out.println("\nSubject: " + subject);

            for (String student : list) {
                System.out.println(student);
            }

            System.out.println("Total Students: " + list.size());
        }
    }

    public static void main(String[] args) {
        markAttendance("Java", "Rahul");
        markAttendance("Java", "Ankit");
        markAttendance("Java", "Rahul");

        markAttendance("Python", "Aman");
        markAttendance("Python", "Rahul");

        displayAttendance();
    }
}