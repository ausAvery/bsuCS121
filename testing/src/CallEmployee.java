public class CallEmployee {
    public static void main(String[] args) {
        // instance of the Employee class
        Employee employee1 = new Employee("John Doe", "ABC123", 85250.55);

        // declare an instance of class Employee
        Employee employee2;

        // initialize an instance of class Employee
        employee2 = new Employee();

        // call the method print() from Employee class
        employee1.print();
        employee2.print();

        System.out.println(employee1.getName());
        employee2.setName("Billy Bob, Jr.");
        System.out.println(employee2.getName());

    }
}
