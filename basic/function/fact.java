import java.util.*;
public class fact {

    static int factorial(int n)
    {
        int fact=1,i;
        for(i=1;i<=n;i++)
        {
            fact=fact*i;    
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.println("enter last value for find factorial=");
        int n=sc.nextInt();

        int result=factorial(n);
        System.out.println("factorial="+result);
        sc.close();
    }
}
