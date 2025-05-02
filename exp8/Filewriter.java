import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filewriter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Student Name: ");
        String name = input.nextLine();
        
        System.out.print("Enter Roll Number: ");
        String rollNumber = input.nextLine();
        
        System.out.print("Enter Grade: ");
        String grade = input.nextLine();
        
        try (FileWriter writer = new FileWriter("student.txt", true)) {
            writer.write("Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade + "\n");
            System.out.println("Student data successfully saved.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        
        input.close();
    }
}
