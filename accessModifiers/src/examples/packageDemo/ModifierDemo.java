package examples.packageDemo;

import examples.student.Student;

public class ModifierDemo {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", "12345",
                "Freshman", "Computer Science", 3.8);

        System.out.println("The following is from the ModifierDemo Class\n");

        System.out.printf("Name: %s\n", student1.name);
        //System.out.printf("ID: %s\n", student1.id); private variable
        System.out.printf("Class Standing: %s\n", student1.classStanding);
        System.out.printf("Major: %s\n", student1.major);
        //System.out.printf("GPA: %.1f\n", student1.gpa); private variable

        student1.printStudentInfo();

        //student1.printStudentId(); private method

        //student1.printStudentRecord(); protected method

        //student1.printStudent(); default method

    }
}
