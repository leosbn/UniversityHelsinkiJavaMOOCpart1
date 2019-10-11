
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Prima parola");
        String primaParola = reader.nextLine();
        System.out.println("Seconda parola");
        String secondaParola = reader.nextLine();
        
        
        if (primaParola.indexOf(secondaParola) >= 0 ){
            System.out.println("The word '" + secondaParola + "' is found in the word '" + primaParola + "'");
        } else {
                System.out.println("The word '" + secondaParola + "' is not found in the word '" + primaParola + "'");
            }
        
    }
}
