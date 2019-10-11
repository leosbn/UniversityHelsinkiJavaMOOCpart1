
import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> contacts;

    public Phonebook() {
        this.contacts = new ArrayList<Person>();
    }

    public void add(String name, String number) {
        this.contacts.add(new Person(name, number));
    }

    public void printAll() {
        for (Person person : this.contacts) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name) {
        for (Person persona : this.contacts) {
            if (persona.getName().contains(name)) {
                return persona.getNumber();
            }
        }
        return "number not known";
    }
}
