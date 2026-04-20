import java.util.*;
public class rev {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        List<String> list=new ArrayList<>();

        System.out.println("enter number of name=");
        int n=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++)
        {
            list.add(sc.nextLine());
        }
        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.print(list.get(i)+ " ");
        }
    }
    
}
