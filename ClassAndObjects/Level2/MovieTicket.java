public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "Not Assigned";
        this.price = 0.0;
        this.isBooked = false;
    }

    // Method to book a ticket
    public void bookTicket(String seatNumber, double price) {
        if (isBooked) {
            System.out.println(" House Full! Ticket already booked for " + movieName);
        } else {
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked successfully!");
            displayTicket(); // show ticket immediately after booking
        }
    }

    // Method to display ticket details
    public void displayTicket() {
        if (isBooked) {
            System.out.println(" Movie: " + movieName);
            System.out.println(" Seat Number: " + seatNumber);
            System.out.println(" Price: $" + price);
            System.out.println();
        } else {
            System.out.println(" No ticket booked yet for " + movieName);
        }
    }

    // Main method for testing
   public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Dragon");

        // Before booking
        ticket1.displayTicket();

        // First booking
        ticket1.bookTicket("A10", 120.0);

        // Attempting to book again
        ticket1.bookTicket("B10", 120.0);
        ticket1.bookTicket("A11", 120.0);

        // Final ticket details
        ticket1.displayTicket();
    }
}