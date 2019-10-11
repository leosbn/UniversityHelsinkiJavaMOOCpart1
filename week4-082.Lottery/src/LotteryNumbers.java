
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    private int numberRand;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        Random lotteryGenerator = new Random();
        int i = 1;
        while (this.numbers.size() < 7) {
            numberRand = lotteryGenerator.nextInt(39) + 1;
            if (!this.numbers.contains(numberRand)) {
                this.numbers.add(numberRand);
            }
        }
        i++;
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        return this.numbers.contains(number);
    }
}
