import java.util.*;
class addition{

    int add(int a,int b)
    {
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }

}
public class add{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            addition total=new addition();
            System.out.print("enter a firsrt num(a)=");
            int a=sc.nextInt();

            System.out.print("enter second value(b)=");
            int b=sc.nextInt();

           System.out.print("enter third value(c)=");
           int c=sc.nextInt(); 

            System.out.println("total of a+b is "+total.add(a, b));
            System.out.println("total of a+b+c is "+total.add(a, b, c));
        }
    
}
