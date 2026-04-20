import java.util.Scanner;
public class operation {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter a first string=");
        String s1=sc.nextLine();

        System.out.println("length="+s1.length());
        System.out.println("char at(3)="+s1.charAt(3));
        System.out.println("Substrin(1,3)="+s1.substring(1,3));
        System.out.println("Upparcase="+s1.toUpperCase());
        System.out.println("Lowercase="+s1.toLowerCase());

       }    
}
