
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your user:");
        String userName = reader.nextLine();
        System.out.println("Type your pwd:");
        String userPwd = reader.nextLine();
        
        if ((userName.equals("alex") && userPwd.equals("mightyducks")) || (userName.equals("emily") && userPwd.equals("cat"))) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password is invalid");
        }
    }
}
