import java.util.*;
public class two_value {
    int a,b;
    
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        two_value obj1 =new two_value();
        two_value obj2 =new two_value();

        System.out.print("enter value 1=");
        obj1.a=sc.nextInt();
        System.out.print("enter value 2=");
        obj2.b=sc.nextInt();

        System.out.println("value1="+obj1.a);
        System.out.println("value2="+obj2.b);



    }
}
