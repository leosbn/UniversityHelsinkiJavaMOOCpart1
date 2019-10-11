import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner strumento = new Scanner(System.in);
        System.out.println("Type a word");
        String valoreInserito = strumento.nextLine();
        System.out.println("The first character is " + firstCharacter(valoreInserito));
    }
        
    public static char firstCharacter(String testoInserito) {
        
    return testoInserito.charAt(0);
    }
}
