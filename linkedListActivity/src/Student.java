import java.util.LinkedList;

public class Student {
    // Instance variables
    private String firstName;
    private String lastName;
    private String id;
    private String major;
    private String classStanding;
    private double gpa;
    private LinkedList<String> courseList;

    // constructor
    public Student(String firstName, String lastName, String id, String major, String classStanding) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.major = major;
        this.classStanding = classStanding;
        this.gpa = 0.0;
        this.courseList = new LinkedList<>();
    }

    // methods
    public void addCourse(String course) {
        courseList.add(course);
    }

    public void removeCourse(String course) {
        courseList.remove(course);
    }

    public String getStudentInfo() {
        return String.format("Name: %s %s\n" +
                "ID: %s\n" +
                "Major: %s\n" +
                "Class Standing: %s\n" +
                "GPA: %.2f\n",
                firstName, lastName, id, major, classStanding, gpa);
    }

    public void displayStudentCourses() {
        System.out.printf("Courses for: %s %s\n", firstName, lastName);
        for (String course : courseList) {
            System.out.println(course);
        }
    }

    public String getFullName() {
        return String.format("%s %s", firstName, lastName);
    }
}
