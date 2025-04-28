import javax.swing.JOptionPane;
import java.util.Objects;

public class Login {
    public static void main(String[] args) {
        String userName = "CS121User";
        String password = "Passw.rd";

        String name = JOptionPane.showInputDialog("Enter your username:");
        String pw = JOptionPane.showInputDialog("Enter your password:");

        if (name.equals(userName)) {
            if (pw.equals(password)) {
                JOptionPane.showMessageDialog(null, "Welcome to CS121!");
            }
            else {
                JOptionPane.showMessageDialog(null, "Incorrect password.");
            }
        }
        else if (pw.equals(password)) {
            JOptionPane.showMessageDialog(null, "Incorrect username.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Both username and password were incorrect.");
        }
    }
}