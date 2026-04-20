import java.util.*;
public class prime {

    static void check(int n)
    {
        int flag=1;
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                flag=0;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("value is not prime");
        }
        else
        {
            System.out.println("value is prime");
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number to check prime or not=");
        int n=sc.nextInt();

        check(n);
        sc.close();
        
    }
    
}
