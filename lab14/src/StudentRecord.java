import java.util.ArrayList;
import java.util.HashMap;

public class StudentRecord {
    // instance variables
    private HashMap<String, Student> studentHashMap = new HashMap<>();

    // default constructor

    // methods
    public void addStudent(String studentId, Student student) {
        studentHashMap.put(studentId, student);
    }

    public void removeStudent(String id) {
        studentHashMap.remove(id);
    }

    public Student getStudent(String id) {
        Student foundStudent = null;
        if (studentHashMap.containsKey(id)) {
            foundStudent = studentHashMap.get(id);
        }
        return foundStudent;
    }

    public StringBuilder getAllStudents() {
        StringBuilder studentStringBuilder = new StringBuilder();
        studentHashMap.forEach((id, student) -> {
            studentStringBuilder.append(student.toString());
        });
        return studentStringBuilder;
    }
}
