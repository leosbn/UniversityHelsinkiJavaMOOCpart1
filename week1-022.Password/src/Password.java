
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner lettorePassword = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        
        /*
        // acquisisco la pwd
        System.out.println("Type the password");
        String userInput = lettorePassword.nextLine();
        
        //confronto la pwd corretta
        if (userInput.equals(password)) {
            System.out.println("Right!");
        } else {
            System.out.println("Wrong password");
        }
        */
        
        //creo il loop
        while (true) {
            System.out.println("Type the password:");
            String userInput = lettorePassword.nextLine();
            
            if (userInput.equals(password)) {
                System.out.println("Right!");
                System.out.println("Secret message");
                break;
            } else {
                System.out.println("Wrong password");
            }
        }
        
    }
}
