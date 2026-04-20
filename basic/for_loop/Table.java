import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int i;
        System.out.println("enter value =");
        int num=sc.nextInt();

        for(i=1;i<=10;i++)
        {
            System.out.println(num  +" * "+ i +" = "+(num*i));
        }
    }

}
