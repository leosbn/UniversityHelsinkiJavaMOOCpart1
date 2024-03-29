
import hangman.Hangman;
import java.util.Scanner;

public class HangmanUserInteface {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Hangman hangman = new Hangman();

        System.out.println("***********");
        System.out.println("* HANGMAN  *");
        System.out.println("***********");
        System.out.println("");
        printMenu();
        System.out.println("");

        // PROGRAM YOUR SOLUTION HERE
        
        //42.1 utente inserisce la sua scelta
        while (hangman.gameOn()){
            System.out.println("Type a command:");
            String comandoUtente = reader.nextLine();
            if (comandoUtente.equals("quit")){
                break;
            }
            if (comandoUtente.equals("status")){
                    hangman.printStatus();
            }
            if (comandoUtente.length() == 1){
                hangman.guess(comandoUtente);
            }
            if (comandoUtente.isEmpty()){
                printMenu();
            }
        hangman.printMan();
        hangman.printWord();
        }
        

        System.out.println("Thank you for playing!");
    }

    public static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }
}
