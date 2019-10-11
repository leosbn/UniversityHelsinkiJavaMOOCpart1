
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        //acquisisco il primo numero
        System.out.println("Type a number");
        int primoNumero = Integer.parseInt(reader.nextLine());
        //acquisisco il secondo numero
        System.out.println("Type another number");
        int secondoNumero = Integer.parseInt(reader.nextLine());
        
        //scelgo il maggiore dei due
        System.out.println("The bigger of the two numbers given was: " + Math.max(primoNumero, secondoNumero));
    }
}
