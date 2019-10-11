import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int fattoriale = Integer.parseInt(reader.nextLine());
        int risultato = 1;
        int start = 1;
        
        while (start <= fattoriale){
            risultato *=start;
            start++;
        }
        System.out.println("il fattoriale di " + fattoriale + " è " + risultato);
    }
}
