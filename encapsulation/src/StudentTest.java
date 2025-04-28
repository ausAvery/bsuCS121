public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("John Daily", "Joe Daily", "Computer Science",
                21, 3.68);

        System.out.println(student1.getStuName());
        student1.setStuName("Bill Daily");
        System.out.println(student1.getStuName());

        student1.displayStudentInfo();
    }
}
