public class MidTermMethods {
    public static void main(String[] args) {
        System.out.println(addNumbers(5,6));
        System.out.println(productNumbers(5,2));

        int sum = addNumbers(3, 2);
        System.out.println(sum);

        int product = productNumbers(5, 5);
        System.out.println(product);

    }
    // write a method with parameters
    // store a return value in a variable
    private static int addNumbers(int x, int y) {
        int sum = x + y;
        return sum;
    }

    // write a method with parameters
    // returns the product of two numbers without a variable to store the value
    private static int productNumbers(int x, int y) {
        return (x * y);
    }
}
