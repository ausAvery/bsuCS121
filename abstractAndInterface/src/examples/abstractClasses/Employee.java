package examples.abstractClasses;

public abstract class Employee {
    // instance variables
    protected int id;
    protected String name;

    // constructor

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return String.format("Name: %s\nID: %d\n", name, id);
    }

    public abstract double calculatePay();
}
