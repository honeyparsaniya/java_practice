import java.util.*;
class area{
    area()
    {
        System.out.println("calculate area");
    }
}
class circle extends area{

        double pi=3.14;
        double r;
        void calculate()
        {
            Scanner sc= new Scanner(System.in);
            System.out.print("enter radious of circle= ");
            r=sc.nextDouble();

            double total=pi*r*r;
            System.out.println("area of circle="+total);
        }


}
class squre extends area{

    int l;
    void calculate()
    {
            Scanner sc=new Scanner(System.in);
            
            System.out.print("enter length of squre=");
            l=sc.nextInt();

            int total=l*l;

            System.out.println("area of squre="+total);
    }
}
public class shape{
    public static void main(String[] args) {
        
        circle c=new circle();
        c.calculate();

        squre s=new squre();
        s.calculate();
    }
}