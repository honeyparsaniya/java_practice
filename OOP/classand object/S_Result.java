import java.util.*;
public class S_Result {
    int id,mark;
    String name;

    void getdata()
    {
        Scanner sc= new Scanner(System.in);
         
        System.out.print("ID =");
        id=sc.nextInt();

        System.out.print("name=");
        sc.nextLine();
        name=sc.nextLine();

        System.out.print("enter your result=");
        mark=sc.nextInt();
    }
    void display()
    {
        System.err.println("===Student Result===");
        System.out.println("Student ID="+id);
        System.out.println("Student name="+name);
        System.out.println("Student result="+mark);

        if(mark>70)
        {
            System.out.println("pass with grade A");
        }
        else if(mark>50)
        {
            System.out.println("pass with grade B");
        }
        else if(mark>35)
        {
            System.out.println("pass with grade C");
        }
        else
        {
            System.out.println("Faill!");
        }
    }
    public static void main(String[] args) {
        S_Result s=new S_Result();

        s.getdata();
        s.display();
        
    }
    
}
