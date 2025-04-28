package examples.student;

public class Student {
    // instance variables declared
    public String name;
    private String id;
    public String classStanding;
    public String major;
    private double gpa;

    // constructor
    public Student(String name, String id, String classStanding, String major, double gpa) {
        // variables assigned the values of each instance of a Student
        this.name = name;
        this.id = id;
        this.classStanding = classStanding;
        this.major = major;
        this.gpa = gpa;
    }

    // public visibility means that his method can be accessed anywhere in the program,
    // so long as you have an instance of this class to call it from
    public void printStudentInfo() {
        System.out.printf("Name: %s\nClass Standing: %s\nMajor: %s\n",
                name, classStanding, major);
    }

    // private visibility means that this method can only be accessed inside of this class
    private void printStudentId() {
        System.out.printf("Name: %s\nID: %s\n", name, id);
    }

    // protected visibility means that this method can only be accessed inside of this package
    // and from subclasses of this class
    protected void printStudentRecord() {
        System.out.printf("Name: %s\nClass Standing: %s\nMajor: %s\nGPA: %.1f\n",
                name, classStanding, major, gpa);
    }

    // default visibility (no keyword) means that this method can be accessed only within the
    // package that it is written in
    void printStudent() {
        System.out.printf("Name: %s\n", name);
    }
}
