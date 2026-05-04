
import java.util.*;

public class third {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("===multiplication table===");
        System.out.print("enter number for multiplication table=");
        int num=sc.nextInt();

        for (int i=1;i<=10;i++)
        {
            System.out.println(num+" x "+ i+" = "+(num*i));
            System.out.println("");
        }
    }
}
