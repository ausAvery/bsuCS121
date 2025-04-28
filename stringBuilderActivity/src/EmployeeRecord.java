import java.util.ArrayList;

public class EmployeeRecord {
    private ArrayList<Employee> employees;

    public EmployeeRecord() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public String getAllEmployees() {
        StringBuilder employeeInfo = new StringBuilder();

        for (Employee emp : employees) {
            employeeInfo.append(emp.toString()).append("\n");
        }

        return employeeInfo.toString();
    }
}
