import javax.swing.*;

public class HelloWorld {
    public static void main(String[] args) {
        double wage;
        int hours;
        double pay;

        wage = Double.parseDouble(JOptionPane.showInputDialog("Enter the wage: "));

        hours = Integer.parseInt(JOptionPane.showInputDialog("Enter the hours worked: "));

        pay = wage * hours;

        JOptionPane.showMessageDialog(null, String.format("Pay is $%.2f", pay));
    }
}
