package examples.interfaces;

public class Employee implements Pay {
    // instance variables
    private int id;
    private String name;
    private double salary;

    // constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculatePay() {
        return salary/52;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nID: %d\nSalary: $%.2f\n", name, id, salary);
    }
}
