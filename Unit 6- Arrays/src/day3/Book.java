package day3;

public class Book {
    private String author;
    private String title;
    private boolean isBorrowed;

    // Constructor with only title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false; // Sets isBorrowed to false
    }

    // Getter methods
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    // Setter methods
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    // toString method
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
}


