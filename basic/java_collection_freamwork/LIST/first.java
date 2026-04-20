import java.util.*;
public class first {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        //add element in list
        list.add("honey");
        list.add("honey1");
        list.add("honey2");
        list.add("honey3");
        list.add("honey4");
        list.add("honey5");

        System.out.println("your list="+list);

        //remove element 
        list.remove("honey4");
        System.out.println("list after remove element="+list);

        //find size of list
        System.out.println("length of list="+list.size());
    }
    
}
