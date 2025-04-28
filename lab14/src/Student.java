import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    // instance variables
    protected String name;
    protected String id;
    protected HashMap<String, Course> courseHashMap = new HashMap<>();

    // constructor
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // methods
    public String getName() {
        return name;
    }

    public void addCourse(String name, Course course) {
        courseHashMap.put(name, course);
    }

    public void removeCourse(String name) {
        courseHashMap.remove(name);
    }

    public Course getCourse(String courseName) {
        Course foundCourse = null;
        if (courseHashMap.containsKey(courseName)) {
            foundCourse = courseHashMap.get(courseName);
        }
        return foundCourse;
    }

    public StringBuilder getAllCourses() {
        StringBuilder courseStringBuilder = new StringBuilder();
        courseHashMap.forEach((courseName, course) -> {
            courseStringBuilder.append(course.toString());
        });
        return courseStringBuilder;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\n" +
                "ID: %s\n" +
                "Course(s):\n%s",name, id, getAllCourses().toString());
    }
}
