package list.library;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookManager {

    List<Book> booksList = null;

    public BookManager() {
        booksList = new ArrayList<Book>();
    }

    public void add(Book b) {
        booksList.add(b);
    }

    public Book find(String title) {
        for(Book b: booksList) {
            if(b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    // find all the books that contain given keyword in the book title
    public List<Book> findAll(String keyword) {
        List<Book> found = new ArrayList<Book>();
        for(Book b: booksList) {
            if(b.getTitle().indexOf(keyword)>=0) {
                found.add(b);
            }
        }
        return found;
    }
    // Replace the old book with new book
    public void replaceBook(Book oldBook, Book newBook) {
        if (oldBook==null || newBook == null) return;
        int old_book_index = booksList.indexOf(oldBook);
        if (old_book_index != -1) {
            booksList.set(old_book_index, newBook);
        }
    }

    // Remove all the books which contain the given keyword in book title
    public void removeAllBooks(String keyword) {

        // How to remove elements while iterating over the list
        Iterator<Book> iter = booksList.iterator();

        while(iter.hasNext()) {
            Book b = iter.next();
            if (b.getTitle().indexOf(keyword)>=0) {
//                booksList.remove(b); // Don't call remove on the list while iterating using an iterator.
                iter.remove();
            }
        }

        // DONOT USE THIS APPROACH FOR REMOVING WHiLe ITERATING OVER LIST
        // Don't remove from the list while iterating using an iterator over the same list
//        for(Book b: booksList) {
//            if (b.getTitle().indexOf(keyword)>=0) {
//                booksList.remove(b);
//            }
//        }

    }

    public void displayBooks() {
        System.out.println("=================");
        for(Book b: booksList) {
            System.out.println(b);
        }

        // equivalent to above
//        Iterator iter = booksList.iterator();
//        while(iter.hasNext()) {
//            System.out.println(iter.next());
//        }
    }
    public static void main(String[] args) {
        BookManager mgr = new BookManager();
        mgr.add(new Book("Java Book 101", "AS101"));
        mgr.add(new Book("Computer Organization Book", "OG101"));
        mgr.add(new Book("Java Book 201", "AS201"));
        mgr.add(new Book("Data Organization", "DG101"));

        System.out.println(mgr.find("Java Book 201"));
        Book b = mgr.find("Data Organization");
        mgr.replaceBook(b, new Book("Data Based Organization", "DG345"));
        System.out.println(mgr.findAll("Organization"));

        mgr.displayBooks();

        mgr.removeAllBooks("Organization");
        mgr.displayBooks();

    }
}
