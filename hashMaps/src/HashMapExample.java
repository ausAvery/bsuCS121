import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> capitalsMap = new HashMap<>();

        capitalsMap.put("France", "Paris");
        capitalsMap.put("China", "Beijing");
        capitalsMap.put("Australia", "Canberra");
        // use the forEach() method to loop through
        // use HashMap to get each k,v (key, value) pair
        capitalsMap.forEach((key, value) -> {
            System.out.printf("Country: %s - Capital: %s\n", key, value);
        });

        System.out.printf("\nThe size of the HashMap is %d\n", capitalsMap.size());
        System.out.printf("France is in the HashMap: %b\n", capitalsMap.containsKey("France"));
        System.out.printf("Paris is in the HashMap: %b\n", capitalsMap.containsValue("Paris"));
        System.out.printf("The capital of France is %s\n", capitalsMap.get("France"));
        capitalsMap.remove("France");
        System.out.printf("Trying to get the value of a removed key now returns: %s\n", capitalsMap.get("France"));
    }
}
