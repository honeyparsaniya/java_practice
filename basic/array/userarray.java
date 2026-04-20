import java.util.Scanner;
public class userarray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        int arr[]= new int[10];

        System.out.println("enter aaray element=");

        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("your array is=");

        for(int i=0;i<=10;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
