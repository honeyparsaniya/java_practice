import java.util.*;
import mypack.Account;
import mypack.Bank;
public class MainBank {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.print("enter name=");
        String name=sc.next();
        

        System.out.print("enter account number=");
        int accNo=sc.nextInt();

        System.out.print("enter you balance=");
        double balance=sc.nextDouble();

        Account a = new Account(accNo, name, balance);
        Bank b=new Bank();

        int choice;
        do 
        {
            System.out.println("\n1.deposite");
            System.out.println("2.withdraw");
            System.out.println("3.Show");
            System.out.println("exit");

            System.out.println("enter your choice=");
            choice=sc.nextInt();

            if(choice==1)
            {
                System.out.println("enter amount=");
                double amt=sc.nextDouble();
                b.deposit(a, amt);
            }
            else if(choice==2)
            {
                System.out.println("enter amount=");
                double amt=sc.nextDouble();
                b.withdraw(a, amt);
            }
            else if(choice==3)
            {
                b.show(a);
            }
        }
        while(choice !=4);
    }
    
}
