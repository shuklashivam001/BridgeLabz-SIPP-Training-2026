package core_java_practice.core_java_practice.gcr_codebase.strings.Level1;

public class NullPointerDemo {

    public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    public static void handleException() {

        String text = null;

        try {
            System.out.println(text.length());
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException Handled");
        }
    }

    public static void main(String[] args) {

        // generateException();

        handleException();
    }
}