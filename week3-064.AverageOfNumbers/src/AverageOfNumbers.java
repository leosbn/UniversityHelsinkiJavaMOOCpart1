
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    public static int sum(ArrayList<Integer> list) {
        int somma = 0;
        
        for (int addendi : list){
            somma +=addendi;
        }
        return somma;
    }
    

    public static double average(ArrayList<Integer> list) {
        // write code here
        int numeriLista = list.size();
        return sum(list) / (double)numeriLista;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}
