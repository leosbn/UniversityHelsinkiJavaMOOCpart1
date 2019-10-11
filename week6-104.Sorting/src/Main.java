
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] values = {6, 5, 8, 7, 11};
        sort(values);
    }

    public static int smallest(int[] array) {
        int smallerSoFar = array[0];
        for (int i : array) {
            if (i < smallerSoFar) {
                smallerSoFar = i;
            }
        }
        return smallerSoFar;
    }

    public static int indexOfTheSmallest(int[] array) {
        int numberInArray = smallest(array);
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] == numberInArray) {
                break;
            }
        }
        return i;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int[] newArray = new int[array.length - index];
        int indexManip = index;
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[indexManip];
            indexManip++;
        }
        int newIndex = indexOfTheSmallest(newArray);
        return newIndex + index;
    }

    public static void swap(int[] array, int index1, int index2) {
        //salvo le celle originarie
        int cell1 = array[index1];
        int cell2 = array[index2];

        //scambio i contenuti
        array[index1] = cell2;
        array[index2] = cell1;
    }

    public static void sort(int[] array) {
        /*System.out.println(Arrays.toString(array));
        swap(array, 0, indexOfTheSmallest(array));
        System.out.println(Arrays.toString(array));
        swap(array, 1, indexOfTheSmallestStartingFrom(array, 1));
        System.out.println(Arrays.toString(array));
        swap(array, 2, indexOfTheSmallestStartingFrom(array, 2));
        System.out.println(Arrays.toString(array));
        swap(array, 3, indexOfTheSmallestStartingFrom(array, 3));
        System.out.println(Arrays.toString(array));
        swap(array, 4, indexOfTheSmallestStartingFrom(array, 4));
        System.out.println(Arrays.toString(array));
*/
        for(int i=0;i<array.length;i++){
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
            System.out.println(Arrays.toString(array));
        }

    }
}
