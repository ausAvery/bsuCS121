public class SortingTest {
    public static void main(String[] args) {
        /*  create an instance of the Sorting class
            so that we can run the public methods from it */
        Sorting sorter = new Sorting();

        int[] array = {30, 16, 24, 62, 25, 7};

        System.out.print("Unsorted: ");
        printArray(array);

//        sorter.selectionSort(array);
//        System.out.print("Selection Sort: ");
//        printArray(array);

//        sorter.insertionSort(array);
//        System.out.print("Insertion Sort: ");
//        printArray(array);

        // parameters for quickSort include start and ending index numbers
        sorter.quickSort(array, 0, array.length - 1);
        System.out.print("Quick Sort: ");
        printArray(array);
    }

    /*  static method to print an array;
        static means we don't have to create an instance
        of this class to call the method */
    static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
