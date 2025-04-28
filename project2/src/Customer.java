import java.util.ArrayList;

public class Customer {
    // instance variables
    private String firstName;
    private String lastName;
    private String pin;
    private ArrayList<Account> accounts;

    // constructor
    public Customer(String firstName, String lastName, String pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        this.accounts = new ArrayList<>();
    }

    // methods
    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public Account getAccountByNumber(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public String getAllAccountsInfo() {
        StringBuilder info = new StringBuilder();
        for (Account account : accounts) {
            info.append(account.toString()).append("\n");
        }
        return info.toString();
    }

    public String getPin() {
        return pin;
    }

    @Override
    public String toString() {
        return String.format("Customer: %s %s\n" +
                "PIN: %s",
                firstName, lastName, pin);
    }
}
