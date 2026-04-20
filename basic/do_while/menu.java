import java.util.Scanner;

public class menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice, a, b;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {

                System.out.print("Enter value for A: ");
                a = sc.nextInt();

                System.out.print("Enter value for B: ");
                b = sc.nextInt();

                switch(choice) {

                    case 1:
                        System.out.println("Addition = " + (a + b));
                        break;

                    case 2:
                        System.out.println("Subtraction = " + (a - b));
                        break;

                    case 3:
                        System.out.println("Multiplication = " + (a * b));
                        break;

                    case 4:
                        if (b != 0) {
                            System.out.println("Division = " + (a / b));
                        } else {
                            System.out.println("Cannot divide by zero");
                        }
                        break;
                }

            } else if (choice == 5) {
                System.out.println("Program Ended");
            } else {
                System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

       
    }
}