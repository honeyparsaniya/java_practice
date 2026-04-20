import java.util.*;

class sum {

    static int add(int a,int b)
    {
        return a+b;
    }
    public static void main(String[] arg)
     {
        
        Scanner sc= new Scanner(System.in);

        System.out.print("enter a first value=");
        int a=sc.nextInt();

        System.out.println("enter a second value=");
        int b=sc.nextInt();

        //function call
        int result=add(a,b);
        
        System.out.println("answer ="+result);

        sc.close();
    }
    
}
