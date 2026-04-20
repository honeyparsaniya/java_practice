import java.util.Scanner;
public class serch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("serch value from array");
        int arr[]=new int[10];

        //input

        System.out.println("enter element in array");

        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        //value for serch


        System.out.print("enter value that you want to find=");
        int s=sc.nextInt();

        for(int i=0;i<10;i++)
        {
            if(arr[i]==s)
            {
                System.out.println(arr[i] +" is find at index" + i );
                break;
            }
        }
    }
    
}
