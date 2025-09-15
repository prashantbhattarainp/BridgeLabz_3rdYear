package InbuiltFunction.LibrarySystem;

public class LibraryApp {
    public static void main(String[] args) {
        // Create book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "ISBN12345");
        Book book2 = new Book("1984", "George Orwell", "ISBN67890");

        // Display details
        System.out.println("\nBook 1 Details:");
        book1.displayBookDetails();

        System.out.println("\nBook 2 Details:");
        book2.displayBookDetails();

        // Borrow book1
        System.out.println("\nBorrowing Book 1:");
        book1.borrowBook();
        book1.displayBookDetails();

        // Try borrowing book1 again
        System.out.println("\nAttempting to borrow Book 1 again:");
        book1.borrowBook();

        // Return book1
        System.out.println("\nReturning Book 1:");
        book1.returnBook();
        book1.displayBookDetails();
    }
}
