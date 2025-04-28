import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the loan amount:\n>> ");
        double loanAmount = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the annual interest rate:\n>> ");
        double interest = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the number of years:\n>> ");
        int years = Integer.parseInt(scanner.nextLine());

        Loan loan1 = new Loan(loanAmount, interest, years);

        displayMenu(loan1);

        scanner.close();
    }

    static void displayMenu(Loan loan) {
        int userInput = 0;

        while (userInput != 6) {
            System.out.println("\n" +
                    "Menu\n" +
                    "----------");
            System.out.print("Select an option by number:\n" +
                    "1. Loan amount\n" +
                    "2. Interest rate\n" +
                    "3. Years of loan\n" +
                    "4. Montly payment\n" +
                    "5. Total payment\n" +
                    "6. Exit\n" +
                    ">> ");

            userInput = Integer.parseInt(scanner.nextLine());

            if (userInput == 1) {
                System.out.printf("\nLoan Amount: $%.2f%n", loan.getLoanAmount());
            }
            else if (userInput == 2) {
                System.out.printf("\nInterest Rate: %.1f%n", loan.getAnnualInterestRate());
            }
            else if (userInput == 3) {
                System.out.printf("\nYears of Loan: %d%n", loan.getNumberOfYears());
            }
            else if (userInput == 4) {
                System.out.printf("\nMonthly Payment: $%.2f%n", loan.getMonthlyPayment());
            }
            else if (userInput == 5) {
                System.out.printf("\nTotal Payment: $%.2f%n", loan.getTotalPayment());
            }
            else {
                System.out.println();
            }
        }

        System.out.println("Thank you. Goodbye.");
        scanner.close();
    }
}
