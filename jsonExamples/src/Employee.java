public class Employee {
    // instance variables
    private String name;
    private int id;
    private String department;

    // constructor
    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    // methods
    @Override
    public String toString() {
        return String.format("Name: %s\n" +
                "ID: %d\n" +
                "Department: %s\n",
                name, id, department);
    }
}
