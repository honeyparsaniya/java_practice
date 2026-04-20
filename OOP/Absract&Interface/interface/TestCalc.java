interface Calculator {
    void add(int a, int b);
    void sub(int a, int b);
}

class MyCalc implements Calculator {
    public void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }
}

class TestCalc {
    public static void main(String args[]) {
        MyCalc obj = new MyCalc();

        obj.add(10, 5);
        obj.sub(10, 5);
    }
}