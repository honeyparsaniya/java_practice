import java.util.*;
class ArrayThrow{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter length of array=");
        int len=sc.nextInt();

        int arr[]=new int[len];

        System.out.println("enter value in array");
        for(int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();
        }
        try{
            System.out.print("enter index=");
            int ind=sc.nextInt();

            if(ind<0||ind>=len)
            {
                throw new ArrayIndexOutOfBoundsException();
            }
            System.out.println("value at index="+arr[ind]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("index out of range ");
        }
    }
}