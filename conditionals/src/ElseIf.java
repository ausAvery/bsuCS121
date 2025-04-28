import javax.swing.*;

public class ElseIf {
    public static void main(String[] args) {
        int testScore;

        testScore = Integer.parseInt(JOptionPane.showInputDialog("Enter test score: "));

        if (testScore < 60) {
            JOptionPane.showMessageDialog(null, "Grade is F.");
        } else if (testScore < 70) {
            JOptionPane.showMessageDialog(null, "Grade is D.");
        } else if (testScore < 80) {
            JOptionPane.showMessageDialog(null, "Grade is C.");
        } else if (testScore < 90) {
            JOptionPane.showMessageDialog(null, "Grade is B.");
        } else {
            JOptionPane.showMessageDialog(null, "Grade is A.");
        }
    }
}
