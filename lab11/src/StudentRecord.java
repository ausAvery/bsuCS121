import java.util.ArrayList;

public class StudentRecord {
    private ArrayList<Student> students;

    // constructor
    public StudentRecord() {
        students = new ArrayList<>();
    }

    // methods
    public void addStudent(Student student) {
        students.add(student);
    }

    public boolean removeStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                return true;
            }
        }
        return false;
    }

    public Student getStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public String getAllStudentsInfo() {
        StringBuilder sb = new StringBuilder();
        for (Student student : students) {
            sb.append(student.toString()).append("\n");
        }
        return sb.toString();
    }
}
