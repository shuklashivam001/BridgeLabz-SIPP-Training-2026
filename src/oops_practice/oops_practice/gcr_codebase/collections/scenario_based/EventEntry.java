package oops_practice.oops_practice.gcr_codebase.collections.scenario_based;

import java.util.HashSet;

public class EventEntry {
    static HashSet<String> participants = new HashSet<>();

    static void register(String email) {
        if (participants.add(email)) {
            System.out.println("Registration successful.");
        } else {
            System.out.println("Duplicate registration rejected.");
        }
    }

    static void displayParticipants() {
        System.out.println("Registered Participants:");

        for (String email : participants) {
            System.out.println(email);
        }

        System.out.println("Total Participants: " + participants.size());
    }

    public static void main(String[] args) {
        register("abc@gmail.com");
        register("xyz@gmail.com");
        register("abc@gmail.com");

        displayParticipants();
    }
}