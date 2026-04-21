import java.util.*;
class employee{
    void bonus(double salary){
            System.out.println("calculate bonus...");
    }
}
class devloper extends employee{
    void bonus(double salary)
    {
        System.out.println("bonus="+(salary*0.10));
        System.out.println("total salary after add bonus="+(salary*0.10)+salary);
    }
}
class intern extends employee{

        void bonus(double salary)
        {
            System.out.println("bonus="+(salary*0.5));
            System.out.println("total salary after add bonus="+(salary*0.5)+salary);
        }
}
class manager extends employee{

    void bonus(double salary)
    {
        System.out.println("bonus="+(salary*0.20));
        System.out.println("total salary after add bonus="+(salary*0.20)+salary);
    }
}
public class Salary{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);

        employee e;

        System.out.println("---select role---");
        System.out.println("1.devloper");
        System.out.println("2.intern");
        System.out.println("3.manager");

        System.out.print("select your choice=");
        int ch=sc.nextInt();

        System.out.println("enter salary=");

        if(ch==1)
        {
            
        }
    }
}