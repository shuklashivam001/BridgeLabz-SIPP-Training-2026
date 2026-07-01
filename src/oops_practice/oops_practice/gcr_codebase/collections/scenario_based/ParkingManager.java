package oops_practice.oops_practice.gcr_codebase.collections.scenario_based;

import java.util.ArrayList;

public class ParkingManager {
    static ArrayList<String> vehicles = new ArrayList<>();

    static void addVehicle(String number) {
        vehicles.add(number);
        System.out.println(number + " entered.");
    }

    static void removeVehicle(String number) {
        if (vehicles.remove(number)) {
            System.out.println(number + " exited.");
        } else {
            System.out.println("Vehicle not found.");
        }
    }

    static void searchVehicle(String number) {
        if (vehicles.contains(number)) {
            System.out.println("Vehicle is parked.");
        } else {
            System.out.println("Vehicle not found.");
        }
    }

    static void displayVehicles() {
        System.out.println("Parked Vehicles:");

        for (String v : vehicles) {
            System.out.println(v);
        }

        System.out.println("Occupied Slots: " + vehicles.size());
    }

    public static void main(String[] args) {
        addVehicle("UP32AB1234");
        addVehicle("DL10CD5678");
        addVehicle("MP09EF1111");

        searchVehicle("DL10CD5678");

        removeVehicle("UP32AB1234");

        displayVehicles();
    }
}