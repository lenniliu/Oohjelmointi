package teht2_3.Task2;

public class Book {
    private String title;
    private String author;
    private String Genre;
    private boolean borrowed;

    public Book(String title, String author, String Genre, boolean borrowed) {
        this.title = title;
        this.author = author;
        this.Genre = Genre;
        this.borrowed = borrowed;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return Genre;
    }

    public boolean isBorrowed() {
        return borrowed;
    }
}
