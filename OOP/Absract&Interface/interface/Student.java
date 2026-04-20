import java.util.Scanner;

interface person
{

        void calculate(String name,int id,int m1,int m2,int m3);
}
class result implements person{
    public void calculate(String name,int id,int m1,int m2,int m3)
    {
        int total=m1+m2+m3;
        double avg=total/3;

        System.out.println("===student detail===");
        System.out.println("name="+name);
        System.out.println("id="+id);
        System.out.println("result="+avg);
        if(avg>70)
        {
                System.out.println("pass with grade A");
        }
        else if(avg>50)
        {
                System.out.println("pass with grade B");
        }
        else if(avg>35)
        {
                System.out.println("pass with grade c");
        }
        else
        {
                System.out.println("FAIL!");
        }
        
    }
}
class data{
    void getdata()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter your name=");
        String name=sc.nextLine();

        System.out.println("enter your id=");
        int id=sc.nextInt();

        System.out.println("enter amrk of three subject=");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();

        person p=new result();
        p.calculate(name, id, m1, m2, m3);
    }
}
class Student{
    public static void main(String[] args) {
        data d=new data();
        d.getdata();
    }
}
