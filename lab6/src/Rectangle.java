import java.util.Scanner;

public class Rectangle {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double length = getLength();
        double width = getWidth();
        double area = getArea(length, width);
        displayData(length, width, area);
        scanner.close();
    }

    static double getLength() {
        System.out.print("Enter rectangle length: ");
        double rectLength = Double.parseDouble(scanner.nextLine());
        return rectLength;
    }

    static double getWidth() {
        System.out.print("Enter rectangle width: ");
        double rectWidth = Double.parseDouble(scanner.nextLine());
        return rectWidth;
    }

    static double getArea(double length, double width) {
        double area;
        area = length * width;
        return area;
    }

    static void displayData(double length, double width, double area) {
        System.out.println("Rectangle length: " + length);
        System.out.println("Rectangle width: " + width);
        System.out.println("Rectangle area: " + area);
    }
}
