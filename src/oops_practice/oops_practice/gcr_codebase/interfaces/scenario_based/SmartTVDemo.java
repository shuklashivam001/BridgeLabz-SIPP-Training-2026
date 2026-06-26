package oops_practice.oops_practice.gcr_codebase.interfaces.scenario_based;

interface StreamingService {

    void streamMovie();

    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription Active");
    }
}

interface GamingService {

    void playGame();

    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription Active");
    }
}

class SmartTV implements StreamingService, GamingService {

    public void streamMovie() {
        System.out.println("Streaming movie...");
    }

    public void playGame() {
        System.out.println("Playing game...");
    }

    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }
}

public class SmartTVDemo {
    public static void main(String[] args) {

        String[] movies = {
                "Avatar",
                "Inception",
                "Interstellar"
        };

        String[] games = {
                "FIFA",
                "Minecraft",
                "GTA V"
        };

        SmartTV tv = new SmartTV();

        tv.showSubscriptionDetails();

        System.out.println("\nMovies:");
        for (String movie : movies) {
            System.out.println(movie);
        }

        System.out.println("\nGames:");
        for (String game : games) {
            System.out.println(game);
        }
    }
}