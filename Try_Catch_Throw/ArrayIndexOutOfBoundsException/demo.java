import java.util.*;
class demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter lengthof arrray=");
        int len=sc.nextInt();

        int arr[]=new int[len];

        System.out.println("enter element in array=");
        for(int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();
        }
        try
        {
            System.out.println("enter index=");
            int ind=sc.nextInt();

            System.out.println("value at index="+arr[ind]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error=enter valid index");
        }
    }
}