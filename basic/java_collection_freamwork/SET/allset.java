import java.util.*;
public class allset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        HashSet<String> myset=new HashSet<>();

        System.out.println("all program in one ");
        System.out.println("====add value in set===");
        System.out.println("value number=");
        int n=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++)
        {
            myset.add(sc.nextLine());
        }
        System.out.println("set="+myset);

        System.out.println("===remove value in set===");
        System.out.print("enter value ,wnat to remove=");
        String remove=sc.nextLine();

        if(myset.remove(remove))
        {
            System.out.println("successfull remove ");
        }
        else
        {
            System.out.println("error");
        }
        System.out.println("===contain value in set===");
        System.out.println("enter value that you want to check=");
        String con=sc.nextLine();

        if(myset.contains(con))
        {
            System.out.println("value is found");
        }
        System.out.println("now your set="+myset);
    }
}
