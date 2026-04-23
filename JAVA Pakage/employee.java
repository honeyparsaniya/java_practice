import java.util.*;
import mypack.salary;

public class employee {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        salary s= new salary();

        System.out.println("---select---");
        System.out.println("1.part time");
        System.out.println("2.fulltime ");

        System.out.println("enter choice=");
        int ch=sc.nextInt();

        if(ch==1){
            s.fulltime();
        }
        else
        {
            s.parttime();
        }

    }
    
}
