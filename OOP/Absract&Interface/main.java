import java.util.*;

abstract class shape
{
    abstract void calculate();
    
}
class circle extends shape
{
    double r;
     
    circle(double r)
    {
        this.r=r;
    }
    void calculate()
    {
        System.out.println("area of circle="+(3.14*r*r));
    }
}
class squre extends shape
{
    double l;

    squre(double l)
    {
        this.l=l;
    }
    void calculate()
    {
        System.out.println("area of squre="+(l*l));
    }
}
class rectangle extends shape
{
    double l,w;

    rectangle(double l,double w)
    {
        this.l=l;
        this.w=w;
    }
    void calculate()
    {
        System.out.println("area of rectangle="+(l*w));
    }
}

public class main{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);

        System.out.println("===find area===");
        System.out.println("1.circle");
        System.out.println("2.squre");
        System.out.println("3.rectangle");
        System.out.print("enter your choic=");
        int ch=sc.nextInt();

        switch (ch)
        {
            case 1:
                {
                    System.out.print("enter radius=");
                    double r=sc.nextDouble();
                    circle c=new circle(r);
                    c.calculate();
                    break;
                }
                case 2:
                {
                        System.out.print("enter length=");
                        double l=sc.nextDouble();
                        squre s=new squre(l);
                        s.calculate();
                        break;
                }
                case 3:
                    {
                        System.out.print("enter length=");
                        double l=sc.nextDouble();
                        System.out.println("enter width=");
                        double w=sc.nextDouble();
                        rectangle r=new rectangle(l, w);
                        r.calculate();
                        break;
                    }        
                default:
                    {
                        System.out.println("enter valid choice!");
                    }

        }
    }
}