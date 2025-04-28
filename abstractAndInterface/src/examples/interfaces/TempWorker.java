package examples.interfaces;

public class TempWorker implements Pay, Insurance {
    // instance variables
    private int departmentNumber;
    private String name;
    private double salary;

    // constructor
    public TempWorker(int deptNumber, String name, double salary) {
        this.departmentNumber = deptNumber;
        this.name = name;
        this.salary = salary;
    }

    // methods
    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double calculatePay() {
        return salary / 26;
    }

    public double calculateInsuranceRate() {
        double rate = 0.5;
        return rate;
    }
}
