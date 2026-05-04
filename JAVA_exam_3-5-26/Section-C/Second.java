import java.util.*;
public class Second {
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
        //sort array in aasending order
        for (int i=0;i<n-1;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        //print array
        System.out.println("===array in assending order===");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }    
}
