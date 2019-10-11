
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        //inizializzo lo scanner
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the radius: ");
        //acquisisco il valore
        double radius = Double.parseDouble(reader.nextLine());
        double circumference = 2 * radius * Math.PI;
        //restituisco il valore della circonferenza
        System.out.println("Circumference of circle: " + circumference);
        /* alternative code
        int intRadius = Integer.parseInt(reader.nextLine());
        double doubleCircumference = 2 * intRadius * Math.PI;
        System.out.println("Circumference of circle: " + doubleCircumference);
        */
    }
}
