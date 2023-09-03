import java.util.Scanner;

public class NormalizeAngle {
    public static void main (String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Please enter an angle in degrees to find the normalized angle between 0 and 359");

        int input = scanner.nextInt();

        if (input >= 360) {
            while(input >= 360) {
                input -= 360;
            }
        } else if (input < 0 && input > -360) {
            input = 360 + input;
        } else if (input <= -360) {
            while(input < 0) {
                input += 360;
            }
        }
        System.out.println(input);
    }
}
