import java.util.Scanner;
import java.util.Arrays;

public class Compass {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int[] result = switch (input) {
            case "N" -> new int[] { 0, 1 };
            case "E" -> new int[] { 1, 0 };
            case "S" -> new int[] { 0, -1 };
            case "W" -> new int[] { -1, 0 };
            default -> new int[] { 0, 0 };
        };
        System.out.println(Arrays.toString(result));

    }
}
