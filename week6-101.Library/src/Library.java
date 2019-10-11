
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> libreria;

    public Library() {
        this.libreria = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        this.libreria.add(newBook);
    }

    public void printBooks() {
        for (Book libro : libreria) {
            System.out.println(libro);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book tuttiLibri : libreria) {
            String titolo = tuttiLibri.title();
            if (StringUtils.included(titolo, title)) {
                found.add(tuttiLibri);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book tuttiLibri : libreria) {
            String editore = tuttiLibri.publisher();
            if (StringUtils.included(editore, publisher)) {
                found.add(tuttiLibri);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book tuttiLibri : libreria) {
            int anno = tuttiLibri.year();
            if (anno == year) {
                found.add(tuttiLibri);
            }
        }
        return found;
    }
}
