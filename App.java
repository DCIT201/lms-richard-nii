public class App {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        Book book1 = new Book("Kaya Girl", "Mamle Wolo");
        Book book2 = new Book("Cockcrow", "John A. Sackey");
        library.addBook(book1);
        library.addBook(book2);

        // Registering patrons
        Patron patron1 = new Patron("Alice", 1);
        Patron patron2 = new Patron("Bob", 2);
        library.addPatron(patron1);
        library.addPatron(patron2);

        // testing the functionality ( borrowing and returning books )
        System.out.println("Patron 1 is borrowing 'Kaya Girl': " + library.borrowBook(book1, patron1));

    }
}
