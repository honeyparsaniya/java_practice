import java.util.*;
public class fibonaci {

    static void check(int n)
    {
        int a=0,b=1;
         System.out.print("Fibonacci: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
    }
}
        public static void main(String[] args) {
            
            Scanner sc=new Scanner(System.in);

            System.out.println("enter a last number for fibonaci=");
            int n=sc.nextInt();

            check(n);
            sc.close();

            }
}