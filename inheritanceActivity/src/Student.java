public class Student extends UniversityMember {
    // instance
    private String year;
    private int studentId;

    // constructor
    public Student(String firstName, String lastName, int age, String year, int studentId) {
        super(firstName, lastName, age);
        this.year = year;
        this.studentId = studentId;
    }

    // methods
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return String.format("Name(last, first): %s, %s\n" +
                "Age: %d\n" +
                "Year in School: %s\n" +
                "Student ID: %d\n",
                lastName, firstName, age, year, studentId);
    }
}
