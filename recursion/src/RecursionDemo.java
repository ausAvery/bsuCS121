public class RecursionDemo {
    public int calcFactorial(int number) {
        if (number == 1 ) {
            return 1;
        }
        else {
            return number * calcFactorial(number - 1);
//            return number * calcFactorial(--number);
        }
    } // end calcFactorial()
}
