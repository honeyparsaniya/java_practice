import java.util.Scanner;

public class findmin {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);

       System.out.println("find min value from array");

       int arr[]= new int[10];

       //input

       System.out.println("enter element in array");

       for(int i=0;i<10;i++)
       {
        arr[i]=sc.nextInt();
       }

       //min

       int min=arr[0];

       //find min

       for (int i = 1; i < 10; i++) 
           {
                if(arr[i]<min);
                {
                    min=arr[i];
                }
           }
        //output

        System.out.println("minimum value from array="+min);
       
   }
    
}
