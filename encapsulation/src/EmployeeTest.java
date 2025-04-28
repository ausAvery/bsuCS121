public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", "12345", 76500.22, 5000, 0.10);

        System.out.print("First employee.getName: ");
        employee1.getName();
        System.out.println();

        employee1.getEmployeeInfo();
        System.out.println();

        System.out.print("First employee.setName: ");
        employee1.setName("Billy Bob Thorton");

    }
}
