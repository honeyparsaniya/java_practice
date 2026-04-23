package mypack;
import java.util.*;

public class salary {
    Scanner sc=new Scanner(System.in);
        public void fulltime()
        {
            System.out.print("enter salary=");
            int fsal=sc.nextInt();

            System.out.println("total bonus with salry="+(fsal+20000));
        }
        public void parttime()
        {
            System.out.println("enter salry=");
            int psal=sc.nextInt();

            System.out.println("total salry with bonus="+(psal+10000));

        }
}
