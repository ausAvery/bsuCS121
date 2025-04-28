public class GCD {
    // instance variables
    private int num1;
    private int num2;
    private int gcd;

    // constructor
    public GCD(){}

    public GCD(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // methods
    public int findGCDForLoop(int num1, int num2) {
        gcd = 1;
        int smallNum;
        if (num1 > num2) {
            smallNum = num2;
        }
        else {
            smallNum = num1;
        }

        for (int i = 1; i <= smallNum; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    } // end findGCDForLoop

    public int findGCPWhileLoop(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        return gcd = num1;
    } // end findGCPWhileLoop

    public int findGCDRecursively(int num1, int num2) {
        if (num2 == 0) {
            return gcd = num1;
        }
        else {
            return gcd = findGCDRecursively(num2, num1 % num2);
        }
    } // end findGCDRecursively()

    public int findGCDNegative(int num1, int num2) {
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        if (num1 == 0 && num2 ==0) {
            gcd = 0;
            return gcd;
        }

        if (num1 == 0) {
            return num2;
        }
        if (num2 == 0) {
            return num1;
        }

        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            }
            else {
                num2 = num2 - num1;
            }
        }
        gcd = num1;
        return gcd;
    }
}


