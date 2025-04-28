import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private Bank bank;

    public Menu() {
        scanner = new Scanner(System.in);
        bank = new Bank();
    }

    public void displayMainMenu() {
        while (true) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Open a new account");
            System.out.println("2. Access an existing account");
            System.out.println("3. Close all accounts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int selection = Integer.parseInt(scanner.nextLine());

            if (selection == 1) {
                openNewAccount();
            }
            else if (selection == 2) {
                accessAccount();
            }
            else if (selection == 3) {
                closeAllAccounts();
            }
            else if (selection == 4) {
                System.out.println("Exiting system. Goodbye!");
                break;
            }
            else {
                System.out.println("Invalid entry. Please select from 1 to 4.");
            }
        }
    }

    private void accessAccount() {
        System.out.print("Enter your PIN: ");
        String pin = scanner.nextLine();
        Customer customer = bank.getCustomerByPin(pin);
        if (customer == null) {
            System.out.println("PIN is not valid");
            return;
        }
        System.out.println("Accounts for " + customer.toString() + ":");
        System.out.println(customer.getAllAccountsInfo());
        System.out.print("Enter the account number you want to access: ");
        String accNumberStr = scanner.nextLine().trim();
        if (!accNumberStr.matches("\\d+")) {
            System.out.println("Invalid account number.");
            return;
        }
        int accNumber = Integer.parseInt(accNumberStr);
        Account account = customer.getAccountByNumber(accNumber);
        if (account == null) {
            System.out.println("Account number invalid");
            return;
        }
        accountMenu(customer, account);
    }

    private void accountMenu(Customer customer, Account account) {
        while (true) {
            System.out.println("\n--- Account Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Close Account");
            System.out.println("5. Return to Main Menu");
            System.out.print("Enter your choice: ");
            String choiceStr = scanner.nextLine().trim();

            if (choiceStr.equals("1")) {
                System.out.print("Enter deposit amount: ");
                String depositStr = scanner.nextLine().trim();
                if (depositStr.matches("\\d+(\\.\\d+)?")) {
                    double depositAmount = Double.parseDouble(depositStr);
                    account.deposit(depositAmount);
                } else {
                    System.out.println("Invalid deposit amount.");
                }
            } else if (choiceStr.equals("2")) {
                System.out.print("Enter withdrawal amount: ");
                String withdrawStr = scanner.nextLine().trim();
                if (withdrawStr.matches("\\d+(\\.\\d+)?")) {
                    double withdrawAmount = Double.parseDouble(withdrawStr);
                    account.withdraw(withdrawAmount);
                } else {
                    System.out.println("Invalid withdrawal amount.");
                }
            } else if (choiceStr.equals("3")) {
                System.out.println("Current Balance: $" + account.getBalance());
            } else if (choiceStr.equals("4")) {
                customer.removeAccount(account);
                System.out.println("Account " + account.getAccountNumber() + " closed.");
                break;
            } else if (choiceStr.equals("5")) {
                break;
            } else {
                System.out.println("Invalid entry. Please select from 1 to 5.");
            }
        }
    }

    private void openNewAccount() {
        System.out.print("Are you a new customer? (yes/no): ");
        String response = scanner.nextLine().trim().toLowerCase();
        Customer customer;
        if (response.equals("yes")) {
            customer = createNewCustomer();
        } else {
            System.out.print("Enter your PIN: ");
            String pin = scanner.nextLine();
            customer = bank.getCustomerByPin(pin);
            if (customer == null) {
                System.out.println("PIN is not valid.");
                return;
            }
        }
        System.out.print("Enter initial deposit amount: ");
        String depositStr = scanner.nextLine().trim();
        if (depositStr.matches("\\d+(\\.\\d+)?")) {
            double initialDeposit = Double.parseDouble(depositStr);
            Account newAccount = new Account(initialDeposit);
            customer.addAccount(newAccount);
            System.out.println("New Account Opened: " + newAccount.getAccountNumber());
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    private Customer createNewCustomer() {
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter a 4-digit PIN: ");
        String pin = scanner.nextLine();
        Customer customer = new Customer(firstName, lastName, pin);
        bank.addCustomer(customer);
        return customer;
    }

    private void closeAllAccounts() {
        System.out.print("Enter your PIN to close all accounts: ");
        String pin = scanner.nextLine();
        Customer customer = bank.getCustomerByPin(pin);
        if (customer == null) {
            System.out.println("PIN is not valid.");
            return;
        }
        bank.removeCustomer(customer);
        System.out.println("Customer " + customer.toString() + " has been removed from the bank registry.");
    }
}
