import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentReader {
    public static void main(String[] args) {
        File file = new File("student.txt");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file 'student.txt' does not exist.");
        }
    }
}
