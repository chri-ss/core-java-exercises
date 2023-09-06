import java.util.Scanner;

public class NonAsciiUnicodeValues {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Enter a string to print all non-ascii unicode values: \n");
        String str = scanner.nextLine();

        for(int i = 0; i < str.length(); i++) {
            if((int)str.charAt(i) > 127) {
                System.out.printf("%c\t%d\n", str.charAt(i), (int)str.charAt(i));
            }
        }
        scanner.close();
    }
}
