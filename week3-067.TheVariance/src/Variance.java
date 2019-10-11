import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int somma = 0;
        
        for (int membersOfList : list){
            somma += membersOfList;
        }
        return somma;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        int numberOfElements = list.size();
        return sum(list) / (double)numberOfElements;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double avg1 = average(list);
        int numeroMembri = list.size();
        double potenza = 0;
        double varianza = 0;
        for (int membri : list){
            potenza += Math.pow(membri - avg1, 2);
            varianza = (potenza / (numeroMembri - 1));
        }
        
        
        return varianza;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
