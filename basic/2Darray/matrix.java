import java.util.Scanner;
public class matrix {
    public static void main(String [] args) {
        Scanner sc =new Scanner(System.in);
        //for row
        System.out.println("enter value for row:");
        int r=sc.nextInt();
        //for column
       System.out.println("enter value for column:");
       int c=sc.nextInt();
       //array
       int arr[][] = new int[r][c];
       //input in matrix
       System.out.println("enter value in matrix");
       for(int i=0;i<r;i++)
       {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
       }
       //show array
       for(int i=0;i<r;i++)
       {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
       }
       sc.close();
    }
   
    
}
