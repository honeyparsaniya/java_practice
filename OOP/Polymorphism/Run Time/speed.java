import java.util.*;

class Vehicle {
    void speed(double distance, double time) {
        System.out.println("Calculating speed...");
    }
}

class Car extends Vehicle {
    void speed(double distance, double time) {
        double s = distance / time;
        System.out.println("Car Speed: " + s);
    }
}

class Bike extends Vehicle {
    void speed(double distance, double time) {
        double s = distance / time;
        System.out.println("Bike Speed: " + s);
    }
}

class Bus extends Vehicle {
    void speed(double distance, double time) {
        double s = distance / time;
        System.out.println("Bus Speed: " + s);
    }
}

public class speed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehicle v;

        System.out.print("1=Car, 2=Bike, 3=Bus: ");
        int choice = sc.nextInt();

        System.out.print("Enter distance: ");
        double d = sc.nextDouble();

        System.out.print("Enter time: ");
        double t = sc.nextDouble();

        if (choice == 1) {
            v = new Car();
        } else if (choice == 2) {
            v = new Bike();
        } else {
            v = new Bus();
        }

        v.speed(d, t);  
    }
}