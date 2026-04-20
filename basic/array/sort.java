import java.util.Scanner;
public class sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("sorting array");
        //input
        int arr[]=new int[10];
        System.out.println("enter element in array");
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        //sort array
        System.out.println("sorting array is =");        
        for(int i=0;i<8;i++)
        {
            for(int j=i+1;j<10;j++)
            {
                if(arr[i]>arr[j])
                {
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                }
            }
        }
        //print sort array
        for (int i = 0; i < 10; i++) 
        {
            System.out.println(arr[i]);            
        }
        
    }
}
