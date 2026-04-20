import java.util.Scanner;

class Palindrome {
    int num;

    Palindrome(int n) {
        num = n;
    }

    void check() {
        int temp = num;
        int rev = 0;

        while(temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        if(rev == num)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Palindrome");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        Palindrome p = new Palindrome(n);
        p.check();
    }
}