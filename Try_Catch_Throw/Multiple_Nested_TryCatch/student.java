
import java.util.*;

public class student{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);

        try {
                System.out.println("student exam system");

                System.out.print("enter total mark=");
                int total=sc.nextInt();

                System.out.println("enter obtain mark in exam=");
                int mark=sc.nextInt();

                if(mark>total)
                {
                    throw new Exception("mark can not be greater than total mark");
                }
                try{
                    int per=(mark*100)/total;
                    System.out.println("persentage="+per+"%");
                }
                catch(ArithmeticException e)
                {
                    System.out.println("total can not be zero");
                }
                int arr[]=new int[4];
                arr[5]=10;


        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error=array index error");
        }
        catch(Exception e)
        {
            System.out.println("error="+e.getMessage());

        }
    }
}