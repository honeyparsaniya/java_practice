import java.util.*;
public class check {

    static void oddeven(int n)
    {
        if(n%2==0)
        {
            System.out.println("value is even");
        }
        else
        {
            System.out.println("value is odd");
        }
}
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        //take input
        System.out.println("enter a number");
        int n=sc.nextInt();

        oddeven(n);

        sc.close();
    }
    
}
