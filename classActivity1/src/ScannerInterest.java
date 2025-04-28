import java.util.Scanner;

public class ScannerInterest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double endAmount;
        double principal;
        double interestRate;
        int compoundRate;
        int years;

        System.out.print("Enter the principal amount: ");
        principal = Double.parseDouble(console.nextLine());
        System.out.print("Enter the annual rate: ");
        interestRate = Double.parseDouble(console.nextLine()) / 100;
        System.out.print("Enter the number of times compounded: ");
        compoundRate = Integer.parseInt(console.nextLine());
        System.out.print("Enter the years: ");
        years = Integer.parseInt(console.nextLine());

        //endAmount = principal(1 + interestRate/compoundRate)^compoundRate*years
        endAmount = principal * Math.pow(1 + interestRate / compoundRate, compoundRate * years);

        System.out.printf("The balance of the account after %d years is $%.2f%n", years, endAmount);

    }
}