import java.util.*;

public class check {
    int num;

    public check(int num) {
    
        this.num=num;
    }
    void find()
    {
        if(this.num%2==0)
        {
            System.out.println("even value");
        }
        else{
            System.out.println("odd value");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter number");
        int num=sc.nextInt();

        check n=new check(num);
        n.find();

        
    }

    
    
}
