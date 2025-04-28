package Students;

public class Student {
    // instance variables aka fields (attributes)
    protected String name;
    protected int id;
    protected double gpa;

    /*
    OVERLOADING w/ Constructors
    */

    // constructor w/ no parameters -- default
    public Student(){}

    // constructor w/ only name for parameter--id and gpa are set with setters
    public Student(String name) {
        this.name = name;
    }

    // constructor w/ all parameters
    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    // methods
    public String calculateGpa() {
        return String.format("GPA on 12-point Scale: %.2f\n",
                gpa * 3.00);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    /*
    OVERRIDING
    */

    @Override
    public String toString() {
        return String.format("Student: %s\n" +
                "Student ID: %d\n" +
                "Student GPA: %.2f\n",
                name, id, gpa);
    }
}
