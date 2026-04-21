import java.util.Scanner;

class pay{
    void paym(double amount)
    {
        System.out.println("proccessing payment....");
    }
}
class UPI extends pay{
    void paym(double amount)
    {
        System.out.println("paid rupee "+ amount+" using UPI ");
    }
}
class CreditCard extends pay{
        void paym(double amount)
        {
            System.out.println("paid rupee"+amount+" using credit card");
        }
}
class cash extends pay{
        void paym(double amount)
        {
            System.out.println("paid rupee"+amount+"using cash");
        }
}
public class Payment{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        pay p;

        System.out.println("---SELECT PAYMENT METHOD---");
        System.out.println("1.UPI");
        System.out.println("2.Credit Card");
        System.out.println("3.cash");

        System.out.println("enter your choice=");
        int ch=sc.nextInt();

        System.out.print("enter amount=");
        double amount=sc.nextDouble();

        if(ch==1)
        {
            p=new UPI();
            
        }
        else if(ch==2)
        {
            p=new CreditCard();
        }
        else
        {
            p=new cash();
        }

        p.paym(amount);
    }
}