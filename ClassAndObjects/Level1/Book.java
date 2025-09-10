
public class Book {

    private String title;
    private String author;
    private double price;


    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }


    public void displayDetails() {
        System.out.println("Title of the Book: " + title);
        System.out.println("Author of the Book: " + author);
        System.out.println("Price of the Book: " + price);
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        Book book1 = new Book("2 States", "Chetan Bhagat", 500);
        Book book2 = new Book("Wings of Fire", "A.P.J. Abdul Kalam", 500);

        book1.displayDetails();
        book2.displayDetails();
    }
}
