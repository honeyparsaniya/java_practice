interface sound{
    void sound();
}
class dog implements sound{
    public void sound()
    {
        System.out.println("dog bark");
    }
}
public class demo {
    public static void main(String[] args) {
        dog d=new dog();
        d.sound();
    }
    
}
