import java.util.*;

public class second {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("===ATM pin===");

        System.out.print("enter your pin=");
        int pin=sc.nextInt();

        System.out.println("===verify your pin===");
        int atempt=3;
        while(atempt>0)
        {
            System.out.print("enter pin=");
            int userpin=sc.nextInt();

            if(userpin==pin)
            {
                System.out.println("verification complate!");
                break;
            }
            else
            {
                System.out.println("sorry wrong!");
                atempt--;
            }
        }
    }
}
