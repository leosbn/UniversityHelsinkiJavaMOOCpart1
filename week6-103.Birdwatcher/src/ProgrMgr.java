
import java.util.ArrayList;
import java.util.Scanner;

/**
 * this class holds the starting menu of the program
 *
 * @author Leonardo Sibani
 */
public class ProgrMgr {

    private ArrayList<String> menu;

    /**
     * costruttore del metodo che inizializza anche il menu
     */
    public ProgrMgr() {
        this.menu = new ArrayList<String>();
        this.menu.add("Add");
        this.menu.add("Observation");
        this.menu.add("Statistics");
        this.menu.add("Show");
        this.menu.add("Quit");
    }

    /**
     * testing method
     */
    public ArrayList<String> getMenu() {
        return this.menu;
    }

    public void printMenu() {
        System.out.println("***");
        for (String menu : this.menu) {
            System.out.println(menu);
        }
        System.out.println("***\nChoose an option from above:");
    }
}
