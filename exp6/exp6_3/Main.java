import StudentRecords.Student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", "A");
        Student s2 = new Student(102, "Bob", "B");
        s1.displayStudentInfo();
        s2.displayStudentInfo();
    }
}
