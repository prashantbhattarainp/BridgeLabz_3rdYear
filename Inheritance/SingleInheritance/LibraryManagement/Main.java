package SingleInheritance.LibraryManagement;

public class Main {
    public static void main(String[] args) {
        // Creating an object of Author (which is also a Book)
        Author author = new Author(
            "The Art of Coding",
            2023,
            "Alice Johnson",
            "Alice is a software engineer and writer passionate about clean code."
        );

        // Display details
        author.displayInfo();
    }
}
