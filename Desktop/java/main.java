import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        University university = new University("Example University");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the university information system");
            System.out.println("1. Add Department");
            System.out.println("2. Add professor");
            System.out.println("3. Add Student");
            System.out.println("4. List department details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.print("Enter department name: ");
                    String departmentName = scanner.nextLine();
                    Department department = new Department(departmentName);
                    university.addDepartment(department);
                    System.out.println("Department added successfully!");
                    break;
                case 2:
                    // Add professor logic
                    break;
                case 3:
                    // Add student logic
                    break;
                case 4:
                    // List department details logic
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}