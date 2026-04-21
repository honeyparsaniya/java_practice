import java.util.*;
class Shape{

    void area()
    {
        System.out.println("calculate area....");
    }
}
class circle extends Shape{
     double r;

    circle(double r) {

        this.r=r;
    }
    void area()
    {
        System.out.println("area of squre="+(3.14*r*r));
    }
}
class squre extends Shape{

    double l;

    squre(double l) {

        this.l=l;
    }
    void area()
    {
        System.out.println("area of squre="+(l*l));
    }
}
class rectangle extends Shape{

    double l,w;

    rectangle(double l,double w) {

        this.l=l;
        this.w=w;
    }
    void area()
    {
        System.out.println("area of rectangle="+(l*w));
    }
}
public class area
{
        public static void main(String[] args) {
            
        Scanner sc=new Scanner(System.in);

        Shape s;

        System.out.println("---select your choice---");
        System.out.println("1.circle");
        System.out.println("2.squre");
        System.out.println("3.rectangle");

        System.out.print("enter your choice=");
        int ch=sc.nextInt();
        
        if(ch==1){

            System.out.print("enter radius=");
            double r=sc.nextDouble();

            s= new circle(r);
            s.area();
        }
        else if(ch==2)
        {
            System.out.print("enter length=");
            double l=sc.nextDouble();

            s=new squre(l);
            s.area();

        }
        else
        {
            System.out.print("enter length=");
            double l=sc.nextDouble();

            System.out.print("enter width=");
            double w=sc.nextDouble();

            s=new rectangle(l,w);
            s.area();

        }
        }

}
