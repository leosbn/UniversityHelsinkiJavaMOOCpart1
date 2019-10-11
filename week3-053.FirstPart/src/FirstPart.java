
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Scrivi la parola");
        String parola = reader.nextLine();
        System.out.println("Quante delle prime lettere vuoi vedere?");
        int lettere = Integer.parseInt(reader.nextLine());
        
        String primeLettere = parola.substring(0, lettere);
        System.out.println("Result: " + primeLettere);
    }
}
