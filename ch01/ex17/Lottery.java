import java.util.ArrayList;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        for(int i = 1; i < 50; i++) {
            nums.add(i);
        }

        ArrayList<Integer> lotteryNums = new ArrayList<Integer>();

        var generator = new Random();

        for(int i = 0; i < 6; i++) {
            int randomNum = generator.nextInt(nums.size());
            int lotteryNum = nums.get(randomNum);
            nums.remove(randomNum);
            lotteryNums.add(lotteryNum);
        }

        lotteryNums.sort(null);
        System.out.println(lotteryNums.toString());
    }
}
