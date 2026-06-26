package oops_practice.oops_practice.gcr_codebase.polymorphism.scenario_based;

class Vehicle {
    void fuelCost(int km) {
        System.out.println("Fuel cost calculation");
    }
}

class Car extends Vehicle {
    void fuelCost(int km) {
        System.out.println("Car Fuel Cost = " + (km * 8));
    }
}

class Bus extends Vehicle {
    void fuelCost(int km) {
        System.out.println("Bus Fuel Cost = " + (km * 20));
    }
}

class Bike extends Vehicle {
    void fuelCost(int km) {
        System.out.println("Bike Fuel Cost = " + (km * 3));
    }
}

class ElectricCar extends Vehicle {
    void fuelCost(int km) {
        System.out.println("Electric Car Charging Cost = " + (km * 2));
    }
}

public class TransportDemo {
    public static void main(String[] args) {

        Vehicle[] fleet = {
                new Car(),
                new Bus(),
                new Bike(),
                new ElectricCar()
        };

        for (Vehicle v : fleet) {

            if (v instanceof Car)
                ((Car) v).fuelCost(50);

            else if (v instanceof Bus)
                ((Bus) v).fuelCost(50);

            else if (v instanceof Bike)
                ((Bike) v).fuelCost(50);

            else if (v instanceof ElectricCar)
                ((ElectricCar) v).fuelCost(50);
        }
    }
}