package examples.student;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", "12345",
                "Freshman", "Computer Science", 3.8);

        // in examples.student.Student, variable 'name' is public, the below statement will print
        System.out.println(student1.name);
        System.out.println();

        // in examples.student.Student, variable 'id' is private, the below statement will NOT work
        // System.out.println(student1.id);

        student1.printStudentInfo();
        System.out.println();

        // in examples.student.Student, the method 'printStudentId' is private, the below statement will NOT work
        // student1.printStudentId();
        // System.out.println();

        student1.printStudentRecord();
        System.out.println();

        student1.printStudent();
        System.out.println();
    }
}
