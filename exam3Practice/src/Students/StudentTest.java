package Students;

public class StudentTest {
    public static void main(String[] args) {
        // objects: instance of a class that hold actual values
        Student student1 = new Student("John Doe", 123, 3.20);
        Student student2 = new Student("Jane Smith", 124, 3.70);
        Student student3 = new Student("Tom Riddle", 125, 4.0);
        Student student4 = new UnderGradStudent("Austin Avery", 126, 3.0, "Comp Sci");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        System.out.println(student1.calculateGpa());

    }
}