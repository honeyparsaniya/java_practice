import java.util.*;

class user{

    String name;
    double salary;

}
class manager extends user{

    
    void getdetail()
    {
        Scanner sc =new Scanner (System.in);

            System.out.print("enter your name=");
            sc.nextLine();
            name=sc.nextLine();
            System.out.print("enter your salary=");
            salary=sc.nextDouble();   
    }
    void calculate ()
    {
        if(salary>10000)
        {
            System.out.println("total Salary="+(salary+10000));
        }
       else if(salary>20000)
        {
            System.out.println("total salary="+(salary+15000));
        }
        else
        {
            System.out.println("total salary="+salary);
        }

    }

    }
class employe{
    public static void main(String[] args) {
        
        manager e=new manager ();
        e.getdetail();
        e.calculate();

    }

}
