import java.util.*;
public class user{

    int n;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        user obj=new user();

        System.out.println("enter a value=");
        obj.n=sc.nextInt();

        System.out.println("value="+obj.n);
    }
}