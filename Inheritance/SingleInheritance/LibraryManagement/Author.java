package SingleInheritance.LibraryManagement;

class Author extends Book {
    String name;
    String bio;

    // Constructor
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // Call superclass constructor
        this.name = name;
        this.bio = bio;
    }

    // Overriding displayInfo() method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent method to show book info
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}
