public class ComputerTest {
    public static void main(String[] args) {
        Laptop computer1 = new Laptop(17, "MSI", "AMD", 16);
        System.out.printf("Computer Brand: %s%n", computer1.computerBrand());

        Desktop computer2 = new Desktop("AMD", "AMD", 64, "full-size");
        System.out.printf("Computer Brand: %s%n", computer2.computerBrand());
    }
}
