
import java.util.*;

class user {

    String name, branch;
    int accno;
    double balance;

}

class detail extends user {

    void getdetail() {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your name=");
        sc.nextLine();
        name = sc.nextLine();

        System.out.print("enter your account number=");
        accno = sc.nextInt();

        System.out.print("enter your bank branch name=");
        sc.nextLine();
        branch = sc.nextLine();

        System.out.print("enter your current balance=");
        balance = sc.nextDouble();
    }

    void calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.deposit");
        System.out.println("2.withdraw");
        System.out.print("enter your choice=");
        int ch = sc.nextInt();

        if (ch == 1) {
            System.out.print("enter amount for deposit=");
            double damt = sc.nextDouble();

            balance = balance + damt;
        } else {
            System.out.print("enter amount for withdraw=");
            double wamt = sc.nextDouble();

            if (wamt > balance) {
                System.out.println("your balance is low !");
            } else {
                balance = balance - wamt;
            }
        }

    }

}

class display extends detail {

    void show() {
        System.out.println("name=" + name);
        System.out.println("account no=" + accno);
        System.out.println("branch="+branch);
        System.out.println("total current balnace="+balance);

    }

}
public class bank{

    public static void main(String[] args) {
        
        display d=new display();

        d.getdetail();
        d.calculate();
        d.show();
    }
}