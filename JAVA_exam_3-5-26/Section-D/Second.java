import java.util.*;

public class Second {

    void check_prime()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("===check wether number is prime or not===");
        System.out.print("enter a number=");
        int num=sc.nextInt();
        int find=1;

        for(int i=2;i<num/2;i++)
        {
            if(num%i==0)
            {
                find=0;
                break;
            }
        }
        if(find==1)
        {
            System.out.println("number is prime!");
        }
        else
        {
            System.out.println("number is not prime!");
        }
    }
    public static void main(String[] args) {
        
        Second obj=new Second();
        obj.check_prime();
    }
    
}
