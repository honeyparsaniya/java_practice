import java.util.*;
public class Student {

        int id;
        String name;

        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);


            Student i=new Student();
            Student n=new Student();

            System.out.print("enter your id number=");
            i.id=sc.nextInt();
            System.out.print("enter your name=");
            sc.nextLine();
             n.name=sc.nextLine();

            System.out.println("===student data===");
            System.out.println("id="+i.id);
            System.out.println("name="+n.name);

            }
    
}
