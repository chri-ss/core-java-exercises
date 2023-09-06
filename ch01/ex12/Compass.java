import java.util.Scanner;
import java.util.Arrays;

public class Compass {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int[] arr = { 0, 0 };

        switch (input) {
            case "N" -> {
                arr[1] += 1;
            }
            case "E" -> {
                arr[0] += 1;
            }
            case "S" -> {
                arr[1] -= 1;
            }
            case "W" -> {
                arr[0] -= 1;
            }
            default -> {
                System.out.println("no good");
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
