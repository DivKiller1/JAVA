import java.util.Scanner;

class Person {
    String name, address;
    int age;

    Person() {
        name = "";
        address = "";
        age = 0;
    }

    Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }
}

class Staff extends Person {
    String staffID;
    String department;

    Staff(String name, String address, int age, String department) {
        super(name, address, age);
        this.staffID = (name.length() >= 3 ? name.substring(0, 3) : name)
                    + (department.length() >= 3 ? department.substring(0, 3) : department)
                    + Integer.toString(age);
        this.department = department;
    }

    @Override
    public void displayPerson() {
        super.displayPerson();
        System.out.println("Department: " + department);
    }
}

class Professor extends Staff {
    String specialization;
    int lectureCount = 0;

    Professor(String name, String address, int age, String department, String specialization) {
        super(name, address, age, department);
        this.specialization = specialization;
    }

    public void conductLecture() {
        lectureCount++;
    }

    @Override
    public void displayPerson() {
        super.displayPerson();
        System.out.println("Specialization: " + specialization);
    }
}

class Student extends Person {
    String studentID;
    String course;

    Student(String name, String address, int age, String course) {
        super(name, address, age);
        this.course = course;
    }

    @Override
    void displayPerson() {
        super.displayPerson();
        System.out.println("Course: " + course);
    }
}

class GraduateStudent extends Student {
    String researchTopic;
    String status;

    GraduateStudent(String name, String address, int age, String course, String researchTopic) {
        super(name, address, age, course);
        this.researchTopic = researchTopic;
        this.status = "Not Submitted";
    }

    public void submitThesis() {
        status = "Submitted";
    }

    @Override
    public void displayPerson() {
        super.displayPerson();
        System.out.println("Research Topic: " + researchTopic);
    }
}

public class Program3 {
    public static void main(String[] args) {
        String name, address, department, specialization, course, researchTopic;
        int age;

        Scanner inp = new Scanner(System.in);

        System.err.println("Enter Professor Details:- ");
        System.out.print("Name: ");
        name = inp.nextLine();
        System.out.print("Address: ");
        address = inp.nextLine();
        System.out.print("Department: ");
        department = inp.nextLine();
        System.out.print("Specialization: ");
        specialization = inp.nextLine();
        System.out.print("Age: ");
        age = inp.nextInt();
        inp.nextLine(); 

        Professor prof = new Professor(name, address, age, department, specialization);

        System.err.println("\nEnter Graduate Student Details:- ");
        System.out.print("Name: ");
        name = inp.nextLine();
        System.out.print("Address: ");
        address = inp.nextLine();
        System.out.print("Course: ");
        course = inp.nextLine();
        System.out.print("Research Topic: ");
        researchTopic = inp.nextLine();
        System.out.print("Age: ");
        age = inp.nextInt();
        inp.nextLine();  

        GraduateStudent grad = new GraduateStudent(name, address, age, course, researchTopic);

        System.err.println("\nDisplaying Professor Details:- ");
        prof.displayPerson();

        System.err.println("\nDisplaying Graduate Student Details:- ");
        grad.displayPerson();
    }
}
