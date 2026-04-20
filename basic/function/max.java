import java.util.*;

public class find {
    
    static int show(int a,int b,int c)
    {
        if(a>b && a>c)
        {
            return a;
        }
        else if(b>c)
        {
            return b;
        }
        else
        {
            return c;
        }
    } 
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter three number=");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int result=show(a,b,c);

        System.out.println("maximum number ="+result);

        sc.close();

    }   
}
