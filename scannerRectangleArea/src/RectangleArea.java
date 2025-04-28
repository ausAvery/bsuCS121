import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length;
        int width;
        int area;

        System.out.print("Enter the length of a rectangle: ");
        length = Integer.parseInt(input.nextLine());
        System.out.print("Enter the width of a rectangle: ");
        width = Integer.parseInt(input.nextLine());

        area = length * width;

        System.out.printf("\nArea: %d", area);
    }
}