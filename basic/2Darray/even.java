import java.util.Scanner;
public class even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //take size of matrix
        System.out.print("enter value for row:");
        int r=sc.nextInt();
        System.out.print("enter value for column:");
        int c=sc.nextInt();
        
        int arr[][] =new int[r][c];
        
        //take input
        System.out.println("enter value in array");
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                arr[i][j]=sc.nextInt();
            }   
        }
        //show array with only even value
        System.out.println("even value in array");
         for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
               if(arr[i][j]%2==0)
               {
                    System.out.print(arr[i][j] +"  ");
               }
            }   
        }
       }
    
}
