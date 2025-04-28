public class Main {
    public static void main(String[] args) {
        Sorting sorting = new Sorting();

        int[] unsortedArray = sorting.getArray();
        System.out.print("Unsorted array: ");
        printArray(unsortedArray);

        int[] sortedArray = sorting.sortArray(unsortedArray);
        System.out.print("Sorted array: ");
        printArray(sortedArray);
    }

    static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
