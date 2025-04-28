public class Employee {
    // instance variables
    private String name;
    private String id;
    private double salary;
    private double bonus;
    private double raise;
    private double totalPay;

    // constructor
    public Employee(String name, String id, double salary, double bonus, double raise) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
        this.raise = raise;
    }

    // method to calculate total pay
    public double calculateTotalPay() {
        totalPay = (salary + bonus) * raise;
        totalPay = salary + bonus + totalPay;
        return totalPay;
    }

    public void getName() {
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }

    public void getEmployeeInfo() {
        System.out.printf("Name: %s\n" +
                "ID: %s\n" +
                "Bonus: %.2f\n" +
                "Salary: %.2f\n" +
                "Raise: %.2f\n" +
                "Total Earnings: $%.2f\n",
                name, id, bonus, salary, raise, calculateTotalPay());
    }
}
