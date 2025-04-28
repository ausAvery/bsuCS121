public class Course {
    // instance variables
    private String courseName;
    private int credits;

    // constructor
    public Course(String name, int credits) {
        this.courseName = name;
        this.credits = credits;
    }

    // methods
    public String getCourseName() {
        return this.courseName;
    }

    @Override
    public String toString() {
        return String.format("Course: %s\n" +
                        "Credits: %s\n\n",
                courseName, credits);
    }
}
