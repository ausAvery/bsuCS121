package examples.interfaces;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(12345, "John Doe", 80000);
        System.out.printf("Weekly Salary: $%.2f\n", employee1.calculatePay());
    }
}
