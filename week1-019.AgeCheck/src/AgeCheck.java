
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = Integer.parseInt(reader.nextLine());
        
        //boolean checkAge = (age > 0 && age < 120);
        if (age <= 120 && age >= 0){
            System.out.println("Ok");
        } else {
            System.out.println("Impossible!");
        }
    }
}
