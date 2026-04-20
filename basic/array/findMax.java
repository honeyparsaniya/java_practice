import java.util.Scanner;
public class findMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[10];

        System.out.println("find maximum value from array");

        //input

        for (int i = 0; i < 10; i++) {

            arr[i]=sc.nextInt();        
        }

        //max
        int max=arr[0];

        //find max

        for (int i = 0; i < 10; i++) 
        {
            if(max<arr[i])   
            {
                max=arr[i];

            }

        }

        //output

        System.out.println("maximum value in array="+max);

    }    
}
