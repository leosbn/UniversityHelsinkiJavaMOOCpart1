
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int start = 0;
        int input = Integer.parseInt(reader.nextLine());
        int fine = 0;
        
        while (start <= input){
            fine +=start;
            start++;
        }
        System.out.println(fine);
        
    }
}
