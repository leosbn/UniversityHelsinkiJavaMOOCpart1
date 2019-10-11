
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Inserisci il nome");
        String nome = reader.nextLine();
        
        int lunghezzaNome = nome.length();
        int carattere = 0;
        
        while (carattere < lunghezzaNome){
            System.out.println((carattere + 1) + ". character: " + nome.charAt(carattere));
            carattere++;
        }
    }
}
