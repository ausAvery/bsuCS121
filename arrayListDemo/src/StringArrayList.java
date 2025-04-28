import java.util.ArrayList;

public class StringArrayList {
    private ArrayList<String> strings;

    // Constructor
    public StringArrayList() {
        strings = new ArrayList<>();
    }

    // Method to add a String
    public void addString(String str) {
        strings.add(str);
    }

    // Method to remove a String
    public boolean removeString(String str) {
        return strings.remove(str); // returns true if removed, false otherwise
    }

    // Method to get size
    public int getSize() {
        return strings.size();
    }

    // Method to get element by index
    public String getElement(int index) {
        if (index >= 0 && index < strings.size()) {
            return strings.get(index);
        }
        else {
            return "Index out of bound";
        }
    }

    // Display using for-each loop
    public void displayForEach() {
        System.out.println("Displaying using for-each loop:");
        for (String str : strings) {
            System.out.println(str);
        }
    }

    // Display using regular for loop
    public void displayRegularFor() {
        System.out.println("Displaying using regular for loop:");
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}
