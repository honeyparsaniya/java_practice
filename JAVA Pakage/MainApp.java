import mypack.Book;
import mypack.Library;
import java.util.*;

class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        Book b = new Book(id, title);
        Library lib = new Library();

        while (true) {
            System.out.println("\n1. Issue Book");
            System.out.println("2. Return Book");
            System.out.println("3. Display Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    lib.issueBook(b);
                    break;
                case 2:
                    lib.returnBook(b);
                    break;
                case 3:
                    lib.display(b);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}