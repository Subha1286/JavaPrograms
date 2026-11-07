// Exp-03 Q4: Class composition with Author and Book
class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public char getGender() { return gender; }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Author getAuthor() { return author; }
    public void setAuthor(Author author) { this.author = author; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getQtyInStock() { return qtyInStock; }
    public void setQtyInStock(int qtyInStock) { this.qtyInStock = qtyInStock; }
}

public class Q4_BookAuthorComposition {
    public static void main(String[] args) {
        Author author = new Author("J.K. Rowling", "jk.rowling@mail.com", 'F');
        Book book = new Book("Harry Potter and the Sorcerer's Stone", author, 929.99, 150);

        System.out.println("--- Book Details ---");
        System.out.println("Title: " + book.getName());
        System.out.println("Price: ₹" + book.getPrice());
        System.out.println("Quantity in Stock: " + book.getQtyInStock());

        System.out.println("\n--- Author Details ---");
        System.out.println("Author Name: " + book.getAuthor().getName());
        System.out.println("Author Email: " + book.getAuthor().getEmail());
        System.out.println("Author Gender: " + book.getAuthor().getGender());
    }
}
