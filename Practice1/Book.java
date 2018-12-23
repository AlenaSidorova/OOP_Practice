package Practice1;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public Book(){}
    String getTitle() {
        return title;
    }
    String getAuthor() {
        return title;
    }
    void setAuthor(String author) {
        this.author = author;
    }
    void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString()
    {
        return "Title: " + this.title + "\n" + "Author: " + this.author + "\n";
    }
}
