import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Insert your name");
        String inserimento = reader.nextLine();
        System.out.println("the last character is " + lastCharacter(inserimento));
    }
    
    public static char lastCharacter(String testo){
        //int 
        return testo.charAt(testo.length() - 1);
    }
}
