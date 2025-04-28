import java.util.ArrayList;

public class GenericArrayList {
    public <T> void printArrayList(ArrayList<T> list) {
        for (T element : list) {
            System.out.printf("%s ", element);
        }
    }
}
