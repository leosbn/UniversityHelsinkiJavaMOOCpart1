
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe per svolgere l'esercizio
 */
public class Distribution {

    private ArrayList<Integer> gradesList;

    public Distribution() {
        this.gradesList = new ArrayList<Integer>();
    }

    /**
     * questo metodo gestisce lo scanner e mette i risultati in una lista
     */
    public void acquireDistribution() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type exam scores, -1 completes:");
        while (true) {
            int exams = scan.nextInt();
            if (exams == -1) {
                break;
            }
            if (exams >= 0 && exams <= 60) {
                this.gradesList.add(exams);
            }
        }
    }

    /**
     * questo è solo un metodo per controllare che gli input siano in lista
     */
    public void getDistribution() {
        for (int exam : this.gradesList) {
            System.out.print(exam + ", ");
        }
    }

    public void printAllDistribution(int[] array) {
        for (int i = 0; i < 6; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < array[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public int[] valueOfGrades() {
        int failed = 0;
        int uno = 0;
        int due = 0;
        int tre = 0;
        int quattro = 0;
        int cinque = 0;
        int[] giudizi = new int[6];

        for (int grad : this.gradesList) {
            if (grad < 30) {
                failed++;
            } else if (grad < 35 && grad > 29) {
                uno++;
            } else if (grad < 40 && grad > 34) {
                due++;
            } else if (grad < 45 && grad > 39) {
                tre++;
            } else if (grad < 50 && grad > 44) {
                quattro++;
            } else if (grad <= 60 && grad > 49) {
                cinque++;
            }
        }
        giudizi[0] = failed;
        giudizi[1] = uno;
        giudizi[2] = due;
        giudizi[3] = tre;
        giudizi[4] = quattro;
        giudizi[5] = cinque;
        return giudizi;
    }
    
    public double acceptance(){
        int allScores = this.gradesList.size();
        if (allScores == 0){
            return 0;
        } else {
        int accepted =0;
        for (int partecipante : this.gradesList){
            if (partecipante > 29){
                accepted++;
            }
        }
        return 100*accepted/allScores;
        }
    }
    
    public void check(){
        System.out.println(this.gradesList.size());
    }
}
