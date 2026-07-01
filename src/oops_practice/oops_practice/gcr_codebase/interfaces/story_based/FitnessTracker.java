package oops_practice.oops_practice.gcr_codebase.interfaces.story_based;

interface Trackable {

    void logActivity();

    default void resetData() {
        System.out.println("Fitness data has been reset.");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert();
}

class FitnessDevice implements Trackable, Reportable, Notifiable {

    public void logActivity() {
        System.out.println("Activity logged successfully.");
    }

    public void generateReport() {
        System.out.println("Fitness report generated.");
    }

    public void sendAlert() {
        System.out.println("Health alert sent to the user.");
    }
}

public class FitnessTracker {

    public static void main(String[] args) {

        FitnessDevice device = new FitnessDevice();

        device.logActivity();
        device.generateReport();
        device.sendAlert();
        device.resetData();
    }
}