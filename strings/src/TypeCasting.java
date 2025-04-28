public class TypeCasting {
    public static void main(String[] args) {

        int int1 = 18;
        int int2 = 5;

        int int3 = int1 / int2;
        System.out.printf("1. Dividing int by int: %d\n", int3);

        double d0 = int1 / int2; // assigning int quotient to a double variable
        System.out.printf("2. Assigning int quotient to double: %.2f\n", d0);

        double d4 =(double)(int1 / int2); // casting the quotient to a double
        System.out.printf("3. Casting quotient of int division: %.2f\n", d4);

        double d1 = (double)int1 / int2; // casting the numerator to a double
        System.out.printf("4. Dividing double by int: %.2f\n", d1);

        double d2 = int1 / (double)int2; // casting the denominator to a double
        System.out.printf("5. Dividing int by double: %.2f\n", d2);

        double d3 = (double)int1 / (double)int2; // casting both to a double
        System.out.printf("6. Dividing double by double: %.2f\n", d3);
    }
}
