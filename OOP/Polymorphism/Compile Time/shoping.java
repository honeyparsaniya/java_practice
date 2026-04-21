import java.util.*;

class Cart {

    void bill(int price, int qty) {
        if(price <= 0 || qty <= 0) {
            System.out.println("Invalid input!");
        } else {
            double total = price * qty;
            double gst = total * 0.18;
            double finalAmount = total + gst;

            System.out.println("Total: " + total);
            System.out.println("GST (18%): " + gst);
            System.out.println("Final Amount: " + finalAmount);
        }
    }

    void bill(int price, int qty, int discount) {
        if(price <= 0 || qty <= 0 || discount < 0) {
            System.out.println("Invalid input!");
        } else {
            double total = price * qty;
            double afterDiscount = total - discount;
            double gst = afterDiscount * 0.18;
            double finalAmount = afterDiscount + gst;

            System.out.println("Total: " + total);
            System.out.println("After Discount: " + afterDiscount);
            System.out.println("GST (18%): " + gst);
            System.out.println("Final Amount: " + finalAmount);
        }
    }
}

class shoping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cart c = new Cart();

        int choice;

        do {
            System.out.println("\n--- SHOPPING MENU ---");
            System.out.println("1. Bill without discount");
            System.out.println("2. Bill with discount");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter price: ");
                    int price = sc.nextInt();

                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();

                    c.bill(price, qty);
                    break;

                case 2:
                    System.out.print("Enter price: ");
                    price = sc.nextInt();

                    System.out.print("Enter quantity: ");
                    qty = sc.nextInt();

                    System.out.print("Enter discount: ");
                    int discount = sc.nextInt();

                    c.bill(price, qty, discount);
                    break;

                case 3:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while(choice != 3);
    }
}