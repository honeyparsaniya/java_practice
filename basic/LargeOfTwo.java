import java.util.Scanner;
public class LargeOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("find largest value from two number ");

        System.out.print("enter value of A=");
        int a=sc.nextInt();

        System.out.print("enter value of B=");
        int b=sc.nextInt();

        if(a>b)
        {
                System.out.println("A is bigger than B");
        }
        else
        {
                System.out.println("B is bigger than");          
        }
    }

    
}
