import java.util.*;

class person{
    String name;
    int id;
}
class students extends person
{

    int m1,m2,m3;
    int total;
    double avg;

    void getdata()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter name=");
        name=sc.nextLine();
        System.out.print("enter your ID=");
        id=sc.nextInt();
        System.out.print("mark-subject-1=");
        m1=sc.nextInt();
        System.out.print("mark-subject-2=");
        m2=sc.nextInt();
        System.out.print("mark-subject-3=");
        m3=sc.nextInt();
    }
    void calculate()
    {
        total=m1+m2+m3;
        avg=total/3;
    }
    void display()
    {
        System.out.println("===STUDENT DETAIL===");
         System.out.println("ID="+id);
        System.out.println("name="+name);
        System.out.println("Result="+avg);
        if(avg>70)
        {
            System.out.println("grade=A");
        }
        else if(avg>50)
        {
            System.out.println("grade=B");
        }
        else if(avg>35)
        {
            System.out.println("grade=C");
        }
        else
        {
            System.out.println("FAIL!s");
        }
    }
}
public class Student {

    public static void main(String[] args) {
        
        students s=new students();

        s.getdata();
        s.calculate();
        s.display();
    }
    
}
