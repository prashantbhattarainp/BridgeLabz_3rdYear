package Encapsulation_Polymorphism_Interface_AbstractClass.LibraryManagementSystem;

// Interface for reservable items
public interface Reservable {
    boolean reserveItem(String borrowerName);
    boolean checkAvailability();
}

