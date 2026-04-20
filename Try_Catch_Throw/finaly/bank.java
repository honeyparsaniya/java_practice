import java.util.Scanner;

public class bank{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);

        try {
                System.out.print("enter you bank balance=");
                double balance=sc.nextDouble();

                System.out.print("enter withdraw amount=");
                double wamount=sc.nextDouble();

                if(wamount>balance)
                {
                        throw new Exception("withdraw amount is more than balance");
                }

                System.out.println("please collect your cash!");
        } catch (Exception e) {
                    System.out.println("error="+e.getMessage());
        }
        finally{
            System.out.println("transection complate!");
        }
        System.out.println("thank you !");
    }
}