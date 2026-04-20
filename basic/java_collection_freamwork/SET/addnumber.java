import java.util.*;
public class addnumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        TreeSet<Integer> num=new TreeSet<>();

        System.out.println("enter how many value want to add=");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("enter number");

        for(int i=0;i<n;i++)
        {
            num.add(sc.nextInt());
        }
        System.out.print("your set is="+num);
        System.out.println("");
        System.out.println("===first element from set===");
        System.out.println(num.first());
        System.out.println("");
        System.out.println("===last element from set===");
        System.out.println(num.last());
        System.out.println("");
        System.out.println("===remove element===");
        System.out.print("enter element that you want to remove=");
        int r=sc.nextInt();
        num.remove(r);
        System.out.println("new set="+num);
        System.out.println("");
        System.out.println("===check value is in set or not===");
        System.out.println("enter value ,want to check");
        int c=sc.nextInt();   
        System.out.println(num.contains(c));
    }
}