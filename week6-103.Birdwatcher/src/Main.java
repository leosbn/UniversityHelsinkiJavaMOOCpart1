
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ProgrMgr mgr = new ProgrMgr();
        ProgramBirds program = new ProgramBirds();
        while (true) {
            System.out.println("?");
            String choose = scan.nextLine();
            if (choose.equalsIgnoreCase("Quit")) {
                break;
            } else if (choose.equalsIgnoreCase("Add")) {
                System.out.println("Name:");
                String inputName = scan.nextLine();
                System.out.println("Scientific name:");
                String inputScient = scan.nextLine();
                program.addBird(inputName, inputScient);
            } else if (choose.equalsIgnoreCase("Observation")) {
                System.out.println("What was observed?");
                String inputObservat = scan.nextLine();
                program.addObservation(inputObservat);
            } else if (choose.equalsIgnoreCase("Statistics")) {
                program.getAllBirds();
            } else if (choose.equalsIgnoreCase("Show")) {
                System.out.println("What?");
                String inputWhat = scan.nextLine();
                program.getBird(inputWhat);
            } else if (choose.equalsIgnoreCase("Quit")) {
                program.quit();
            }
        }
    }

}
