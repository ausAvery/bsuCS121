import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int length;
        int width;
        int perimeter;

        System.out.print("Enter the length of a rectangle: ");
        length = Integer.parseInt(keyboard.nextLine());
        System.out.print("Enter the width of a rectangle: ");
        width = Integer.parseInt(keyboard.nextLine());

        perimeter = 2 * (length + width);

        System.out.printf("\nThe perimeter is: %d", perimeter);
    }
}