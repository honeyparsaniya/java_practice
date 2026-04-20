import java.util.*;
import javax.lang.model.util.ElementScanner14;
public class min {

    static int find(int a,int b,int c)
    {
        if(a<b && a<c)
        {
            return a;
        }
        else if(b<c)
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

        System.out.println("enter a three number=");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int result=find(a,b,c);
        System.out.println("min value="+result);
        sc.close();

    }
    
}
