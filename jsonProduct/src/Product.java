public class Product {
    // instance variables
    private int id;
    private String name;
    private double price;

    // constructor
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // methods
    @Override
    public String toString() {
        return String.format("ID: %d\n" +
                "Name: %s\n" +
                "Price: $%.2f\n",
                id, name, price);
    }
}
