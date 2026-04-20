import java.util.Scanner;
public class rev {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("reverce array");

        //input
        int arr[]=new int[10];
        System.out.println("enter element in array");

        for (int i = 0; i < 10; i++) 
        {
            arr[i]=sc.nextInt();    
        }
        //print reverce
        System.out.println("reverce value");
        for(int i=9;i>=0;i--)
        {
            System.out.println(arr[i]);
        }

    }
    
}
