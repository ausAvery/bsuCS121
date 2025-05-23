import java.lang.reflect.Array;

public class BigOExamples {

    char[] character = {'A'};

    String[] biggestMovies2016 = {"Rogue One", "Finding Dory",
            "Captain America: Civil War", "The Secret Life of Pets",
            "The Jungle Book", "Deadpool", "Zootopia",
            "Batman v Superman", "Suicide Squad", "Sing"};

    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
            21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
            31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
            41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
            51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
            61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
            71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
            81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
            91, 92, 93, 94, 95, 96, 97, 98, 99, 100};

    public void printFirstItem() {
        System.out.println("Runs in O(1) time or Constant Time\n" +
                "No matter how big the input, still requires only one step");
        System.err.println(character[0]);
        System.err.println(biggestMovies2016[0]);
        System.err.println(numbers[0]);
    }

    // use (object array) for parameter so an array of any type can be passed
    public void printAllItems(Object array) {
        System.out.printf("%nRuns in O(n) time or Linear Time,%n" +
                "where n is the number of items in the array.%n" +
                "If we print all the items, we will print n times.%n");
        // use generic Array class and method if unsure what type of array
        System.out.printf("%nIf n = %d, we print %d times:%n%n",
                Array.getLength(array), Array.getLength(array));
        for (int i = 0; i < Array.getLength(array); i++) {
            // use Array method get(array, i): array is passed in, i is index
            System.err.println(Array.get(array, i));
        }
    }

    public void printAllPossibleOrderedPairs(Object array) {
        System.out.printf("Runs in O(n^2) time or Quadratic Time, %n" +
                "where outer loop runs n times and %n" +
                "inner loop runs n times for each iteration of outer loop, %n" +
                "which prints n^2 times in total.%n");
        int counter = 1;
        for (int i = 0; i < Array.getLength(array); i++) {
            for (int j = 0; j < Array.getLength(array); j++) {
                System.err.println(counter + ". " + Array.get(array, i) + ", " + Array.get(array, j));

                counter++;
            }
        }
        System.out.println();
    }

    // n can be the actual input or the size of the input.
    // Both of the following methods have O(n) runtime,
    // even though one takes an integer as input and one takes an array:
    public void printNTimes(int n) {
        int counter = 1;
        for (int i = 0; i < n; i++) {
            System.err.printf("[%d] n = %d, so this prints %d times%n", counter, n, n);
            counter++;
        }
    }

    public void printAllElements(String[] array) {
        for (String item : array) {
            System.err.println(item);
        }
    }
}
