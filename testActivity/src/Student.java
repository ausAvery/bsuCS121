public class Student {
    // instance variables
    private String stuName;
    private int stuID;

    // constructor
    public Student(String name, int id) {
        this.stuName = name;
        this.stuID = id;
    }

    // methods
    public String getStuName() {
        return stuName;
    }

    public int getStuID() {
        return stuID;
    }
}
