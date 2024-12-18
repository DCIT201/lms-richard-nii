public class Patron {
    private String name;
    private int id;
    private int borrowedBooksCount;

    public Patron(String name, int id) {
        this.name = name;
        this.id = id;
        this.borrowedBooksCount = 0;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getBorrowedBooksCount() {
        return borrowedBooksCount;
    }
    public void incrementBorrowedBooks(int booksCount) {
        this.borrowedBooksCount += booksCount;
    }
    public void decrementBorrowedBooksCount(int booksCount) {
        if (booksCount > 0) {
            this.borrowedBooksCount -= booksCount;
        }
    }
}
