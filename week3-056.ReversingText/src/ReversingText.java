import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        int lunghezzaTesto = text.length() - 1;
        String testoInverso = "";
        int posizioneTesto = text.length();
        
        while (lunghezzaTesto >= 0){
            testoInverso +=text.substring(lunghezzaTesto, posizioneTesto);
            lunghezzaTesto--;
            posizioneTesto--;
        }
        return testoInverso;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String testoUtente = reader.nextLine();
        
        
        System.out.println("In reverse order: " + reverse(testoUtente));
    }
}