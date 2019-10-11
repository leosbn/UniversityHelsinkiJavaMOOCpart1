import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        while(true){
            System.out.println("Type a word");
            String parolaInserita = reader.nextLine();
            words.add(parolaInserita);
            if (parolaInserita.isEmpty()){
                break;
            }
        }
        System.out.println("You typed the following words: ");
        for (String parole : words){
            
            System.out.println(parole);
            
        }
    }
}
