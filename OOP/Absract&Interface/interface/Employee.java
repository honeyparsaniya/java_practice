import java.util.Scanner;

// First interface
interface EmpInfo {
    void getInfo(String name, int id);
}

// Second interface
interface SalaryInfo {
    void getSalary(double basic);
}

// Class implementing both interfaces
class person implements EmpInfo, SalaryInfo {

    String name;
    int id;
    double basic, hra, total;

    public void getInfo(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void getSalary(double basic) {
        this.basic = basic;
        hra = basic * 0.10;
        total = basic + hra;
    }

    void display() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("Total Salary: " + total);
    }
}

// Data class
class Data {
    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter ID:");
        int id = sc.nextInt();

        System.out.println("Enter Basic Salary:");
        double basic = sc.nextDouble();

        person e = new person();
        e.getInfo(name, id);
        e.getSalary(basic);
        e.display();
    }
}

// Main class
class Employee {
    public static void main(String[] args) {
        Data d = new Data();
        d.getData();
    }
}