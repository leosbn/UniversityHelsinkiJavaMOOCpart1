
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        Money a = new Money(5, 40);
        Money b = new Money(4, 60);
        
        Money c = a.plus(b);
        System.out.println(c);
        Money d = a.minus(b);
        System.out.println(d);
        System.out.println(d.cents());
        
    }
}
