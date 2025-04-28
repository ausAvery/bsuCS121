import java.util.LinkedList;

public class Student {
    // Instance variables
    private String firstName;
    private String lastName;
    private String id;
    private String major;
    private String classStanding;   // freshman, sophomore, etc...
    private double gpa;
    private LinkedList<String> courseList;

    // constructor
    public Student(String firstName, String lastName, String id, String major, String classStanding, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.major = major;
        this.classStanding = classStanding;
        this.gpa = gpa;
        this.courseList = new LinkedList<>();
    }

    // methods
    public void addCourse(String course) {
        courseList.add(course);
    }

    public void removeCourse(String course) {
        courseList.remove(course);
    }

    public void displayStudentCourses() {
        System.out.printf("Courses for: %s %s\n", firstName, lastName);
        for (String course : courseList) {
            System.out.println(course);
        }
    }

    public StringBuilder getStudentCourses() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String course : courseList) {
            stringBuilder.append(course + "\n");
        }
        return stringBuilder;
    }

    public String getFullName() {
        return String.format("%s %s", firstName, lastName);
    }

    public void sortCourseList() {
        String temp;
        for (int i = 1; i < courseList.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (courseList.get(j).compareTo(courseList.get(j - 1)) < 0) {
                    temp = courseList.get(j);
                    courseList.set(j, courseList.get(j - 1));
                    courseList.set(j - 1, temp);
                }
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s\n" +
                        "ID: %s\n" +
                        "Major: %s\n" +
                        "Class Standing: %s\n" +
                        "GPA: %.2f\n",
                firstName, lastName, id, major, classStanding, gpa);
    }
}
