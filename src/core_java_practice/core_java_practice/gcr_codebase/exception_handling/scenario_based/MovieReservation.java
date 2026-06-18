package core_java_practice.core_java_practice.gcr_codebase.exception_handling.scenario_based;

public class MovieReservation {

    static int[] seats = {101, 102, 103, 104, 105};

    static int getSeat(int index) {

        try {
            return seats[index];
        }
        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid seat position requested.");
            return -1;
        }
    }

    public static void main(String[] args) {

        System.out.println(getSeat(2)); // 103

        System.out.println(getSeat(8)); // -1
    }
}