package core_java_practice.core_java_practice.gcr_codebase.methods.scenario_based;

public class DeliveryChargeSystem {

    // Distance only
    static double calculateCharge(int distance) {
        return distance * 5;
    }

    // Distance + Weight
    static double calculateCharge(int distance, int weight) {
        return (distance * 5) + (weight * 10);
    }

    // Distance + Weight + Express Delivery
    static double calculateCharge(int distance,
                                  int weight,
                                  boolean expressDelivery) {

        double charge = (distance * 5) + (weight * 10);

        if (expressDelivery)
            charge += 100;

        return charge;
    }

    public static void main(String[] args) {

        System.out.println("Charge 1 = Rs. "
                + calculateCharge(20));

        System.out.println("Charge 2 = Rs. "
                + calculateCharge(20, 5));

        System.out.println("Charge 3 = Rs. "
                + calculateCharge(20, 5, true));
    }
}