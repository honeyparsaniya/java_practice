package mypack;
import java.util.*;
public class Shape {
     Scanner sc=new Scanner(System.in);
    public void circle()
    
    {
        System.out.print("enter radius=");
        int r=sc.nextInt();

        System.out.println("area of circle="+(3.14*r*r));
    }
    public void squre()
    {
        System.out.print("enter length=");
        int l=sc.nextInt();

        System.out.println("area of squre="+(l*l));
    }
    public void rectangle()
    {
        System.out.print("enter length=");
        int l=sc.nextInt();

        System.out.print("enter width=");
        int w=sc.nextInt();

        System.out.println("area of rectangle="+(l*w));

    }
    
}
