import java.sql.SQLOutput;

public class SortingTest {
    public static void main(String[] args) {
        /* create an instance of the Sorting class
        so that we can run the public methods from it */
        Sorting sorter = new Sorting();

//        int[] array = {30, 16, 24, 62, 25, 7};
//
//        System.out.print("Unsorted: ");
//        printArray(array);
//
//        sorter.ascendingBubbleSort(array);
//        System.out.print("Sorted ascending: ");
//        printArray(array);
//
//        sorter.descendingBubbleSort(array);
//        System.out.print("Sorted descending: ");
//        printArray(array);

        int[] array2 = {3, 6, 2, 9, 0, 13, 65, 34, 23, 32, 27, 1, 5};

        System.out.print("Unsorted: ");
        printArray(array2);

        sorter.mergeSort(array2);
        System.out.print("Sorted ascending: ");
        printArray(array2);
    }

    // static method to print an array
    // static means we don't have to create an instance
    // of this class to call the method
    static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }
}
