import java.util.*;

public class first {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.print("enter size of array=");
        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++)
        {
            System.out.print("enter value=");
            arr[i]=sc.nextInt();
        }
        //find min and max
        int max=arr[0];
        int min=arr[0];
        //max value
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        //find min value
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("maximum ="+max);
        System.out.println("minimum ="+min);
    }    

}
