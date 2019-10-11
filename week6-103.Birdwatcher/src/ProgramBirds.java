
import java.util.ArrayList;

/**
 * this class holds the methods that edit the database
 */
public class ProgramBirds {

    ArrayList<Birds> list;

    public ProgramBirds() {
        this.list = new ArrayList<Birds>();
    }

    /**
     * this method adds a bird to the database.
     * OK
     */
    public void addBird(String name, String scientName) {        
        this.list.add(new Birds(name, scientName));
    }
    
    /**
     * this method adds an observation of one of the birds.
     * OK
     */
    public void addObservation(String nameSearched) {
        for (Birds bird : this.list){
            if (bird.getCommonName().equalsIgnoreCase(nameSearched)){
                bird.increaseTimesObserved();
            }
        }
    }
    
    /**
     * this method prints all the birds ever saved on the database.
     * OK
     */
    public void getAllBirds() {
        for (Birds bird : this.list){
            System.out.println(bird);
        }
    }

    /**
     * this method prints the specs of a single bird on the database.
     * OK
     */
    public void getBird(String name) {
        for (Birds bird : this.list){
            if (bird.getCommonName().contains(name)){
                System.out.println(bird);
            } else {
                System.out.println("Is not a bird!");
            }
        }
    }

    /**
     * this method quits the program.
     * OK
     */
    public void quit() {
        System.exit(0);
    }
}
