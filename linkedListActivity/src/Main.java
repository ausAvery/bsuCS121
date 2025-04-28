public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Doe", "123456", "Computer Science", "Freshman");
        Student student2 = new Student("Jane", "Smith", "789012", "Mathematics", "Sophomore");

        student1.addCourse("CS101");
        student1.addCourse("MATH101");
        student1.addCourse("ENGL101");
        student1.addCourse("HIST101");

        student2.addCourse("MATH201");
        student2.addCourse("PHYS201");
        student2.addCourse("CHEM201");

        System.out.println(student1.getStudentInfo());
        student1.displayStudentCourses();

        student1.removeCourse("MATH101");
        System.out.printf("\nAfter removing a course from %s's schedule:\n", student1.getFullName());
        student1.displayStudentCourses();

        System.out.println("\n" + student2.getStudentInfo());
        student2.displayStudentCourses();

        student2.removeCourse("PHYS201");
        System.out.printf("\nAfter removing a course from %s's schedule:\n", student2.getFullName());
        student2.displayStudentCourses();
    }
}
