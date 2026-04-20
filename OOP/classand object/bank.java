import java.util.*;
public class bank {
    
    int accNo;
    String name;
    double balance;

    void getdata()
    {
        Scanner sc=new Scanner (System.in);

        System.out.println("enter account number=");
        accNo=sc.nextInt();

        System.out.println("enter name=");
        sc.nextLine();
        name=sc.nextLine();

        System.out.println("enter your balance=");
        balance=sc.nextDouble();
    }
    void deposit(double amt)
    {
        balance=balance+amt;
    }
    void withdraw(double amt)
    {
        if(balance>amt)
        {
            balance=balance-amt;
            System.out.println("withdraw sucess!");
        }
        else{
            System.out.println("amount more than balance!");
        }
    }
    void display()
    {
        System.out.println("===detail===");
        System.out.println("name="+name);
        System.out.println("account numner="+accNo);
        System.out.println("avilable balance="+balance);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        bank b=new bank();
        b.getdata();
        System.out.println("select for further process");
        System.out.println("1.deposit");
        System.out.println("2.withdrraw");
        System.out.println("choice?");
        int choice=sc.nextInt();

        switch(choice){

            case 1:
                {
                    System.out.print("enter value for deposit=");
                    double d=sc.nextDouble();
                    b.deposit(d);
                    break;
                }
            case 2:
                {
                    System.out.println("enter value for withdraw=");
                    double w=sc.nextDouble();
                    b.withdraw(w);
                    break;
                }
            default:
                {
                    System.out.println("enter valid choice!");
                }
        }
        b.display();

    }
}
