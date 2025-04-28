public class Student {
    // instance variables
    private String stuName;
    private String parName;
    private String major;
    private int age;
    private double gpa;

    // constructor
    public Student(String stuName, String parName, String major, int age, double gpa) {
        this.stuName = stuName;
        this.parName = parName;
        this.major = major;
        this.age = age;
        this.gpa = gpa;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String name) {
        this.stuName = name;
    }

    public void displayStudentInfo() {
        System.out.printf("\n%s STUDENT INFO %s\n", "-".repeat(5), "-".repeat(5));
        System.out.printf("Student Name: %s\n" +
                "Parent Name: %s\n" +
                "Student Major: %s\n" +
                "Student Age: %d\n" +
                "Student GPA: %.2f\n", stuName, parName, major, age, gpa);
    }
}
