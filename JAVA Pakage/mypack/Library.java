package mypack;

public class Library {

    public void issueBook(Book b) {
        if (b.isIssued) {
            System.out.println("Book already issued!");
        } else {
            b.isIssued = true;
            System.out.println("Book issued successfully.");
        }
    }

    public void returnBook(Book b) {
        if (!b.isIssued) {
            System.out.println("Book was not issued.");
        } else {
            b.isIssued = false;
            System.out.println("Book returned successfully.");
        }
    }

    public void display(Book b) {
        System.out.println("Book ID: " + b.bookId);
        System.out.println("Title: " + b.title);
        System.out.println("Issued: " + b.isIssued);
    }
}