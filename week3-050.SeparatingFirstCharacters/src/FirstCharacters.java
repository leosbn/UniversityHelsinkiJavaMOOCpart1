import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Insert your name");
        String insertedName = reader.nextLine();
        
        int numLettera = 0;
        
        while (numLettera <= 2){
            if (insertedName.length() < 3){
                break;
            }
            
            System.out.println((numLettera + 1) + ". character: " + insertedName.charAt(numLettera));
            
            numLettera++;
        }
    }
}
