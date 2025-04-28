public class UniversityTest {
    public static void main(String[] args) {
        UniversityMember member1 = new UniversityMember("John", "Doe", 32);
        System.out.println("MEMBER 1");
        System.out.println(member1.getFirstName());
        System.out.println(member1.getLastName());
        System.out.println(member1.getAge());
        System.out.println(member1);

        Student member2 = new Student("Jane", "Doe", 19, "Freshman", 80012);
        System.out.println("MEMBER 2");
        System.out.println(member2.getFirstName());
        System.out.println(member2.getLastName());
        System.out.println(member2.getAge());
        System.out.println(member2.getYear());
        System.out.println(member2.getStudentId());
        System.out.println(member2);

        Staff member3 = new Staff("Jack", "Doe", 67, 23, 1234);
        System.out.println("MEMBER 3");
        System.out.println(member3.getFirstName());
        System.out.println(member3.getLastName());
        System.out.println(member3.getAge());
        System.out.println(member3.getYearsEmployeed());
        System.out.println(member3.getEmployeeId());
        System.out.println(member3);
    }
}
