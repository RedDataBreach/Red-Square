import java.util.ArrayList;
import java.util.Scanner;

public class RedBox {
    ArrayList<User> numOfUsers = new ArrayList<User>();

    public void addAccount(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String fname = scan.nextLine();

        System.out.print("Enter your last name: ");
        String lname = scan.nextLine();

        System.out.print("Enter your city: ");
        String city = scan.nextLine();

        System.out.print("Enter your ID Number: ");
        int id = scan.nextInt();

        System.out.print("Enter your balance: ");
        float bal = scan.nextFloat();

        numOfUsers.add(new User(fname, lname, city, id, bal));



    }
}
