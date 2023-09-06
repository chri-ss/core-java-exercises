import java.util.Arrays;
import java.util.Scanner;

public class IncrementalCompass {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Enter a compass direction to orient the compass:\n");

        String input;
        int[] result = { 0, 0 };

        while (true) {
            input = scanner.nextLine();

            switch (input) {
                case "N":
                    result[1] += 1;
                    break;
                case "E":
                    result[0] += 1;
                    break;
                case "S":
                    result[1] -= 1;
                    break;
                case "W":
                    result[0] -= 1;
                    break;
                default:
                    break;
            }
            System.out.println(Arrays.toString(result));
        }
    }
}
