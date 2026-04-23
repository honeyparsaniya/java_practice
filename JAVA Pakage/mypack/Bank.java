package mypack;

public class Bank {

        public void deposit(Account a,double amount)
        {
            a.balance=a.balance+amount;
            System.out.println("Deposited: " + amount); 
            System.out.println("current balance="+a.balance);
        }
        public void withdraw(Account a,double amount)
        {
            if(amount>a.balance)
            {
                System.out.println("amount is more than balance!");
            }
            else{

                a.balance=a.balance-amount;
                System.out.println("withdraw="+amount);
                System.out.println("current balance="+a.balance);
            }
           
        }
         public void show(Account a) {
            System.out.println("\nAccount No: " + a.accNo);
            System.out.println("Name: " + a.name);
            System.out.println("Balance: " + a.balance);
}
}
