import java.util.Scanner;
import java.math.BigInteger;

public class BigIntFact {
    public static void main(String[] args) {
        // var scanner = new Scanner(System.in);
        // System.out.println("Enter a number to get the factorial: ");
        // BigInteger input = BigInteger.valueOf(scanner.nextInt());
        System.out.println(factorial(BigInteger.valueOf(1000)));

    }
    static BigInteger factorial(BigInteger n) {
        if(n.equals(BigInteger.ONE)) {
           return n;
        }
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }

    static int regularFactorial(int n) {
        if(n == 1) {
            return n;
        }
        return n * regularFactorial(n - 1);
    }
}
