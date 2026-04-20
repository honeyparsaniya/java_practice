import java.util.*;
interface account{
    void info(String name,int accno,String branch,double balance);
    void deposit(double damt);
    void withdraw(double wamt);
    void display(String name,int accno,double balance);
}
class person  implements account{

   String name;int accno;String branch;double balance;
      public void info(String name,int accno,String branch,double balance)  
      {
        this.name=name;
        this.accno=accno;
        this.branch=branch;
        this.balance=balance;
      } 

    
    public void deposit(double damt)
    {
        balance=damt+balance;
    }
    public void withdraw(double wamt)
    {
        if(wamt>balance)
        {
            System.out.println("amount is more than balance !");
        }
        else
        {
            balance=balance-wamt;
        }
    }

   public void display(String name,int accno,double balance)
    {
        System.out.println("===user detai===");
        System.out.print("name="+name);
        System.out.println("account no="+accno);
        System.out.println("avilable balance="+balance);
    }
}

class data
{
      void getdata()
    {
        Scanner sc=new Scanner (System.in);

        System.out.println("enter name=");
        String name=sc.nextLine();

         System.out.println("enter account no=");
        int accno=sc.nextInt();

         System.out.println("enter bank branch name=");
         String branch=sc.nextLine();
         sc.nextLine();

         System.out.println("enter balance=");
         double balance=sc.nextDouble();


         person p=new person();
         System.out.println("===select choice===");
         System.out.println("1.deposit");
         System.out.println("2.withdraw");
         System.out.println("enter your choice=");
         int choice=sc.nextInt();
         if (choice==1)
         {
                System.out.print("enter amount=");
                double damt=sc.nextDouble();
                p.deposit(damt);
         }
         else
         {
                System.out.print("enter amount=");
                double wamt=sc.nextDouble();
                p.withdraw(wamt);
         }
         p.display(name, accno, balance);
         
   }
}
class Bank{

    public static void main(String[] args) {
        
        data d= new data();
        d.getdata();    
}
}