import java.util.*;
public class Password{
    public static void main(String[] args) {
         
        Scanner sc=new Scanner(System.in);
        
        String correctPassword="honey123";
        int attempts=0;
        System.out.println("===login your account===");
        try{
                while(attempts<3)
                {
                    System.out.print("enter password=");
                    String input=sc.next();

                    if(input != correctPassword);
                    {
                        attempts++;
                        System.out.println("wrong password! \n ateempt left="+(3-attempts));
                    }
                    if(attempts==3)
                    {
                        throw new Exception("account locked:3 wrong attempt!");
                    }

                
                else
                    {
                    System.out.println("login sucessfull!");
                    break;
                    }
                }
        }
        catch(Exception e)
        {
            System.out.print("error="+e.getMessage());
        }
        finally
        {
                System.out.println("Session closed!");
        }
        
        System.out.println("program end");

    }   
}