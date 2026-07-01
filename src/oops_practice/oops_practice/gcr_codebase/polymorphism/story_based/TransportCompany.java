package oops_practice.oops_practice.gcr_codebase.polymorphism.story_based;

class Vehicle {
    void fuelCost(int km) {
        System.out.println("Fuel cost");
    }
}

class Car extends Vehicle {
    void fuelCost(int km) {
        System.out.println("Car Fuel Cost = " + (km * 8));
    }
}

class Bus extends Vehicle {
    void fuelCost(int km) {
        System.out.println("Bus Fuel Cost = " + (km * 15));
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

public class TransportCompany {
    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Car(),
                new Bus(),
                new Bike(),
                new ElectricCar()
        };

        int km = 20;

        for (Vehicle v : vehicles) {

            v.fuelCost(km);

            if (v instanceof Car) {
                Car c = (Car) v;
                System.out.println("This is a Car");
            } else if (v instanceof Bus) {
                Bus b = (Bus) v;
                System.out.println("This is a Bus");
            } else if (v instanceof Bike) {
                Bike b = (Bike) v;
                System.out.println("This is a Bike");
            } else if (v instanceof ElectricCar) {
                ElectricCar e = (ElectricCar) v;
                System.out.println("This is an Electric Car");
            }

            System.out.println();
        }
    }
}