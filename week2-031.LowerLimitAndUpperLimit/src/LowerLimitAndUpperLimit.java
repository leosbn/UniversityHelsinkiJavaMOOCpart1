
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        
        //chiedo i numeri
        System.out.println("Type the first number");
        int firstInput = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number");
        int secondNumber = Integer.parseInt(reader.nextLine());
        
        //ciclo 
        //uso il primo input come partenza da aumentare fino al secondo
        while (firstInput <= secondNumber){
            if (firstInput > secondNumber){
                //System.out.println("The numbers are the same");
                break;
            }
            System.out.println(firstInput);
            firstInput++;
        }

    }
}
