
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList();
        String mStudentName;
        String mStudentNumber;

        while (true) {
            //inserting data
            System.out.println("name:");
            mStudentName = userInput.nextLine();
            if (mStudentName.isEmpty()) {
                break;
            }
            System.out.println("studentnumber:");
            mStudentNumber = userInput.nextLine();
            //create person and add to list
            Student student = new Student(mStudentName, mStudentNumber);
            list.add(student);

        }
        for (Student student : list){
            System.out.println(student);
        }
        
        //3
        System.out.println("Search:");
        String mUserSearch = userInput.nextLine();
        System.out.println("Result:");
        for (Student studen : list){
            if (studen.getName().contains(mUserSearch)){
                System.out.println(studen);
            }
        }
        

    }
}
