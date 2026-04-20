import java.util.*;
public class count {
    public static void main(String[] args) {
     
        Scanner sc= new Scanner(System.in);
    //take string
        System.out.println("enter a string="); 
        String s=sc.nextLine();  

        //count vovel
        int vovel=0;
        int consonants=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

                    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                    ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='u')
                    {
                            vovel++;
                    } 
                    else
                    {
                        consonants++;
                    }
       }
       System.out.println("total vovel="+vovel);
       System.out.println("total consonants="+consonants);
    }
}
