import java.util.*;
public class third {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("===linear serch===");
        System.out.print("enter size of array=");
        int n=sc.nextInt();

        int arr[]=new int[n];

        //take value
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("enter value=");
            arr[i]=sc.nextInt();
        }
        //ask value for serch
        System.out.print("enter value for serch in array=");
        int se=sc.nextInt();
        int f=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==se)
            {
                System.out.println(se+" found at "+i+" index");
                f=1;
                break;
            }
            
        }
        if(f==0){
            System.out.println("search value not found "+se);
        }
    }
}
