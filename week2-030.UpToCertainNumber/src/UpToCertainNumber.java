
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        int number = Integer.parseInt(reader.nextLine());
        int start = 1;
        
        while (start <= number){
            System.out.println(start);
            start++;
        }
        
    }
}
