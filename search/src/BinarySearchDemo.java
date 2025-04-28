public class BinarySearchDemo {
    public int binarySearch(int key, int[] array) {
        int counter = 0; // keeps track of comparisons
        int low = 0;
        int high = array.length;
        int mid = (low + high) / 2;

        while (low <= high && array[mid] != key) {
            System.out.println("Comparison: " + ++counter);
            if (array[mid] < key) {                 // if mid is less than key...
                low = mid + 1;                      // low is reset to position after mid
            } else  {         // otherwise, if mid is greater than key
                high = mid - 1;                     // high is reset to position before mid
            }
            mid = (low + high) / 2;                 // mid is reset to mid between new low/high
        }

        if (array[mid] != key) {                           // if not found
            mid = -1;
        }

        return mid;
    }
}
