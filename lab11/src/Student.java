import java.util.ArrayList;

public class Student {
    // instance variables
    private String name;
    private int id;
    private ArrayList<Course> courses;

    // constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
    }

    // methods
    public void addCourse(Course course) {
        courses.add(course);
    }

    public boolean removeCourse(String courseCode) {
        for (Course course : courses) {
            if (course.getCourseCode().equalsIgnoreCase(courseCode)) {
                courses.remove(course);
                return true;
            }
        }
        return false;
    }

    public Course getCourse(int index) {
        if(index >= 0 && index < courses.size()) {
            return courses.get(index);
        }
        return null;
    }

    public String getAllCoursesInfo() {
        StringBuilder sb = new StringBuilder();
        for (Course course : courses) {
            sb.append(" - ").append(course.toString()).append("\n");
        }
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("Student Name: %s\n" +
                "ID: %s\n" +
                "Courses:\n", name, id, getAllCoursesInfo());
    }
}
