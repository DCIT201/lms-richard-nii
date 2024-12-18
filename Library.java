

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Patron> patrons;

    public Library() {
        books = new ArrayList<>();
        patrons = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void addPatron(Patron patron) {
        patrons.add(patron);
    }
    public List<Book> getBooks() {
        return books;
    }
    public List<Patron> getPatrons() {
        return patrons;
    }
    public boolean borrowBook(Book book, Patron patron) {
        if (book.isAvailable() && patrons.contains(patron)) {
            book.setAvailable(false);
            patron.incrementBorrowedBooks(0);
            return true;
        }
        return false;

    }
    public boolean returnBook(Book book, Patron patron) {
        if (book.isAvailable() && patrons.contains(patron)) {
            book.setAvailable(true);
            patron.decrementBorrowedBooksCount(0);
            return true;
        }
        return false;
    }
    public List<Book> getAvailableBooks() {
        return books;
    }
    public List<Patron> getAvailablePatrons() {
        return patrons;
    }
}
