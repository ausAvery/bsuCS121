import java.util.Arrays;

public class MinHeap {
    private int[] heap;
    private int size;
    private int maxSize;
    // skip index 0, use variable FRONT for index 1 and make it a constant (can't be changed)
    private static final int FRONT = 1;

    public MinHeap(int maxSize) {
        this.maxSize = maxSize; // maxSive set to value of constructor argument
        this.size = 0; // size initialized to 0
        this.heap = new int[this.maxSize + 1]; // heap array initialized with max size + 1 (for 0 index)
    }

    /* get index of parent of node with index of position, which will be at
    index position / 2
     */
    private int getParent(int position) {
        return position / 2;
    }

    /* get index of left child of node with index of position, which will
    be at index 2 * position */
    private int getLeftChild(int position) {
        return 2 * position;
    }

    /* get index of right child of node with index of position, which will
    be at index (2 * position) + 1 */
    private int getRightChild(int position) {
        return 2 * position + 1;
    }

    // check if node at index position is a leaf (no children)
    private boolean isLeaf(int position) {
        // if position is greater than or equal to half the size
        // and less than the size, it will be a leaf
        if (position >= (size / 2) && position <= size) {
            return true;
        }
        return false;
    }

    public void insert(int element) {
        heap[++size] = element; // add element to last spot, then increase size
        int current = size;     // current variable is set to size
        // which value of last element is less than its parent,
        // perform "bubble-up" operation
        while (heap[current] < heap[getParent(current)]) {
            swap(current, getParent(current));  // swap it with its parent
            // set current variable to value of its parent
            // (since the value has "bubbled-up" to its parent's position
            current = getParent(current);
        }
    }

    // swap values of 2 positions
    private void swap(int firstPosition, int secondPosition) {
        int temp;
        temp = heap[firstPosition];
        heap[firstPosition] = heap[secondPosition];
        heap[secondPosition] = temp;
    }

    public int remove() {
        int popped = heap[FRONT];   // the element at index 1 is removed
        heap[FRONT] = heap[size--]; // the element at last index is moved to first index position
        size--;                     // size is decremented
        // heap array is copied to new array named heap with one less element
        heap = Arrays.copyOf(heap, heap.length - 1);
        heapifyDown(FRONT);         // call minHeapify method with index 1 value as argument
        return popped;
    }

    // performs "bubble-down" operation
    private void heapifyDown(int position) {
        // if element at index 1 is not a leaf
        if (!isLeaf(position)) {
            // if element at index 1 is greater than either one of its children
            if (heap[position] > heap[getLeftChild(position)] || heap[position] > heap[getRightChild(position)]) {
                // if left child smaller than right...
                if (heap[getLeftChild(position)] < heap[getRightChild(position)]) {
                    swap(position, getLeftChild(position));     // swap the two elements
                    heapifyDown(getLeftChild(position));        // recursively call until element has "bubbled-down"
                                                                // to correct node
                }
                else {
                    // if right child is smaller, swap with it and bubble down
                    swap(position, getRightChild(position));
                    heapifyDown(getRightChild(position));
                }
            }
        }
    }

    public void printHeap() {
        System.out.println("Min Heap: ");
        for (int i = 1; i <+ size / 2; i++) {
            System.out.printf("%15s: %d%n", "PARENT", heap[i]);
            System.out.print("LEFT CHILD: " + heap[2 * i]);
            // to avoid index out of range error, since we divide size by 2 in for statement
            if (2 * i + 1 <= size) {
                System.out.println(" RIGHT CHILD: " + heap[2 * i + 1]);
            }
        }
        System.out.println();
    }

    public void printAsArray() {
        System.out.println("Min-heap array:");
        for (int node : heap) {
            System.out.print(node + " ");
        }
        System.out.println();
    }
}
