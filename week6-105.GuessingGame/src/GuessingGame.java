
import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);
    }

    public int average(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber) / 2;
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);
        // write the guessing logic here
        int average;
        boolean greater;
        while (true) {
            if (lowerLimit == upperLimit) {
                System.out.println("the number you're thinking of is " + lowerLimit);
                break;
            }

            average = this.average(lowerLimit, upperLimit);
            greater = this.isGreaterThan(average);

            if(greater){
                lowerLimit = average + 1;
            } else {
                upperLimit = average;
            }
        }
    }

    // implement here the methods isGreaterThan and average
    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }

    public boolean isGreaterThan(int value) {
        while (true) {
            System.out.println("Is your number greater than " + value + "? (y/n)");
            if (this.reader.nextLine().equalsIgnoreCase("y")) {
                return true;
            } else {
                return false;
            }
        }
    }

}
