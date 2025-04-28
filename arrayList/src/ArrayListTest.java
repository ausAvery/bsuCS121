import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("John");
        nameList.add("Jane");
        nameList.add("Joan");
        nameList.add("Jean");

        // .get() method returns element at index number
        // [] is not used in ArrayList
        System.out.println(nameList.get(2));

        // .size() method returns number of elements in an ArrayList
        System.out.println(nameList.size());

        // standard for loop
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println(nameList.get(i));
        }

        // enhanced for loop
        for (String name : nameList) {
            System.out.println(name);
        }

        // .remove() is an overloaded method
        // remove element by name
        nameList.remove("John");

        // remove element by index
        nameList.remove(1);

    }
}
