import java.util.*;
public class first{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("===question-1===");

        System.out.print("enter total subject=");
        int n=sc.nextInt();
        int sum=0;

        for(int i=0;i<n;i++)
        {
            System.out.print("enter mark=");
            sum=sum+sc.nextInt();
        }
        int avg= sum/n;
        System.out.println("result="+avg);

        System.out.println("===result===");
        if(avg>70)
        {
            System.out.println("pass with grade A");
        }
        else if(avg>50)
        {
            System.out.println("pass with grade B");
        }
        else if(avg>35)
        {
            System.out.println("pass with grade C");
        }
        else
        {
            System.out.println("sorry,FAIL!");
        }
    }
}