public class Sorting {

    public void ascendingBubbleSort(int[] array) {
        // variable to temporarily hold a value during switch
        int temp;

        // loop through the whole array once for each element in the array
        for (int i = 0; i < array.length; i++) {
            /* for each unsorted element, loop through and compare to next element
            length - i - 1 because we only need to loop through unsorted elements */
            for (int index = 0; index < array.length - 1; index++) {
                // compares unsorted element to next element
                if (array[index] > array[index + 1]) {
                    // temporarily holds value
                    temp = array[index];
                    // assigns next value to current index
                    array[index] = array[index + 1];
                    // assigns current value to next index
                    array[index + 1] = temp;
                }
            }
        }
    } // end ascendingBubbleSort() {}

    public void descendingBubbleSort(int[] array) {
        // variable to temporarily hold a value during switch
        int temp;

        // loop through the whole array once for each element in the array
        for (int i = 0; i < array.length; i++) {
            /* for each unsorted element, loop through and compare to next element
            length - i - 1 because we only need to loop through unsorted elements */
            for (int index = 0; index < array.length - 1; index++) {
                // compares unsorted element to next element
                if (array[index] < array[index + 1]) {
                    // temporarily holds value
                    temp = array[index];
                    // assigns next value to current index
                    array[index] = array[index + 1];
                    // assigns current value to next index
                    array[index + 1] = temp;
                }
            }
        }
    } // end descendingBubbleSort() {}

    public void mergeSort(int[] array) {
        // if array has 1 element, return:
        // base case: stops recursive call -- mergeSort method stops
        if (array.length <= 1) {
            return; // a method will stop when it reaches a return statement
        }

        // initialize array with size of left half the original array
        int[] leftHalf = new int[array.length / 2];
        // initialize array with size of right half the original array
        int[] rightHalf = new int[array.length - leftHalf.length];

        // assigning values from the left half of original array to leftHalf array
        for (int i = 0; i < leftHalf.length; i++) {
            leftHalf[i] = array[i];
        }

        // assigning values from the right half of original array to rightHalf array
        for (int i = 0; i < rightHalf.length; i++) {
            rightHalf[i] = array[leftHalf.length + i];
        }

        // recursive call until arrays reach base case: 1 element
        mergeSort(leftHalf);    // recursive call: divide leftHalf array into smaller arrays
        mergeSort(rightHalf);       // recursive call: divide rightHalf array into smaller arrays

        // call merge method to merge the divided arrays
        mergeAscending(leftHalf, rightHalf, array);
    } // end mergeSort() {}

    private void mergeAscending(int[] leftHalf, int[] rightHalf, int[] array) {
        int leftIndex = 0;
        int rightIndex = 0;
        int arrayIndex = 0;

        // advance leftHalf array index or rightHalf array index accordingly
        while ((leftIndex < leftHalf.length) && (rightIndex < rightHalf.length)) {
            if (leftHalf[leftIndex] < rightHalf[rightIndex]) {
                array[arrayIndex] = leftHalf[leftIndex];
                leftIndex++;
                arrayIndex++;
            }
            else {
                array[arrayIndex] = rightHalf[rightIndex];
                rightIndex++;
                arrayIndex++;
            }
        }

        // copy the rest of leftHalf array to original array
        while (leftIndex < leftHalf.length) {
            array[arrayIndex] = leftHalf[leftIndex];
            arrayIndex++;
            leftIndex++;
        }

        // copy the rest of rightHalf array to original array
        // --NOTE: only one of these while loops will be true
        while (rightIndex < rightHalf.length) {
            array[arrayIndex] = rightHalf[rightIndex];
            arrayIndex++;
            rightIndex++;
        }

    } // end merge() {}
}
