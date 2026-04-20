import java.util.*;

abstract class payment{

    abstract void pay(double amt);
}
class card extends payment{

    void pay(double amt){

        double total=amt+(amt*0.2);
        System.out.println("creditcard payment ="+total);
    }
}
class UPI extends payment{

    void pay(double amt){

        if(amt<100000)
        {
            System.out.println("UPI payment="+amt);
        }
        else{
            System.out.println("limit exceed");
        }
    }
}
public class Payment{
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);

        payment p;

        System.out.print("enter amount=");
        double amt=sc.nextDouble();

        System.out.println("1.credit card\n2.UPI");
        System.out.print("enter your choice=");
        int choice=sc.nextInt();

        if (choice==1)
        {
            p=new card();
        }
        else{
            p=new UPI();
        }
        p.pay(amt);
    }

}