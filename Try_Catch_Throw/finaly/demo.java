public class demo{
    public static void main(String[] args) {
        
        try{
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println("result="+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("error=did not divide by zero");
        }
        finally{
            System.out.println("this block always execute");
        }
    }
}