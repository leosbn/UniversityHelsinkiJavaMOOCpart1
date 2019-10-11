
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int firstMax = Math.max(number1, number2);
        int secondMax = Math.max(firstMax, number3);

        return secondMax;
    }

    public static void main(String[] args) {
        int result = greatest(9, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
