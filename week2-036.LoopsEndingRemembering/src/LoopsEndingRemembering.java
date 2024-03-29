import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers:");
        int sum = 0; // questa riga è del 36.2
        int count = 0; //questa riga è del 36.3
        double avg = 0; //questa riga è del 36.4
        //queste due variabili sono del 36.5
        int evenCount = 0;
        int oddCount = 0;
        
        //acquisisco i numeri 36.1
        while (true){
            int insertedNumber = Integer.parseInt(reader.nextLine());
            if (insertedNumber < 0){
                System.out.println("Thank you and see you later!");
                break;
            }
            if (insertedNumber % 2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }
            sum = sum + insertedNumber;
            count++;
            avg = (double)sum / count;
            }
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
        }

    }
