public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Doe", "123456",
                "Computer Science", "Freshman", 3.5);

        student1.addCourse("CS101");
        student1.addCourse("MATH101");
        student1.addCourse("ENG101");
        student1.addCourse("HIST101");

        System.out.println(student1);
        System.out.println("Unsorted Student Courses:");
        System.out.println(student1.getStudentCourses());

        student1.sortCourseList();
        System.out.println("Sorted Student Courses:");
        System.out.println(student1.getStudentCourses());

        student1.removeCourse("HIST101");
        System.out.println("Removed Student Courses:");
        System.out.println(student1.getStudentCourses());

    }
}
