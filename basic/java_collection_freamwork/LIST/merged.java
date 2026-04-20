import java.util.*;
public class merged {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        List1<String> list1=new ArrayList<>();
        List2<String> list2=new ArrayList<>();
        

        System.out.println("enter number of name for 1st list=");
        int n1=sc.nextInt();
        sc.nextLine();
        
        for(int i=0;i<n1;i++)
        {
            list1.add(sc.nextLine());
        }

        System.out.println("enter number of name for 2nd list=");
        int n2=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n2;i++)
        {
            list2.add(sc.nextLine());
        }

        list1.addAll(list2);

        System.out.println("new merged string"+ list1);
    }    
}
