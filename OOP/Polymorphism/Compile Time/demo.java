import java.util.*;
class calculate{

    int show(int a,int b)
    {
        return a+b;
    }

    int show(int a,int b,int c)
    {
        return a+b+c;
    }
    int show(int a,int b,int c,int d)
    {
        return a+b+c+d;
    }
}
    
public class demo{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        calculate cal=new calculate();

        System.out.println("====additions====");
        System.out.println("1.add two number= ");
        System.out.println("add three number=");
        System.out.println("add four number=");
        System.out.println("enter your choice=");
        int choice=sc.nextInt();

        switch(choice)
        {
                case 1:
                    {
                        System.out.println("enter two value=");
                        int a1=sc.nextInt();
                        int a2=sc.nextInt();

                        System.out.println("total="+cal.show(a1,a2));
                        break;
                    }
                    case 2:
                    {
                        System.out.println("enter three value=");
                        int a1=sc.nextInt();
                        int a2=sc.nextInt();
                        int a3=sc.nextInt();

                        System.out.println("total="+cal.show(a1,a2,a3));
                        break;
                    }
                    case 3:
                        {
                        System.out.println("enter four value=");
                        int a1=sc.nextInt();
                        int a2=sc.nextInt();
                        int a3=sc.nextInt();
                        int a4=sc.nextInt();

                        System.out.println("total="+cal.show(a1,a2,a3,a4));
                        break;
                        }
                        default:
                            {
                                System.out.println("enter valid choice!");
                                break;
                            }


                        
        }
    }
}
