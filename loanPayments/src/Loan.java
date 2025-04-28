public class Loan {
    private double loanAmount;
    private double annualInterestRate;
    private int numberOfYears;

    public Loan (double amount, double interestRate, int years) {
        this.loanAmount = amount;
        this.annualInterestRate = interestRate;
        this.numberOfYears = years;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - (Math.pow(1 / (1 + monthlyInterestRate),
                numberOfYears * 12)));
        return monthlyPayment;
    }

    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * 12 * numberOfYears;
        return totalPayment;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }
}
