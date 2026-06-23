package oops_practice.oops_practice.gcr_codebase.oops_fundamental.constructors_level1;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    CarRental() {
        customerName = "Customer";
        carModel = "Swift";
        rentalDays = 1;
    }

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateCost() {
        return rentalDays * 1500;
    }

    void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model    : " + carModel);
        System.out.println("Rental Days  : " + rentalDays);
        System.out.println("Total Cost   : " + calculateCost());
    }
}

public class CarRentalDemo {
    public static void main(String[] args) {
        CarRental c1 = new CarRental();
        CarRental c2 = new CarRental("Shivam", "Honda City", 5);

        c1.display();
        System.out.println();
        c2.display();
    }
}