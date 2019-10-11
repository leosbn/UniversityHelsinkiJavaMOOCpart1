import java.util.ArrayList;

public class LengthsOfStrings {
    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> lengthList = new ArrayList<Integer>();
        // write code here
        for (String elemento : list){
            lengthList.add(elemento.length());
            
        }
        
        return lengthList;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ciao");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);
        
        System.out.println("The lengths of the Strings: " + lengths);
        
        //aggiungo codice balordo per esperimento: stampare gli elementi delle due liste affiancati e 
        int indice = 0;
        while (indice < list.size()){
            System.out.print(list.get(indice));
            System.out.print(" ");
            System.out.print(lengths.get(indice));
            System.out.print("\n");
            indice++;
        }
    }
}
