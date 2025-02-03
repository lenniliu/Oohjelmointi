package teht2_3.Task1;

public class Book {
    private String title;
    private String author;
    private String Genre;

    public Book(String title, String author, String Genre) {
        this.title = title;
        this.author = author;
        this.Genre = Genre;
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
}
