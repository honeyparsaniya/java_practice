import java.util.*;
class DivideByZero{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        try {
            System.out.print("enter a=");
            int a=sc.nextInt();

            System.out.print("enter b=");
            int b=sc.nextInt();

            int c=a/b;
            System.out.println("result="+c);
            
        } 
        catch (ArithmeticException e) {
                System.out.println("error=does not divide by zero");
        }

    }
}
