package examples.interfaces;

public class ContractWorker implements Pay, Insurance {
    // instance variables
    private int contractNumber;
    private String name;
    private double salary;

    // constructor
    public ContractWorker(int contractNumber, String name, double salary) {
        this.contractNumber = contractNumber;
        this.name = name;
        this.salary = salary;
    }

    // methods
    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
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
        return salary / 12;
    }

    public double calculateInsuranceRate() {
        double rate = 0.5;
        return rate;
    }
}
