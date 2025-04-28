public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(12345, "John Doe");
        System.out.println("EMPLOYEE 1");
        System.out.println(employee1.getName());
        System.out.println(employee1.getId());
        System.out.println(employee1);

        SalariedEmployee employee2 = new SalariedEmployee(2234, "Jane Doe", 75000);
        System.out.println("EMPLOYEE 2");
        System.out.println(employee2.getName());
        System.out.println(employee2.getId());
        System.out.println(employee2.getSalary());
        System.out.println(employee2);

        HourlyEmployee employee3 = new HourlyEmployee(12581, "Tommy Jones", 35.00, 40);
        System.out.println("EMPLOYEE 3");
        System.out.println(employee3.getName());
        System.out.println(employee3.getId());
        System.out.println(employee3.getWage());
        System.out.println(employee3.getHours());
        System.out.println(employee3);

        Employee[] employeeArray = {employee1, employee2, employee3};
        System.out.println("LIST OF EMPLOYEES");
        for (Employee employee : employeeArray) {
            System.out.println(employee);
        }
    }
}
