import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // test your program here
        Library lib = new Library();
        lib.addBook(new Book("titolo", "editore", 2019));
        lib.addBook(new Book("test2", "tester2", 2017));
        lib.addBook(new Book("Lord of the Rings", "Bompiani", 2005));
        lib.addBook(new Book("Harry Potter e gli anelli", "stocazzo", 2000));
        
        lib.printBooks();
        System.out.println("\nLibri da cercare:");
        System.out.println(lib.searchByTitle("harry"));
    }
}
