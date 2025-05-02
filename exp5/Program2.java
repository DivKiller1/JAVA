import java.util.Scanner;

class Employee {
    String name;
    String EmpID;
    int salary;

    Employee() {
        name = "";
        EmpID = "";
        salary = 0;
    }

    Employee(String name, int salary) {
        this.EmpID = name.substring(0, 3).toUpperCase() + Integer.toString(salary);
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }

    public void increaseSalary(double percentage) {
        salary += ((percentage / 100) * salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + this.department); 
    }
}

public class Program2 {
    public static void main(String[] args) {
        String name, department;
        int salary;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        name = inp.nextLine();

        System.out.print("Enter Employee Salary: ");
        salary = inp.nextInt();
        inp.nextLine(); 

        System.out.print("Enter Employee Department: ");
        department = inp.nextLine();

        Manager obj = new Manager(name, salary, department);
        obj.displayDetails();
    }
}
