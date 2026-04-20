import java.util.*;
public class operation2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //first
        System.out.println("enter first string=");
        String s1=sc.nextLine();
        //second
        System.out.println("enter second string=");
        String s2=sc.nextLine();

        //operation on string
        //comper two string
        System.out.println("compare ="+s1.compareTo(s2));
        //equal
         System.out.println("Equals: " + s1.equals(s2));
         //contain
         System.out.println("contain="+s1.contains(s2));
         //start with
         System.out.println("start with="+s1.startsWith(s2));
         //end with 
         System.out.println("end with="+s1.endsWith(s2));
         //index of
         System.out.println("index of'h'"+s1.indexOf('h'));
         //last index
         System.out.println("last index 'a'"+s1.lastIndexOf('a'));
         //



    }
}
