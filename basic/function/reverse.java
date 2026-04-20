import java.util.*;
public class reverse {
        
    static int check(int num)
    {
        int rev=0;
        while(num!=0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("entr a number=");
        int num=sc.nextInt();
        int temp=num;
        int result=check(num);
            System.out.println("answer="+result);

        if(result==temp)
        {
                System.out.println("value is palidrom");
        }
        else
        {
                System.out.println("value is not palidrom");
        }
    }
}
