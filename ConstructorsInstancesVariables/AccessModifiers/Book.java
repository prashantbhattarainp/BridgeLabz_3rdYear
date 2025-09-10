class Book {
    public String ISBN;          // Public
    protected String title;      // Protected
    private String author;       // Private

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter & Setter for private author
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

// Subclass
class EBook extends Book {
    private double fileSize;

    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayDetails() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + 
                           ", Author: " + getAuthor() + ", File Size: " + fileSize + "MB");
    }

    public static void main(String[] args) {
        EBook eb = new EBook("123-XYZ", "Java Programming", "James Gosling", 5.6);
        eb.displayDetails();

        eb.setAuthor("Updated Author"); // modifying private via setter
        eb.displayDetails();
    }
}
