
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner lettoreAnno = new Scanner(System.in);
        System.out.println("Insert an year date");
        int year =Integer.parseInt(lettoreAnno.nextLine());
        double restoAnno4 = year % 4;
        double restoAnno100 = year % 100;
        double restoAnno400 = year % 400;
        
        if (restoAnno4 != 0) {
            System.out.println(year + " is not a leap year");
        } else if (restoAnno4 == 0) {
            //controllo se è divisibile per 100
            if (restoAnno100 != 0) {
                System.out.println(year + " is a leap year");
                } else {
                    if (restoAnno400 != 0) {
                        System.out.println(year + " is not a leap year");
                    } else {
                        System.out.println(year + " is a leap year");
                    }
            }
        }
    }
}
