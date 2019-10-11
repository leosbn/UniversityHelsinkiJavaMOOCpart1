
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // add the methods here
    
    public void addMeal(String meals){
        if (!this.meals.contains(meals)){
            this.meals.add(meals);
        }
        
    }
    
    public void printMeals(){
        for (String contentOfMenu : this.meals){
            System.out.println(contentOfMenu);
        }
    }
    
    public void clearMenu(){
        while (this.meals.size() > 0){
            this.meals.remove(0);
        }
        
    }
}
