package Encapsulation_Polymorphism_Interface_AbstractClass.LibraryManagementSystem;

public class Book extends LibraryItem implements Reservable {

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // Books can be loaned for 14 days
    }

    @Override
    public boolean reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setBorrower(borrowerName);
            return true;
        }
        return false;
    }

    @Override
    public boolean checkAvailability() {
        return getBorrower() == null;
    }
}
