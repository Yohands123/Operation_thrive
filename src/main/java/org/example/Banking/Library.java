package org.example.Banking;
import java.util.ArrayList;
import java.util.List;
public class Library {
    private List<Book> catalog = new ArrayList<>();

    public void addBook(Book book) {
        catalog.add(book);
    }

    public Book searchByTitle(String title) {
        for (Book book : catalog) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book; // Found the book
            }
        }
        return null; // Book not found in the catalog
    }

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Book A", "Author A", "123456789");
        Book book2 = new Book("Book B", "Author B", "987654321");

        library.addBook(book1);
        library.addBook(book2);

        String searchTitle = "Book A";
        Book foundBook = library.searchByTitle(searchTitle);

        if (foundBook != null) {
            System.out.println("Book found: " + foundBook.getTitle());
        } else {
            System.out.println("Book not found: " + searchTitle);
        }
    }

}
