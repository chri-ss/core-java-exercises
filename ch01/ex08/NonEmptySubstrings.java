import java.util.Scanner;

public class NonEmptySubstrings {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Enter a string to print it's substrings");
        String str = scanner.nextLine();

        for(int i = 0; i < str.length(); i++) {
            for(int j = i + 1; j < str.length() + 1; j++) {
                System.out.println(substring(str, i, j));
            }
        }

    }

    static String substring(String str, int x, int y) {
        String output = "";
        for (int i = x; i < y; i++) {
            output += str.charAt(i);
        }
        return output;
    }
}
