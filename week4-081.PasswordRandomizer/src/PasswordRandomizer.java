import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int pwdLength;
    
    Random casual = new Random();
    
    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.pwdLength = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        String randomPassword = "";
        while (i < pwdLength){
            char letter = "abcdefghijklmnopqrstuvwxyz".charAt(casual.nextInt(26));
            randomPassword += letter;
            i++;
        }
        return randomPassword;
    }
}
