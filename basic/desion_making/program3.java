import java.util.Scanner;

class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      System.out.println("check value ");
      System.out.print("enter value=");
      int value=sc.nextInt();
      if(value<0)
      {
        System.out.println("you enter negative value");
      }
      else{
        System.out.println("you enter positive value");
      }
    }
    
}