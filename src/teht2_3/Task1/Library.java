package teht2_3.Task1;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Genre: " + book.getGenre());
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("Books by " + author + ":");
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Genre: " + book.getGenre());
            }
        }
    }

    public void findBooksByGenre(String genre) {
        System.out.println("Books in genre " + genre + ":");
        for (Book book : books) {
            if (book.getGenre().equals(genre)) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Genre: " + book.getGenre());
            }
        }

    }

    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", "Fantasy");
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy");
        Book book3 = new Book("Shadow Slave", "GuiltyThree", "Fantasy");
        Book book4 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.displayBooks();
        library.findBooksByAuthor("J.R.R. Tolkien");
        library.findBooksByGenre("Fiction");
    }
}
