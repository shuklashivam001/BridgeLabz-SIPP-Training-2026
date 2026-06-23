package oops_practice.oops_practice.gcr_codebase.oops_fundamental.class_and_object_level2;

class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Movie Name : " + movieName);
        System.out.println("Seat No    : " + seatNumber);
        System.out.println("Price      : " + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();

        ticket.bookTicket("Pushpa 2", 15, 250);

        ticket.displayDetails();
    }
}