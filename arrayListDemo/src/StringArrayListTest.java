public class StringArrayListTest {
    public static void main(String[] args) {
        // Create instance of StringArrayList
        StringArrayList myList = new StringArrayList();

        // Add 4 strings
        myList.addString("Apple");
        myList.addString("Banana");
        myList.addString("Cherry");
        myList.addString("Date");

        // Print the size of the list
        System.out.println("Size of the list: " + myList.getSize());

        // Print an element by index
        System.out.println("Element at index 2: " + myList.getElement(2));

        // Display using for-each loop
        myList.displayForEach();

        // Display using regular for loop
        myList.displayRegularFor();

        // Remove a string and display updated list
        if (myList.removeString("Banana")) {
            System.out.println("\n'Banana' was successfully removed.");
        } else {
            System.out.println("\n'Banana' was not found in the list.");
        }

        System.out.println("Updated list after removal:");
        myList.displayForEach();
    }
}
