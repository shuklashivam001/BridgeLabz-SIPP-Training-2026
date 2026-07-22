package dsa.dsa.heap;

import java.util.PriorityQueue;

class Patient {
    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class HospitalTriageSystem {

    static PriorityQueue<Patient> triageQueue =
            new PriorityQueue<>((a, b) -> b.severity - a.severity);

    static void addPatient(Patient patient) {
        triageQueue.offer(patient);
    }

    static Patient treatNextPatient() {
        return triageQueue.poll();
    }

    public static void main(String[] args) {

        addPatient(new Patient("Rahul", 4));
        addPatient(new Patient("Amit", 9));
        addPatient(new Patient("Priya", 6));
        addPatient(new Patient("Neha", 10));
        addPatient(new Patient("Karan", 7));

        System.out.println("Treatment Order:");

        while (!triageQueue.isEmpty()) {
            Patient patient = treatNextPatient();
            System.out.println(patient.name + " -> Severity: " + patient.severity);
        }
    }
}