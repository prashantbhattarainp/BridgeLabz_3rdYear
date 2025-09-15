package Encapsulation_Polymorphism_Interface_AbstractClass.LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        LibraryItem book = new Book("B001", "Java Programming", "James Gosling");
        LibraryItem magazine = new Magazine("M001", "Tech Monthly", "Editorial Team");
        LibraryItem dvd = new DVD("D001", "Inception", "Christopher Nolan");

        LibraryItem[] items = {book, magazine, dvd};

        for (LibraryItem item : items) {
            item.getItemDetails();
            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                System.out.println("Available? " + r.checkAvailability());
                if (r.reserveItem("Alice")) {
                    System.out.println("Reserved by Alice.");
                } else {
                    System.out.println("Reservation failed.");
                }
                item.getItemDetails();
            }
            System.out.println("----------------------------");
        }
    }
}

