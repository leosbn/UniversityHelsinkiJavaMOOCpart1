
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner punteggi = new Scanner(System.in);
        
        //chiedo di indicare il punteggio
        System.out.println("Type the points:");
        int punti = Integer.parseInt(punteggi.nextLine());
        int voto;
        
        //elaboro il voto
        if (punti <= 29) {
            System.out.println("failed");
        } else if (punti > 29 && punti < 35) {
            System.out.println("Grade: 1");
        }   else if (punti > 34 && punti < 40) {
            System.out.println("Grade: 2");
        }       else if (punti > 39 && punti < 45){
                    System.out.println("Grade: 3");
        }           else if (punti > 44 && punti < 50) {
                    System.out.println("Grade: 4");
        }               else if (punti > 49 && punti < 61){
                        System.out.println("Grade: 5");
        }
    }
}
