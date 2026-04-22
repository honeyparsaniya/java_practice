import java.util.*;

class Student {
    void result(int m1, int m2, int m3) {
        System.out.println("Calculating result...");
    }
}

class ScienceStudent extends Student {
    void result(int m1, int m2, int m3) {
        int total = m1 + m2 + m3;
        double per = total / 3.0;
        System.out.println("Science Student %: " + per);
    }
}

class CommerceStudent extends Student {
    void result(int m1, int m2, int m3) {
        int total = m1 + m2 + m3;
        double per = total / 3.0;
        System.out.println("Commerce Student %: " + per);
    }
}

public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s;
        int choice;

        do {
            System.out.println("\n1 = Science Student");
            System.out.println("2 = Commerce Student");
            System.out.println("3 = Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                s = new ScienceStudent();
            } else if (choice == 2) {
                s = new CommerceStudent();
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice");
                continue;
            }

            System.out.print("Enter 3 marks: ");
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int m3 = sc.nextInt();

            s.result(m1, m2, m3);  

        } while (true);
    }
}