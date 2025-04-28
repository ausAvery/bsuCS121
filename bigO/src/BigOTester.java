public class BigOTester {
    public static void main(String[] args) {
        BigOExamples example = new BigOExamples();
        BigODemo demoExample = new BigODemo();

        // O(1)
//        example.printFirstItem();

        // O(n)
//        example.printAllItems(example.character);
//        example.printAllItems(example.biggestMovies2016);
//        example.printAllItems(example.numbers);

        // O(n^2)
//        example.printAllPossibleOrderedPairs(example.biggestMovies2016);
//        example.printAllPossibleOrderedPairs(example.numbers);

        // also O(n)
//        example.printNTimes(5);
//        example.printAllElements(example.biggestMovies2016);

        // O(1)
//        demoExample.printOneTime("hello");

        // O(n) where n is 100
//        demoExample.printManyTimes("Echo");

        demoExample.show(5);
        System.out.println();
        demoExample.squared(5);
        System.out.println();
        demoExample.show2(5);
    }
}
