import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int max = num1 > num2 && num1 > num3 ? num1 :
            num2 > num1 && num2 > num3 ? num2 :
            num3 > num1 && num3 > num2 ? num3 : num1;

        System.out.println(max);
        System.out.println(Math.max(Math.max(num1, num2), num3));
    }

}
