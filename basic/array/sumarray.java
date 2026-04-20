import java.util.Scanner;
public class sumarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int arr[]= new int[10];

        System.out.println("find sum of array");
        System.out.println("enter element in array");

        for (int i = 0; i < 10; i++) 
            {
                arr[i]=sc.nextInt();
                
            }
        int sum=0;
        for( int i=0;i<10;i++)
            {
                 sum=sum+arr[i];
            }
        System.out.println("sum of array="+sum);
        

            
        
    }
    
}
