import java.util.Random;

public class RandomStringFromLong {
    public static void main(String[] args) {
        var generator = new Random();

        String randomLong = Long.toString(generator.nextLong(), 36);

        System.out.printf("%s\n", randomLong);
    }
}
