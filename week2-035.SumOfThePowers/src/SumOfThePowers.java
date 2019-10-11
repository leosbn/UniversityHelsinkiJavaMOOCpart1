
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double esponente = Integer.parseInt(reader.nextLine());
        double start = 0;
        double risultato = 0;
        
        while (start <= esponente){
            risultato += Math.pow(2, start);
            start++;
        }
        System.out.println((int)risultato);
    }
}
