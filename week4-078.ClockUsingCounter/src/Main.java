
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // exercise 1        
        /*BoundedCounter counter = new BoundedCounter(14);
        System.out.println("Value at start: " + counter);
        
        int i = 0;
        while (i < 10){
            counter.next();
            System.out.println("Value: " + counter);
            i++;
             
       }*/
        //exercise 2
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);
        /*
       int t = 0;
       while (t < 121){
           System.out.println(hours + ":" + minutes);
           minutes.next();
           if (minutes.getValue() % 60 == 0){
               hours.next();
           }
           t++;
       }*/
        //exercise 4
        System.out.println("seconds: ");
        int s = Integer.parseInt(reader.nextLine());
        System.out.println("minutes: ");
        int m = Integer.parseInt(reader.nextLine());
        System.out.println("hours: ");
        int h = Integer.parseInt(reader.nextLine());

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int t2 = 0;
        while (t2 < 120) {
            System.out.println(hours + ":" + minutes + ":" + seconds);
            seconds.next();
            if (seconds.getValue() % 60 == 0) {
                minutes.next();
            }
            if (minutes.getValue() % 60 == 0 && seconds.getValue() % 60 == 0) {
                hours.next();
            }
            t2++;
        }

    }
}
