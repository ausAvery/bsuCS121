package Students;

public class UnderGradStudent extends Student {
    // instance variables
    private String major;

    public UnderGradStudent(String name, int id, double gpa, String major) {
        super(name, id, gpa);
        this.major = major;
    }

    /* OVERRIDING */
    @Override
    public String toString() {
        return String.format("Student: %s\n" +
                "Student ID: %d\n" +
                "Student GPA: %.2f\n" +
                "Student Major: %s\n",
                name, id, gpa, major);
    }

}
