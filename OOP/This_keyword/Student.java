import java.util.*;
public class Student {
    int id;
    String name;
    double result;

    public Student(int id,String name,double result) {
    this.id=id;
    this.name=name;
    this.result=result;
    }
    void display()
    {
        System.out.println("id="+this.id);
        System.out.println("name="+this.name);
        System.out.println("result="+this.result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.println("enter your id=");
        int id=sc.nextInt();

        System.out.println("enter your name=");
        sc.nextLine();
        String name=sc.nextLine();

        System.out.println("enter your result=");
        double result=sc.nextDouble();

        Student s=new Student(id, name, result);

        s.display();
    }

    
    
}
