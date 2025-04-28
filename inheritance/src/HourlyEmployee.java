public class HourlyEmployee extends Employee {
    // instance variables
    private double wage;
    private int hours;

    // constructor
    public HourlyEmployee(int id, String name, double wage, int hours) {
        super(id, name);
        this.wage = wage;
        this.hours = hours;
    }

    // methods
    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\n" +
                        "ID: %d\n" +
                        "Wage: $%.2f\n" +
                        "Hours: %d\n",
                name, id, wage, hours);
    }
}
