import java.util.Scanner;

public class Menu {
    // instance variables
    private Scanner scanner = new Scanner(System.in);
    private StudentRecord record = new StudentRecord();

    // default constructor

    // methods
    public void displayMenu() {
        while (true) {
            String selection;
            System.out.printf("\n%s MENU %s\n", "=".repeat(5), "=".repeat(5));
            System.out.printf("Please make a selection:\n" +
                    "1) Add a Student\n" +
                    "2) Remove a Student\n" +
                    "3) Display Student Info\n" +
                    "4) Display all Student Info\n" +
                    "5) Exit\n" +
                    ">> ");
            selection = scanner.nextLine();
            if (selection.equals("1")) {
                createStudent();
            }
            else if (selection.equals("2")) {
                deleteStudent();
            }
            else if (selection.equals("3")) {
                displayStudent();
            }
            else if (selection.equals("4")) {
                displayAllStudents();
            }
            else if (selection.equals("5")) {
                System.out.println("Exiting...");
                break;
            }
            else {
                System.out.println("Invalid entry. Please try again.");
            }
        }
    }

    private void createStudent() {
        String degree;
        String name;
        String id;
        String major;
        String dissertation;
        Student student;
        String courseName;
        int credits;
        Course course;

        System.out.print("Enter the Student name: ");
        name = scanner.nextLine();
        System.out.print("Enter the Student id: ");
        id = scanner.nextLine();

        student = new Student(name, id);


        System.out.printf("Enter Courses for %s.\n", name);
        while (true) {
            System.out.print("\tEnter a Course name or q if finished: ");
            courseName = scanner.nextLine();
            if (courseName.equals("q")) {
                break;
            }
            System.out.print("\tEnter Course's credits: ");
            credits = Integer.parseInt(scanner.nextLine());
            course = new Course(courseName, credits);
            student.addCourse(courseName, course);
        }
        record.addStudent(id, student);
        System.out.printf("%s added to Record\n\n", name);

    }

    private void deleteStudent() {
        String id;
        Student student;
        System.out.print("Enter the ID of the Student you want to delete: ");
        id = scanner.nextLine();
        student = record.getStudent(id);
        if (student == null) {
            System.out.println("Student not found");
        }
        else {
            record.removeStudent(id);
        }
    }

    private void displayStudent() {
        String id;
        Student student;
        System.out.print("Enter the ID of the Student to see info: ");
        id = scanner.nextLine();
        student = record.getStudent(id);
        if (student == null) {
            System.out.println("Student not found.");
        }
        else {
            System.out.println(student);
        }
    }

    private void displayAllStudents() {
        System.out.println(record.getAllStudents());
    }
}
