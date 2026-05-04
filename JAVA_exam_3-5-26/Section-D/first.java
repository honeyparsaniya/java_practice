
import java.util.*;
public class first {

     void calculator()

    {

        Scanner sc=new Scanner(System.in);

        System.out.println("===calculator===");
        System.out.println("1.addition");
        System.out.println("2.substraction");
        System.out.println("3.multiplication");
        System.out.println("multiplication");

        System.out.print("enter your choice(1-4)=");
        int choice=sc.nextInt();
        System.out.print("enter first value=");
        int a=sc.nextInt();

        System.out.print("enter second value=");
        int b=sc.nextInt();
        
        switch(choice)
        {
            case 1:
                {
                    System.out.println("addition="+(a+b));
                    break;
                }
            case 2:
                {
                    System.out.println("substraction="+(a-b));
                    break;
                }
            case 3:
                {
                    System.out.println("multiplication="+(a*b));
                    break;
                }
            case 4:
                {
                    if(b==0)
                    {
                        System.out.println("not divide by zero!");
                    }
                    else
                    {
                        System.out.println("division="+(a/b));
                        break;
                    }
                }
            default:
                {
                        System.out.println("enter valid choice!");
                        break;
                }     
        }

    }
    public static void main(String[] args) {

        
        Scanner sc=new Scanner(System.in);
        first obj=new first();
        obj.calculator();



        
    }
    
}
