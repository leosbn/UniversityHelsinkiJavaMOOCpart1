import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner readNumbers = new Scanner(System.in);
        System.out.println("Type the first number:");
        int firstNumber = Integer.parseInt(readNumbers.nextLine());
        System.out.println("Type the second number:");
        int secondNumber = Integer.parseInt(readNumbers.nextLine());
        
        if (firstNumber > secondNumber) {
            System.out.println("Greater number: " + firstNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println("Greater number: " + secondNumber);
        } else {
            System.out.println("The numbers are equal");
        }
    }
}
