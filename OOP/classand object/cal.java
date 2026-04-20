import java.util.*;
public class cal {
    

    int add(int a,int b)
    {
        return a+b;    
    }
    int sub(int a,int b)
    {
        return a-b;
    }
    int mul(int a,int b)
    {
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int choice;
        
        cal c=new cal();
        do
        {
        System.out.println("===select your choice===");
        System.out.println("1.add");
        System.out.println("2.sub");
        System.out.println("3.mul");
        System.out.println("4.exit");
        System.out.println("choice?");
         choice=sc.nextInt();

        System.out.print("enter a=");
        int a=sc.nextInt();

        System.out.print("Enter b=");
        int b=sc.nextInt();

        switch(choice)
        {
            case 1:
                {
                    System.out.println("addition="+c.add(a, b));
                    break;
                }
            case 2:
                {
                    System.out.println("addition="+c.sub(a, b));
                    break;
                }
            case 3:
                {
                     System.out.println("multiplication="+c.mul(a, b));
                     break;
                }
        } 
    }while(choice!=4);
    }
}
