public class MidTermArraysAndConstants {
    public static void main(String[] args) {
        // declare and initialize a constant variable
        final int NUMBER_ARRAY = 3;

        // declare and initialize array v1
//        int[] array1 = new int[3];
        int[] array1 = new int[NUMBER_ARRAY];
        array1[0] = 5;
        array1[1] = 6;
        array1[2] = 7;

        // declare and initialize array v2
        int[] array2 = {1, 2, 3};

        // normal for loop
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        System.out.println();

        // enhanced for loop
        for (int num : array2) {
            System.out.println(num);
        }
    }
}
