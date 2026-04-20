class perent {
    
    void perents()
    {
        System.out.println("this is parent class");
    }
}
class child extends perent{

    void display()
    {
        System.out.println("this is child class");
    }
}

public class demo{
    public static void main(String[] args) {
        
        child c=new child();
        c.perents();
        c.display();
    }
}
