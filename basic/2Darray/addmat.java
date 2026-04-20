import java.util.Scanner;

public class addmat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2]; 

        // Input first matrix
        System.out.println("Enter elements of first matrix:");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                a[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter elements of second matrix:");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                b[i][j] = sc.nextInt();
            }
        }

        // Addition
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        // Output result
        System.out.println("Result matrix:");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}