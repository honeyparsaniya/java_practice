import java.util.Scanner;

class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("check value odd or even");
        System.out.print("enter value=");
        int val=sc.nextInt();
        if(val%2==0)
            {

                System.out.println("value is even");
            }
        else
            {

                    System.out.println("value is odd");
            } 
    }
    
}
