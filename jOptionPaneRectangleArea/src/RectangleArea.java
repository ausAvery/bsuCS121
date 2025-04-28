import javax.swing.*;

public class RectangleArea {
    public static void main(String[] args) {
        int length;
        int width;
        int area;

        length = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of a rectangle: "));
        width = Integer.parseInt(JOptionPane.showInputDialog("Enter the width of a rectangle: "));

        area = length * width;

        JOptionPane.showMessageDialog(null, String.format("Area: %d", area));
    }
}