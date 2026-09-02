// Parent class
class LibraryItem {

    // Public member
    public String title;

    // Protected member
    protected String author;

    // Private member
    // Cannot be directly accessed by subclass
    private double price;

    // LibraryItem constructor
    LibraryItem(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getter for private price
    public double getPrice() {
        return price;
    }
}

// Book inherits LibraryItem
class Book extends LibraryItem {

    String publisher;
    int edition;

    // Book constructor
    Book(String title, String author, double price,
         String publisher, int edition) {

        // Calling parent constructor
        super(title, author, price);

        this.publisher = publisher;
        this.edition = edition;
    }

    // Display complete book information
    void displayBook() {

        System.out.println("Book Details");
        System.out.println("------------");

        // Public inherited member
        System.out.println("Title     : " + title);

        // Protected inherited member
        System.out.println("Author    : " + author);

        // Book's own members
        System.out.println("Publisher : " + publisher);
        System.out.println("Edition   : " + edition);

        // Private price accessed through getter
        System.out.println("Price     : " + getPrice());
    }
}

// Main class
public class Task5_LibraryItem_Book {

    public static void main(String[] args) {

        // Creating Book object
        Book b = new Book(
            "Java Programming",
            "Herbert Schildt",
            650.0,
            "McGraw Hill",
            12
        );

        // Display book details
        b.displayBook();
    }
}