import java.util.Scanner;

public class Format {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int input = scanner.nextInt();

        System.out.printf("%s\n", Integer.toBinaryString(input));
        System.out.printf("%o\n", input);
        System.out.printf("%x\n", input);

        System.out.printf("%A\n", (1.0f / input));
    }
}
