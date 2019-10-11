import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Scrivi il tuo nome");
        String nome = reader.nextLine();
        
        int lunghezzaNome = nome.length();
        char ultimaLet = nome.charAt(nome.length() - 1);
        int numVariab = 1;
        
        while (numVariab <= lunghezzaNome){
            
            char lettVariabile = nome.charAt(lunghezzaNome - numVariab);
            numVariab++;
            System.out.print(lettVariabile);
                    
        }

    }
}
