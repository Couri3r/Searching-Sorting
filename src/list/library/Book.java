package list.library;

public class Book {
    private String title;
    private String isbn;

    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    public String getTitle() {
        return this.title;
    }

    public String getISBN() {
        return this.isbn;
    }

    // This method checks if two objects are equal
    // Two books are equal if they have same title and same ISBN
    public boolean equals(Object other) {
        boolean returnValue = false;
        if(other instanceof Book) {
            Book otherBook = (Book) other;
            if(otherBook.getTitle().equalsIgnoreCase(title) &&
                    otherBook.getISBN().equals(isbn)) {
                returnValue = true;
            }
        }
        return returnValue;
    }

    public String toString() {
        return title + "(" + isbn + ")";
    }


    public static void main(String[] args) {
        Book b1  = new Book("Java", "123");
        Book b2  = new Book("Java", "12345");
        Book b3  = new Book("Java", "123");

        System.out.println(b1.equals(b3));
        System.out.println(b1.equals(b2));
    }
}
