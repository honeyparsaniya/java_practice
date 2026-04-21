import java.util.Scanner;

class process{
    void deposit(int amount)
    {
        System.out.println("deposite cash="+amount);
    }
    void deposit(int amount,String chequeNo){

        System.out.println("deposite amount="+amount+"\ncheck no.="+chequeNo);
    }
}
public class bank{
        public static void main(String[] args) {
            
            Scanner sc=new Scanner(System.in);

            process p=new process();

            System.out.println("select your choice:");
            System.out.println("write 1 for cash/write 2 for cheque");
            int choice=sc.nextInt();

            if(choice==1)
            {
                System.out.print("enter amount=");
                int amt=sc.nextInt();
                p.deposit(amt);

            }
            else
            {
                System.out.print("enter amount=");
                int amt=sc.nextInt();
                
                System.out.print("enter cheque number=");
                String ch=sc.next();

                p.deposit(amt, ch);
            }
        }
}