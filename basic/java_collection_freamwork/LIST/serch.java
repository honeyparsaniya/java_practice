import java.util.*;
public class serch{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<String> list =new ArrayList<>();

        
        System.out.println("enter number of name=");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            String name=sc.nextLine();
            System.out.print("enter name=");
            list.add(name);
        }

        
        System.out.println("enter name that you want to serch =");
        String s=sc.nextLine();

        if(list.contains(s))
        {
            System.out.println("value found in list");
        }
        else{
            System.out.println("falue does not found in string");
        }
        
        
    }
}