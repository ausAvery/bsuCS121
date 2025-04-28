public class Recursion {
    public String countDown(int number) {
        if (number == 0) {
            System.out.println("Blast Off!");
            return null;
        }
        else {
            System.out.printf("%d%s", number, ".".repeat(3));
            return countDown(--number);
        }
    } // end countDown()

    public char alphaBackwards(char letter) {
        if (letter == 'a') {
            System.out.println(letter);
            return 'a';
        }
        else {
            System.out.printf("%c ", letter);
            return alphaBackwards(--letter);
        }
    }
}
