import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int side1;
        int side2;
        int side3;

        System.out.println("Please enter lengths for the 3 sides of a triangle.");
        System.out.print("\tSide 1: ");
        side1 = console.nextInt();
        System.out.print("\tSide 2: ");
        side2 = console.nextInt();
        System.out.print("\tSide 3: ");
        side3 = console.nextInt();

        if (side1 == side2) {
            if (side2 == side3) {
                System.out.println("This triangle is an equilateral: all sides are equal.");
            }
            else {
                System.out.println("This triangle is an isosceles: two sides have the same length.");
            }
        }
        else if (side1 == side3) {
            System.out.println("This triangle is an isosceles: two sides have the same length.");
        }
        else if (side2 == side3) {
            System.out.println("This triangle is an isosceles: two sides have the same length.");
        }
        else {
            System.out.println("This triangle is scalene: all sides have different lengths.");
        }
    }
}