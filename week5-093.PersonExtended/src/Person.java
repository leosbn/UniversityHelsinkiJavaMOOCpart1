
import java.util.Calendar;

public class Person {

    private String name;
    private MyDate birthday;

    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday){
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person(String name){
        this.name = name;
        int dd = Calendar.getInstance().get(Calendar.DATE);
        int mm = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int yy = Calendar.getInstance().get(Calendar.YEAR);
        this.birthday = new MyDate(dd, mm, yy);
    }

    public int age() {
        // calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        int dd = Calendar.getInstance().get(Calendar.DATE);
        int mm = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int yy = Calendar.getInstance().get(Calendar.YEAR);

        MyDate birthdayToday = new MyDate(dd, mm, yy);
        return birthdayToday.differenceInYears(birthday);
    }

    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        if (this.birthday.earlier(compared.birthday)) {
            return true;
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
