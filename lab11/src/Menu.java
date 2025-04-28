import java.util.Scanner;

public class Menu {
    private StudentRecord record;
    private Scanner scanner;

    // Default constructor initializes the StudentRecord and Scanner
    public Menu() {
        record = new StudentRecord();
        scanner = new Scanner(System.in);
    }

    // Display the menu and process user selections using a while loop with if/else statements
    public void displayMenu() {
        int choice = 0;
        while (true) {
            System.out.println("\n=========================");
            System.out.println("     STUDENT RECORD      ");
            System.out.println("=========================");
            System.out.println("1. Create a new Student");
            System.out.println("2. Remove a Student");
            System.out.println("3. Display a Student's info");
            System.out.println("4. Display all Students' info");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(scanner.nextLine());

            if (choice == 1) {
                createStudent();
            }
            else if (choice == 2) {
                removeStudent();
            }
            else if (choice == 3) {
                displayStudentInfo();
            }
            else if (choice == 4) {
                displayAllStudents();
            }
            else if (choice == 5) {
                System.out.println("Exiting the program.");
                break;
            }
            else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void createStudent() {
        System.out.print("Enter Student Type (U for Undergrad, G for Grad): ");
        String type = scanner.nextLine().trim().toUpperCase();
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        Student student = null;
        if (type.equals("U")) {
            System.out.print("Enter Major: ");
            String major = scanner.nextLine();
            student = new UndergradStudent(name, id, major);
        } else if (type.equals("G")) {
            System.out.print("Enter Dissertation Title: ");
            String dissertationTitle = scanner.nextLine();
            student = new GradStudent(name, id, dissertationTitle);
        } else {
            System.out.println("Invalid student type. Creation aborted.");
            return;
        }

        System.out.print("Enter number of courses to add: ");
        int numCourses = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numCourses; i++) {
            System.out.println("Enter details for Course " + (i + 1));
            System.out.print("Course Name: ");
            String courseName = scanner.nextLine();
            System.out.print("Course Code: ");
            String courseCode = scanner.nextLine();
            System.out.print("Credits: ");
            int credits = Integer.parseInt(scanner.nextLine());
            Course course = new Course(courseName, courseCode, credits);
            student.addCourse(course);
        }
        record.addStudent(student);
        System.out.println("Student added successfully.");
    }

    private void removeStudent() {
        System.out.print("Enter Student ID to remove (integer): ");
        int id = Integer.parseInt(scanner.nextLine());
        if (record.removeStudent(id)) {
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    private void displayStudentInfo() {
        System.out.print("Enter Student ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        Student student = record.getStudent(id);
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Student not found.");
        }
    }

    private void displayAllStudents() {
        System.out.println("\n===== All Students =====");
        System.out.println(record.getAllStudentsInfo());
    }
}
