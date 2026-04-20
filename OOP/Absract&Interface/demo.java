abstract class bank{
        abstract void intrest();

        void display()
        {
            System.out.println("===bank system===");
        }
}
class SBI extends bank{

    void intrest()
    {
        System.out.println("SBI rate is 5%");
    }
}
class HDFC extends bank{

    void intrest()
    {
        System.out.println("HDFC rate is 7%");
    }
}
public class demo{

    public static void main(String[] args) {
        SBI s=new SBI();
        HDFC h=new HDFC();

        s.display();
        s.intrest();

        h.display();
        h.intrest();
    }
}