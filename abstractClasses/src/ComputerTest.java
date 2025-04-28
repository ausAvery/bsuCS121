public class ComputerTest {
    public static void main(String[] args) {
        Laptop computer1 = new Laptop(15, "ASUS", "Intel", 16);
        System.out.println("COMPUTER 1");
        System.out.printf("Computer Brand: %s%n", computer1.computerBrand());

        Desktop computer2 = new Desktop("MSI", "AMD", 32, "mid-size");
        System.out.println("COMPUTER 2");
        System.out.printf("Computer Brand: %s%n", computer2.computerBrand());
    }
}
