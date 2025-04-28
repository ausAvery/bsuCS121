public class EmployeeTest {
    public static void main(String[] args) {
        // Create EmployeeRecord instance
        EmployeeRecord record = new EmployeeRecord();

        // Add Employees
        record.addEmployee(new Employee("Alice Johnson", 1001, "Manager", "Sales"));
        record.addEmployee(new Employee("Bob Smith", 1002, "Developer", "IT"));
        record.addEmployee(new Employee("Carol White", 1003, "Analyst", "Finance"));

        // Retrieve and print
        String allEmployees = record.getAllEmployees();
        System.out.println("Employee List:\n" + allEmployees);
    }
}
