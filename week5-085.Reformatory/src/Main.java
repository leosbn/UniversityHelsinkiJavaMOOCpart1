
public class Main {

    public static void main(String[] args) {
        // write here test code 
        Person pekka = new Person("Pekka", 30, 170, 60);
        System.out.println(pekka);
        pekka.adult();
        pekka.becomeOlder();
        pekka.setWeight(75);
        System.out.println(pekka);
        Reformatory ref = new Reformatory();
        System.out.println(ref);
        System.out.println(ref.weight(pekka));
        ref.feed(pekka);
        System.out.println(ref.weight(pekka));
        
    }
}
