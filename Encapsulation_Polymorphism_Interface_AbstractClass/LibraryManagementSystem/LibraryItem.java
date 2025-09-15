package Encapsulation_Polymorphism_Interface_AbstractClass.LibraryManagementSystem;

// Abstract class for library items
public abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private String borrower; // Sensitive information (encapsulation)

    // Constructor
    public LibraryItem(String itemId, String title, String author) {
        setItemId(itemId);
        setTitle(title);
        setAuthor(author);
        this.borrower = null; // initially not borrowed
    }

    // Encapsulation with validation
    public String getItemId() {
        return itemId;
    }

    private void setItemId(String itemId) {
        if (itemId == null || itemId.isEmpty()) {
            throw new IllegalArgumentException("Item ID cannot be null or empty.");
        }
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty.");
        }
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    private void setAuthor(String author) {
        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("Author cannot be null or empty.");
        }
        this.author = author;
    }

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        if (borrower == null || borrower.isEmpty()) {
            throw new IllegalArgumentException("Borrower cannot be null or empty.");
        }
        this.borrower = borrower;
    }

    public void clearBorrower() {
        this.borrower = null;
    }

    // Abstract method
    public abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
        System.out.println("Borrower: " + (borrower == null ? "Available" : borrower));
    }
}

