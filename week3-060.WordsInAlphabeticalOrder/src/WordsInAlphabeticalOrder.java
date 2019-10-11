
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        
        ArrayList<String> listaParole = new ArrayList<String>();
        
        while(true){
            System.out.println("Type a word");
            String word = reader.nextLine();
            //aggiungo la parola alla lista
            listaParole.add(word);
            if (word.isEmpty()){
                break;
            }
           
        }
        
        System.out.println("La lista delle parole inserite");
        
        Collections.sort(listaParole);
        
        for (String paroleOrdinate : listaParole){
            System.out.println(paroleOrdinate);
        }
    }
}
