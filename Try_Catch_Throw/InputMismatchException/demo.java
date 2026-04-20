import java.util.InputMismatchException;
import java.util.Scanner;

class demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try{
                System.out.println("enter a number=");
                int n=sc.nextInt();

                System.out.println("number="+n);
        }
        catch(InputMismatchException e)
        {
            System.out.println("Error=you enter invalid type");
        }
    }
}