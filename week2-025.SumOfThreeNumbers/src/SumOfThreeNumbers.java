
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable


        // Write your program here
        // Use only variables sum and read
        System.out.println("Type a number");
        read = Integer.parseInt(scan.nextLine());
        sum = sum + read;
        
        System.out.println("Type another number");
        read = Integer.parseInt(scan.nextLine());
        sum = sum + read;
        
        System.out.println("Type the last number");
        read = Integer.parseInt(scan.nextLine());
        sum = sum + read;

        System.out.println("Sum: " + sum);
    }
}
