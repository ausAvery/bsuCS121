public class Employee {
    private String name;
    private int id;
    private String position;
    private String department;

    // Constructor
    public Employee(String name, int id, String position, String department) {
        this.name = name;
        this.id = id;
        this.position = position;
        this.department = department;
    }

    // toString method
    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Position: "
                + position + ", Department: " + department;
    }
}
