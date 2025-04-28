import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter number of array elements: ");
        final int NUM_ELEMENTS = Integer.parseInt(console.nextLine());

        int[] array1 = new int[NUM_ELEMENTS];
        int[] array2 = new int[NUM_ELEMENTS];
        int[] array3 = new int[NUM_ELEMENTS];
        int[] array4 = new int[NUM_ELEMENTS];

        for (int i = 0; i < NUM_ELEMENTS; i++) {
            System.out.printf("Enter array element %d: ", i);
            array1[i] = Integer.parseInt(console.nextLine());
        }

        System.out.println("\nArray 1");
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        System.out.println("\nArray 2 - copy");
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            array2[i] = array1[i];
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        System.out.println("\nArray 3 - squared");
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            array3[i] = array1[i] * array1[i];
            System.out.print(array3[i] + " ");
        }
        System.out.println();

        System.out.println("\nArray 4 - reversed");
        for (int i = (array1.length) - 1; i >= 0; i--) {
            array4[i] =  array1[i];
            System.out.print(array4[i] + " ");
        }

        console.close();
    }
}
