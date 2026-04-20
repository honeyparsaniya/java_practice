import java.util.*;
public class setexample2 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        HashSet<String> yourskill=new HashSet<>();

        System.out.println("how many job skill do you have=");
        int j=sc.nextInt();
        sc.nextLine();

        System.out.println("enter your skill below");

        for(int i=0;i<j;i++)
        {
           yourskill.add(sc.nextLine()); 
        }

        HashSet<String> jobskill=new HashSet<>();
        System.out.println("how many job skill required=");
        int r=sc.nextInt();
        sc.nextLine();

        System.out.println("enter required job skill below");
        for(int i=0;i<r;i++)
        {
            jobskill.add(sc.next());
        }

        HashSet<String> skill=new HashSet<>(yourskill);
        skill.retainAll(jobskill);

        if(skill.isEmpty())
        {
            System.out.println("no matching found");
        }
        else
        {
            System.out.print("the comman skills you have="+skill);
        }

    }
}
