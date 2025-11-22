import java.io.*;
import java.util.ArrayList;

public class FileHandler {
    private static final String FILE_NAME = "students.txt";

    public static void saveRecord(Student student) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true)) {
            fw.write(student.toString() + "\n");
        } catch (IOException e) {
            System.out.println("Error saving record!");
        }
    }

    public static void displayRecords() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\n--- Saved Student Records ---");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("-----------------------------");
        } catch (IOException e) {
            System.out.println("No records found, add students!");
        }
    }
}
