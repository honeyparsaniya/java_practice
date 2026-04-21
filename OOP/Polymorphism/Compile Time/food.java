
import java.util.Scanner;

class order{
    void bill(int price, int qut){

        if(price<=0 || qut<=0)
        {
            System.out.println("invalid order");
        }
        else
        {
            int total=price*qut;
            System.out.println("total bill="+total);
        }

    }
    void bill(int price,int qut,int ext){

        if(price<=0 || qut<=0 || ext<0)
        {
            System.out.println("invalid order");
        }
        else
        {
            int total=(price*qut)+ext;

            System.out.println("total bill="+total);
        }
    }
}
class food{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        order o=new order();

        int choice;

        do { 
            
            System.out.println("---food_menu---");
            System.out.println("1.with extra toping");
            System.out.println("2.without extra toping");
            System.out.println("3.exit");

            System.out.print("enter choice=");
            choice=sc.nextInt();

            switch (choice) {
                case 1:
                    {
                            System.out.print("enter quntity=");
                            int q=sc.nextInt();

                            System.out.print("enter price of 1=");
                            int p=sc.nextInt();

                            o.bill(p, q);

                            break;
                    }
                case 2:
                    {
                            System.out.print("enter quntity=");
                            int q=sc.nextInt();

                            System.out.print("enter price of 1=");
                            int p=sc.nextInt();

                            System.out.print("enter price of extra topings=");
                            int t=sc.nextInt();

                            o.bill(p,q,t);

                            break;
                    }
                case 3:
                    {
                        System.out.println("Thank you!");
                        break;

                    }

                default:
                   {
                        System.out.println("enter valid choice");
                   }
            }
        } while ( choice !=3);
    }
}