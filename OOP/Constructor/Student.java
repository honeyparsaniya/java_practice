import java.util.*;
public class Student {
    int id;
    String name;

    Student(int i,String n){
            id=i;
            name=n;
    }
    void display()
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.print("enter your id=");
        int i=sc.nextInt();

        System.out.print("enter your name=");
        sc.nextLine();
        String n=sc.nextLine();
        

        Student s=new Student(i,n);
        s.display();
    }
}
