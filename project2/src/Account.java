public class Account {
    // instance variables
    private double balance;
    private int accountNumber;
    private static int numberOfAccounts = 1000; // starting value

    // constructor
    public Account(double initialDeposit) {
        this.balance = initialDeposit;
        numberOfAccounts++;
        this.accountNumber = numberOfAccounts;
    }

    // methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("Updated Balance: $" + balance);
        }
        else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        }
        else if (amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("Updated Balance: $" + balance);
        }
        else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return String.format("Account Number: %d\n" +
                "Balance: $%.2f\n",
                accountNumber, balance);
    }
}

