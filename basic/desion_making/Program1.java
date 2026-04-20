import java.util.Scanner;

class Program1{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("welcome");


        System.out.print("enter value=");
        int age=sc.nextInt();
        if(age > 18){
            System.out.println("You are selected for vot");
        }
        else{
            System.out.println("You are not selected for vot");

        }

    }   
}


// onject user intput 