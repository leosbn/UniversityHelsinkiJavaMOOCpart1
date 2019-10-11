import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> nomi = new ArrayList<String>();
        
        while (true){
            System.out.println("Type a word");
            String nome = reader.nextLine();
            nomi.add(nome);
            if (nome.isEmpty()){
                break;
            }
        }
        
        System.out.println("You typed the following names");
        
        Collections.reverse(nomi);
        
        for (String paroleInserite : nomi){
            System.out.println(paroleInserite);
        }
    }
}
