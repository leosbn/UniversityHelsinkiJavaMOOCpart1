
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        //acquisisco i nomi e le età
        System.out.println("Type your name:");
        String firstName = reader.nextLine();
        System.out.println("Type your age:");
        int firstAge = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type your name:");
        String secondName = reader.nextLine();
        System.out.println("Type your age:");
        int secondAge = Integer.parseInt(reader.nextLine());
        
        //il risultato
        System.out.println(firstName + " and " + secondName + " are " + (firstAge + secondAge) + " years old.");
    }
}
