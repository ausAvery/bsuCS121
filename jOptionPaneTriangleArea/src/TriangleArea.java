import javax.swing.*;

public class TriangleArea {
    public static void main(String[] args) {
        int height;
        int base;
        int area;

        height = Integer.parseInt(JOptionPane.showInputDialog("Enter the height of a triangle: "));
        base = Integer.parseInt(JOptionPane.showInputDialog("Enter the base of a triangle: "));

        area = (base * height) / 2;

        JOptionPane.showMessageDialog(null, String.format("Area: %d", area));
    }
}