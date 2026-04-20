import java.util.*;
public class multiple_obj{

    int value=2;

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        multiple_obj num=new multiple_obj();  
        multiple_obj num1=new multiple_obj();
        System.out.println("enter value=");
        num.value=sc.nextInt();

        System.out.println("new value="+num.value);
        System.out.println("old value="+num1.value);
    }
}