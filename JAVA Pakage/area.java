import java.util.*;
import mypack.Shape;
public class area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        
        Shape s=new Shape();
        System.out.println("---select---");
        System.out.println("1.circle");
        System.out.println("2.squre");
        System.out.println("3.rectangle");
        System.out.println("4.exit");

        System.out.print("enter choice=");
        int choice=sc.nextInt();

        if(choice==1)
        {
            s.circle();
        }
        else if(choice==2)
        {
            s.squre();
        }
        else {
            s.rectangle();
        }
    
    
}
