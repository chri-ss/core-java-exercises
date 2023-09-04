import java.math.BigInteger;
import java.util.Scanner;

public class UnsignedOperations {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println(
                "Enter two integers to compute their unsigned sum, difference, product, quotient and remainder: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(BigInteger.valueOf(num1).add(BigInteger.valueOf(num2)));
        System.out.println(BigInteger.valueOf(num1).subtract(BigInteger.valueOf(num2)).abs());
        System.out.println(BigInteger.valueOf(num1).multiply(BigInteger.valueOf(num2)));
        System.out.println(BigInteger.valueOf(num1).divide(BigInteger.valueOf(num2)));
        System.out.println(BigInteger.valueOf(num1).mod(BigInteger.valueOf(num2)));
    }
}
