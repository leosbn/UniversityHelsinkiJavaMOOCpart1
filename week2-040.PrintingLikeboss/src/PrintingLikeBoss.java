public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int startStars = 1;
        while (startStars <= amount){
            System.out.print("*");
            startStars++;
        }
        System.out.print("\n");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int startSpaces = 1;
        while (startSpaces <= amount){
            System.out.print(" ");
            startSpaces++;
        }
        
    }

    public static void printTriangle(int size) {
        // 40.2
        int altezza = 1;
        while (altezza <= size){
            printWhitespaces(size - altezza);
            printStars(altezza);
            altezza++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3 print bianchi a sx decrescenti e * crescenti per il corpo, al tronco ci penserò
        int startTreeStar = 1;
        int startTreeStarRow = 1;
        int startTreeSpace = height - 1;
        while (startTreeStarRow <= height && startTreeSpace >= 0){ 
            printWhitespaces(startTreeSpace); 
            printStars(startTreeStar);
            startTreeStarRow++;
            startTreeStar +=2;
            startTreeSpace--;
        }
        //stampo il tronco
        
        startTreeStar = 3;
        startTreeSpace = height - 2;
        printWhitespaces(startTreeSpace);
        printStars(startTreeStar);
        printWhitespaces(startTreeSpace);
        printStars(startTreeStar);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        
        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
