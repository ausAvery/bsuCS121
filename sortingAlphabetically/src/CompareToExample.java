import java.util.ArrayList;
import java.util.Arrays;

public class CompareToExample {
    public static void main(String[] args) {
//        String string1 = "Ann";
//        String string2 = "Ann";
//        System.out.printf("Returns 0 if s1 is equal to s2: %d\n\n",
//                string1.compareTo(string2));
//
//        string1 = "Ann";
//        string2 = "Bob";
//        // lexigraphic order = dictionary order
//        System.out.printf("Returns int < 0 if s1 is lexigraphicalally less than s2\n" +
//                        "%d: a is 1 less than b\n\n",
//                string1.compareTo(string2));
//        string1 = "Ann";
//        string2 = "Ana";
//        System.out.printf("Returns int > 0 if s1 is lexigraphicalally greater than s2\n" +
//                        "%d: n is 13 greater than a\n\n",
//                string1.compareTo(string2));
//
//        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
//        for (int i = 0; i < alpha.length(); i++) {
//            System.out.printf("%s: %d\n", alpha.charAt(i), (int) alpha.charAt(i));
//        }

        insertionAlphabeticalSort();
    }

    static void insertionAlphabeticalSort() {
        Sort sort = new Sort();
        // create empty arrayList
        // ArrayList<String> namesArrayList = new ArrayList<>();

        // initialize arrayList with values
        ArrayList<String> namesArrayList = new ArrayList<>(Arrays.asList("John", "Nancy", "Ann", "Lisa", "Charles"));

        System.out.println("Unsorted ArrayList");
        for (String name : namesArrayList) {
            System.out.println(name);
        }

        String temp;
        for (int i = 1; i < namesArrayList.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (namesArrayList.get(j).compareTo(namesArrayList.get(j - 1)) < 0) {
                    temp = namesArrayList.get(j);
                    namesArrayList.set(j, namesArrayList.get(j - 1));
                    namesArrayList.set(j - 1, temp);
                }
            }
        }

        System.out.println("\nSorted ArrayList");
        for (String name : namesArrayList) {
            System.out.println(name);
        }
    }
}
