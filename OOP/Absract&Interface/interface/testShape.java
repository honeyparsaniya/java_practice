
interface Shape {
    void area();
}

class Circle implements Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    public void area() {
        double a = 3.14 * r * r;
        System.out.println("Area of Circle = " + a);
    }
}

class Rectangle implements Shape {
    double l, b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    public void area() {
        double a = l * b;
        System.out.println("Area of Rectangle = " + a);
    }
}

class testShape {
    public static void main(String args[]) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);

        c.area();
        r.area();
    }
}