public class TwoDArrays {
    public static void main(String[] args) {
        int[][] array1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12} };
        double[][] array2 = new double[4][3];
            array2[0][0] = 1.0;
            array2[0][1] = 2.0;
            array2[0][2] = 3.0;
            array2[1][0] = 1.1;
            array2[1][1] = 2.1;
            array2[1][2] = 3.1;
            array2[2][0] = 1.2;
            array2[2][1] = 2.2;
            array2[2][2] = 3.2;
            array2[3][0] = 1.3;
            array2[3][1] = 2.3;
            array2[3][2] = 3.3;
        String[][] array3 = {
                {"Mind your thoughts", ":", "they become words."},
                {"Mind your words", ":", "they become actions."},
                {"Mind your actions", ":", "they become habits."},
                {"Mind your habits",":","they become your character."},
                {"Mind your character", ":", "it becomes your destiny."}
        };

        System.out.println("Array 1");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.printf("%d ", array1[i][j]);
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Array 2");
        for (double[] i : array2) {
            for (double j : i) {
                System.out.printf("%.1f ", j);
            }
            System.out.println();
        }
        System.out.println();

        
        System.out.println("Array 3");
        for (String[] i : array3) {
            for (String j : i) {
                System.out.printf("%s ", j);
            }
            System.out.println();
        }
    }
}
