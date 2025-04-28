import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GenericArrayList genericArrayList = new GenericArrayList();

        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Double> doubleList = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5));
        ArrayList<Character> charList = new ArrayList<>(Arrays.asList('H', 'E', 'L', 'L', 'O'));
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("Hello", "World"));

        System.out.print("Integer ArrayList: ");
        genericArrayList.printArrayList(intList);

        System.out.print("\nDouble ArrayList: ");
        genericArrayList.printArrayList(doubleList);

        System.out.print("\nCharacter ArrayList: ");
        genericArrayList.printArrayList(charList);

        System.out.print("\nString ArrayList: ");
        genericArrayList.printArrayList(stringList);
    }
}
