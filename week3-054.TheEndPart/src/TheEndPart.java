import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Scrivi la parola da ispezionare");
        String parola = reader.nextLine();
        System.out.println("Quanti numeri?");
        int lettereFine = Integer.parseInt(reader.nextLine());
        
        String finaleParola = parola.substring(parola.length() - lettereFine, parola.length());
        System.out.println("Result: " + finaleParola);
    }
}
