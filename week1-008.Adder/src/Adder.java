
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner lettura = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        //asking for first number
        System.out.println("Type a number: ");
        int addendoUno = Integer.parseInt(lettura.nextLine());
        System.out.println("Type another number: ");
        int addendoDue = Integer.parseInt(lettura.nextLine());
        System.out.println("Sum of the numbers: " + (addendoUno + addendoDue));
    }
}
