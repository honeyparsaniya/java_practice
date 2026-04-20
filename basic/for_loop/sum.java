import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
          int i,sum;
          sum=0;
        System.out.print("enter last value=");
        int a=input.nextInt();

        for(i=0;i<=a;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum of total value="+sum);

    }
    
}
