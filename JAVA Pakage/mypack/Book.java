package mypack;

public class Book{
    int bookId;
    String title;
    boolean isIssued;

    public Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.isIssued = false;
    }
}