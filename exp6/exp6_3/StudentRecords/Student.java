package StudentRecords;

public class Student {
    private int studentId;
    private String name;
    private String grade;

    public Student(int studentId, String name, String grade) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
    }

    public void displayStudentInfo() {
        System.out.println("ID: " + studentId + ", Name: " + name + ", Grade: " + grade);
    }
}
