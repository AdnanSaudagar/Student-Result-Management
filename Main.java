import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Result Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. Show All Records");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Roll No: ");
                    int rollNo = sc.nextInt();
                    System.out.print("Enter Marks out of 500: ");
                    float marks = sc.nextFloat();

                    Student s = new Student(name, rollNo, marks);
                    FileHandler.saveRecord(s);
                    System.out.println("Record saved successfully!");
                    break;

                case 2:
                    FileHandler.displayRecords();
                    break;

                case 3:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 3);
    }
}
