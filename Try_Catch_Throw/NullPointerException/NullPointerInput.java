import java.util.Scanner;

class NullPointerInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=null;
        try
        {
            System.out.println("enter 1 to assign value to string=");
            int ch=sc.nextInt();

            if(ch==1)
            {
                System.out.println("enter value to enter in string");
                sc.nextLine();
                s=sc.nextLine();
            }
            System.out.println("length of string="+s.length());
        }
        catch(NullPointerException e)
        {
            System.out.println("string is null");
        }
    }
    
}
