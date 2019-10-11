
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int numberOfGuesses = 0;

        // program your solution here. Do not touch the above lines!
        System.out.println("Guess a number: ");
        while (true){
            
            int userInput = Integer.parseInt(reader.nextLine());
            numberOfGuesses++;
        
            if (userInput == numberDrawn){
                System.out.println("Congratulations, your guess is correct. Number of guesses: " + numberOfGuesses);
                break;
            }
            if (userInput < numberDrawn){
                
                System.out.println("The number is greater, number of guesses: " + numberOfGuesses);
            } else {
                
                System.out.println("The number is lesser, number of guesses: " + numberOfGuesses);
            }
            
                
        }
    
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
