import javax.swing.*;

public class DialogBoxInterest {
    public static void main(String[] args) {
        double endAmount;
        double principal;
        double interestRate;
        int compoundRate;
        int years;

        principal = Double.parseDouble(JOptionPane.showInputDialog("Enter the principal amount:"));
        interestRate = Double.parseDouble(JOptionPane.showInputDialog("Enter the annual rate: ")) / 100;
        compoundRate = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of times compounded: "));
        years = Integer.parseInt(JOptionPane.showInputDialog("Enter the years: "));

        //endAmount = principal(1 + interestRate/compoundRate)^compoundRate*years
        endAmount = principal * Math.pow(1 + interestRate/compoundRate, compoundRate*years);

        JOptionPane.showMessageDialog(null, String.format("The balance of the account after %d years is $%.2f",
                years, endAmount));
    }
}
