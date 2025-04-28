public class Sorting {

    public void selectionSort(int[] array) {
        // loop to move boundary of unsorted array
        for (int i = 0; i < array.length - 1; i++) {
            // assume element at index[0] is the smallest value
            int min = i;

            // loop through unsorted array
            // start with j at i + 1 so we can compare, in first loop, [0] with [1], etc
            for (int j = i + 1; j < array.length; j++) {
                // see if element at index j is less than the minimum
                if (array[j] < array[min]) { // swap < to > to accomplish descending order
                    // if it is, we set minimum value to that index number
                    min = j;
                }
            }
            // swap the element at the minimum with the
            // element at the beginning of the unsorted array
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    } // end selectionSort() {}

    public void insertionSort(int[] array) {
        int temp; // temporary variable for swapping elements
        // loop through array starting at the second index [1],
        // assuming [0] is already sorted
        for (int i = 1; i < array.length; i++) {
            // loop while j > 0 (could use a while loop instead of for)
            // decrement j each loop
            for (int j = i; j > 0; j--) {
                // check if element at j is less than preceding element
                if (array[j] < array[j - 1]) { // swap < to > to accomplish descending order
                    // if less, swap
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    } // end insertionSort() {}

    public void quickSort(int[] array, int start, int end) {
        // call partition method to divide the array
        int pivot = partition(array, start, end);
        if (start < pivot - 1) {
            // call quickSort recursively
            quickSort(array, start, pivot - 1);
        }
        if (pivot < end) {
            // call quickSort recursively
            quickSort(array, pivot, end);
        }
    } // end quickSort() {}

    public int partition(int[] array, int start, int end) {
        int i = start;
        int j = end;
        int temp;
        // pivot is middle index
        int pivot = array[(start + end) / 2];
        // make left less than pivot and right greater than pivot
        while (i <= j) {
            // check until all values on left side are lower than pivot
            while (array[i] < pivot) {
                i++;
            }
            // check until all values on right side are higher than pivot
            while (array[j] > pivot) {
                j--;
            }
            // compare values from both sides of pivot to see if they
            // should swap. after swap, move to next element on both sides.
            if (i <= j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        return i; // return i as new pivot
    } // end partition() {}
}
