public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times
        int startStars = 1;
        while (startStars <= amount){
            System.out.print("*");
            startStars++;
        }
        System.out.print("\n");
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int startSquares = 1;
        while (startSquares <= sideSize){
            printStars(sideSize);
            startSquares++;
        }
        System.out.print("\n");
    }

    public static void printRectangle(int width, int height) {
        // 39.3 devo creare un ciclo di printstars con tanti printstars quanto vale l'altezza
        int startRectangle = 1;
        while (startRectangle <= height){
            printStars(width);
            startRectangle++;
        }
        System.out.print("\n");
    }

    public static void printTriangle(int size) {
        // 39.4
        int startTriangleSize = 1;
        while (startTriangleSize <= size){
            printStars(startTriangleSize);
            startTriangleSize++;
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
