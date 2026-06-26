package oops_practice.oops_practice.gcr_codebase.polymorphism.scenario_based;

class Notification {
    String recipientName;
    String message;

    Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    void sendNotification() {
        System.out.println("Notification Sent");
    }
}

class EmailNotification extends Notification {

    EmailNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    void sendNotification() {
        System.out.println("Email sent to " + recipientName + " : " + message);
    }
}

class SMSNotification extends Notification {

    SMSNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    void sendNotification() {
        System.out.println("SMS sent to " + recipientName + " : " + message);
    }
}

class PushNotification extends Notification {

    PushNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    void sendNotification() {
        System.out.println("Push Notification sent to " + recipientName + " : " + message);
    }
}

public class NotificationDemo {
    public static void main(String[] args) {

        Notification[] notifications = {
                new EmailNotification("Aman", "Meeting at 10 AM"),
                new SMSNotification("Riya", "OTP: 456789"),
                new PushNotification("Rahul", "New Offer Available")
        };

        for (Notification n : notifications) {
            n.sendNotification();
        }
    }
}