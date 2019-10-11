import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Distribution listaVoti = new Distribution();
        listaVoti.acquireDistribution();
        int[] giud = new int[6];
        giud = listaVoti.valueOfGrades();
        System.out.println("");
        System.out.println("Grade distribution:");
        listaVoti.printAllDistribution(giud);
        System.out.println("");
        System.out.print("Acceptance percentage: ");
        System.out.print(listaVoti.acceptance());
        listaVoti.check();
    }
}
