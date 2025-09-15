package Encapsulation_Polymorphism_Interface_AbstractClass.LibraryManagementSystem;

public class DVD extends LibraryItem implements Reservable {

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // DVDs can be loaned for 3 days
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

