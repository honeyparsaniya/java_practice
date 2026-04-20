import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
public class Leap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("check leap year.");

        System.out.println("enter year=");
        int y=sc.nextInt();

        if(y%400==0)
        {
            System.out.println("year is leap year!");        
        }
        else if(y%100==0)
        {
            System.out.println("year is not leap year!");
        }
        else if(y%4==0)
        {
            System.out.println("year is leap year!");
        }
        else
        {
            System.out.println("year is not leap year");
        }
    }
    
}
