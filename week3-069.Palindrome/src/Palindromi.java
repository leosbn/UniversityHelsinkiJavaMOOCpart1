import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        //implemento il testo reverse per fare il check della parola palindroma
        int dimensioneParola = text.length();
        String costruzioneParola = "";
        
        while (dimensioneParola > 0){
            costruzioneParola += text.charAt(dimensioneParola - 1);
            dimensioneParola-=1;
        }
        
        //confronto le parole
        if (text.equals(costruzioneParola)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
        System.out.println(palindrome(text));
    }
}
