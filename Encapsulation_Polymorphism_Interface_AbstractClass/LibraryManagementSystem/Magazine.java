package Encapsulation_Polymorphism_Interface_AbstractClass.LibraryManagementSystem;

public class Magazine extends LibraryItem implements Reservable {

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // Magazines can be loaned for 7 days
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
