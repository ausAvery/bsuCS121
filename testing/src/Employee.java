public class Employee { // EMPLOYEE Class, everything in the class is an object of the class
    // instance variables
    private String name = "NO NAME";
    private String id = "INVALID";
    private double salary = 0.00;

    // constructor
    public Employee(String eName, String eId, double eSalary) {
        this.name = eName;
        this.id = eId;
        this.salary = eSalary;
    }

    // default constructor
    public Employee() {

    }

    // methods
    public void print() {
        System.out.printf("Name: %s\n" +
                "ID: %s\n" +
                "Salaray: $%.2f\n",
                name, id, salary);
        System.out.println();
    }

    // getters and setters
    public String getName() { // accessor
        return name;
    }

    public void setName(String newName) { // mutator
        name = newName;
    }
}
