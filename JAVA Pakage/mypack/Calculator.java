package mypack;
import java.util.Scanner;
public class Calculator{

    int a,b;

    public void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first value=");
        a=sc.nextInt();

        System.out.print("enter second value=");
        b=sc.nextInt();
    } 
   public void add()
    {
        System.out.println("addition="+(a+b));
    }
    public void sub()
    {
        System.out.println("Substraction="+(a-b));
    }
     public void mul()
    {
        System.out.println("Multiplication="+(a*b));
    }
    public void div()
    {
        if(b<=0){
        System.out.println("not divisable");
        }
        else
        {
            System.out.println("division="+(a/b));
        }
    }
}