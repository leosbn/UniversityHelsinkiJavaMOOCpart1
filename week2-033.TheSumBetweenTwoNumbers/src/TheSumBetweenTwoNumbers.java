
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        //dichiaro le variabili che mi servono
        System.out.println("Inserisci primo numero");
        int primoVal = Integer.parseInt(reader.nextLine());
        System.out.println("Inserisci secondo numero");
        int secondoVal = Integer.parseInt(reader.nextLine());
        int risultato = 0; //do un valore provvisorio
        
        //creo il ciclo
        while (primoVal <= secondoVal){
            risultato +=primoVal;
            primoVal++;
        }
        System.out.println("Risultato " + risultato);
    }
}
