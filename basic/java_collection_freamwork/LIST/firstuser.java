import java.util.*;
public class firstuser {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<String> list=new ArrayList<>();

        System.out.println("enter how many vlue want ");
        int n=sc.nextInt();
        
        
        for(int i=0;i<n;i++)
        {
            String name=sc.nextLine();
            System.out.println("enter name=");
            list.add(name);
        }
        System.out.println("list name="+list);
    }
    
}
