
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner scansione = new Scanner(System.in);
        // call your method from here
        System.out.println("Type your name: ");
        String testoUtente = scansione.nextLine();
        System.out.println(calculateCharacters(testoUtente));
    }
    
    // do here the method
    public static int calculateCharacters(String text){
        
        return text.length();
        
    }
    
}
