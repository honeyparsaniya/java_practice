import java.util.*;
public class order{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try {
                System.out.println("enter your food amount=");
                double famount=sc.nextDouble();

                double amount=500;

                if(amount>famount)
                {
                    throw new Exception("minimum amount for order food is low!");
                }
                System.out.println("order placed successfully");
        } catch (Exception e) {
                System.out.println("error="+e.getMessage());
        }
        finally{
            System.out.println("system closed and cart cleared!");
        }
        System.out.println("thank you!");
    }
}