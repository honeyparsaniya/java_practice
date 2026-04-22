package mypack;

import java.util.Scanner;

public class Student {
    int m1, m2, m3,id;

    public void getData() {
        Scanner sc = new Scanner(System.in);


        System.out.println("enter ID=");
        id=sc.nextInt();

        System.out.print("Enter marks 1: ");
        m1 = sc.nextInt();

        System.out.print("Enter marks 2: ");
        m2 = sc.nextInt();

        System.out.print("Enter marks 3: ");
        m3 = sc.nextInt();
    }

    public void result() {
        int total = m1 + m2 + m3;
        double per = total / 3.0;

        System.out.println("---student detail---");
        System.out.println("Id="+id);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + per);

        if (per >= 75) {
            System.out.println("Grade A");
        } else if (per >= 50) {
            System.out.println("Grade B");
        } else {
            System.out.println("Fail");
        }
    }
}