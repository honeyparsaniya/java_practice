import java.util.*;
public class Employe {
    int id;
    String name;
    double salary;
    Employe(int i,String n,double s) {
        id=i;
        name=n;
        salary=s;
    }
    void display()
    {
        System.out.println("id="+id);
        System.out.println("name="+name);
        System.out.println("salary="+salary);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter id=");
        int i=sc.nextInt();

        System.out.println("enter name=");
        sc.nextLine();
        String n=sc.nextLine();

        System.out.println("enter salary=");
        double s=sc.nextDouble();

        Employe e=new Employe(i, n, s);
        e.display();

    }
    
    
}
