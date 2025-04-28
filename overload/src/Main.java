public class Main {
    public static void main(String[] args) {
        Overloaded car1 = new Overloaded();
        Overloaded car2 = new Overloaded("Chevy");
        Overloaded car3 = new Overloaded("Dodge", "Mustang", "black", 1969);

        System.out.println("Original make: " + car2.getMake());
        car2.setMake("Chevy", 1970);
        System.out.println("New make: " + car2.getMake());
    }
}
