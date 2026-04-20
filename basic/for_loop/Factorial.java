import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("find factorial!");

        System.out.print("enter number=");
        int n=sc.nextInt();

        int fact=1,i;
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial of number="+fact);


    }
    
}
