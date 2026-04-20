import java.util.Scanner;

public class LargestofThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("find largest value from three number");

        System.out.print("enter A=");
        int a=sc.nextInt();

        System.out.print("enter B=");
        int b=sc.nextInt();

        System.out.print("enter C=");
        int c=sc.nextInt();

        if(a>b)
        {
            if(a>c)
                {
                    System.out.println("A is bigger!");
                } 
            else
                {
                    System.out.println("C is bigger!");
                }           
        }
        else
        {
            if(b>c)
            {
                    System.out.println("B is bigger!");                
            }
            else
            {
                    System.out.println("C is bigger!");
            }
        }
        }
    
}
