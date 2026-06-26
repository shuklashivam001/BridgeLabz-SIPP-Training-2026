package oops_practice.oops_practice.gcr_codebase.interfaces.scenario_based;

interface TextModeration {

    void checkText(String post);

    default void displayModerationPolicy() {
        System.out.println("No offensive language allowed.");
    }

    static boolean containsRestrictedWords(String post) {
        return post.toLowerCase().contains("bad");
    }
}

interface SpamDetection {

    void checkSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Spam messages are prohibited.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {

    public void checkText(String post) {
        if (TextModeration.containsRestrictedWords(post)) {
            System.out.println(post + " -> Offensive Post");
        }
    }

    public void checkSpam(String post) {
        if (post.toLowerCase().contains("buy now")) {
            System.out.println(post + " -> Spam Post");
        }
    }

    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }
}

public class ModerationDemo {
    public static void main(String[] args) {

        String[] posts = {
                "Hello everyone",
                "Buy Now and get 50% off",
                "You are bad",
                "Welcome to our page"
        };

        ContentModerator moderator = new ContentModerator();

        moderator.displayModerationPolicy();
        System.out.println();

        for (String post : posts) {

            if (post.toLowerCase().contains("buy now")) {
                moderator.checkSpam(post);
            } else if (TextModeration.containsRestrictedWords(post)) {
                moderator.checkText(post);
            } else {
                System.out.println(post + " -> Valid Post");
            }
        }
    }
}