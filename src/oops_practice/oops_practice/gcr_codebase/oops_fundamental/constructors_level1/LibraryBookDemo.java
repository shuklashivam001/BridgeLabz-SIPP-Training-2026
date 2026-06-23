package oops_practice.oops_practice.gcr_codebase.oops_fundamental.constructors_level1;

class Book2 {
    String title;
    String author;
    double price;
    boolean available;

    Book2(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book Borrowed Successfully.");
        } else {
            System.out.println("Book Not Available.");
        }
    }

    void display() {
        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Price       : " + price);
        System.out.println("Availability: " + available);
    }
}

public class LibraryBookDemo {
    public static void main(String[] args) {
        Book2 b = new Book2("Python Basics", "ABC", 350, true);

        b.display();
        b.borrowBook();
        b.display();
    }
}