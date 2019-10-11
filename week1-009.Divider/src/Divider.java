
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        //int dividendo;
        //int divisore;
        //double risultato = dividendo / divisore;
        
        System.out.println("Type a number: ");
        int dividendo = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int divisore = Integer.parseInt(reader.nextLine());
        //giving out result
        double risultato = (double)dividendo / divisore;
        System.out.println("Division: " + dividendo + " / " + divisore + " = " + risultato);
    }
}
