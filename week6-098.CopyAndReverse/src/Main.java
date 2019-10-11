

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1,2,3};
        int[] copied = copy(original);
        int[] reversed = reverseCopy(original);
        
        for (int cop : copied){
            System.out.print(cop + ", ");
        }
        
        System.out.println("\n");
        System.out.println(original[0]);
        
        for (int rev : reversed){
            System.out.print(rev + ", ");
        }

    }
    
    public static int[] copy(int[] array){
        int size = array.length;
        int[] copy = new int[size]; 
        //copy = array;
        //return copy;
        for (int orig = 0; orig < size; orig++){
            copy[orig] = array[orig];
        }
        return copy;
    }
    
    public static int[] reverseCopy(int[] array){
        int size = array.length;
        int[] copy = new int[size];
        int b = 0;
        
        for (int i = size - 1; i>= 0; i--){
            copy[i] = array[b];
            b++;
        }
        return copy;
    }
}
