import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order
        System.out.println("Type numbers:");
        NumberStatistics calcoli = new NumberStatistics();
        NumberStatistics calcoliPari = new NumberStatistics();
        NumberStatistics calcoliDispari = new NumberStatistics();
        
        
        while (true){
            int numberFromUser = Integer.parseInt(reader.nextLine());
            if (numberFromUser <=-1){
                break;
            }
            calcoli.addNumber(numberFromUser);
            //se pari
            if (numberFromUser % 2 == 0){
                calcoliPari.addNumber(numberFromUser);
            } else {
                calcoliDispari.addNumber(numberFromUser);
            }
        }
        System.out.println("Sum: " + calcoli.sum());
        System.out.println("Sum of even: " + calcoliPari.sum());
        System.out.println("Sum of odd: " + calcoliDispari.sum());
        

    }
}
