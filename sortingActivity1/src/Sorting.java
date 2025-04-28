import java.util.Scanner;

public class Sorting {

    public int[] getArray() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("Input 5 unsorted numbers:");

        for (int i = 0; i < array.length; i++){
            System.out.printf("\tNumber %d: ", i + 1);
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        scanner.close();
        return array;
    }

    public int[] sortArray(int[] array) {
        int temp;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
