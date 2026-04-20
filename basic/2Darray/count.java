import java.util.Scanner;
public class count {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

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
        int evencount=0,oddcount=0;
        System.out.println("even/odd value in array");
         for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
               if(arr[i][j]%2==0)
               {
                    evencount++;
               }
               else
               {
                    oddcount++;
               }
            }   
        }
        System.out.print("even count="+evencount);
        System.out.println("");
        System.out.print("odd count="+oddcount);
    }
    
}
