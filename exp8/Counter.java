import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = input.nextLine();
        input.close();
        
        File file = new File(fileName);

        try (Scanner scanner = new Scanner(file)) {
            int wordCount = 0, charCount = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("\\s+");
                wordCount += words.length;
                charCount += line.replaceAll("\\s", "").length();
            }

            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters (excluding spaces): " + charCount);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}
