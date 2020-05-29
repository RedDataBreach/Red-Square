import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        RedBox store = new RedBox();

        System.out.println("========================================== \n" +
                "\t\t\tWelcome to RedBox \n" +
                "========================================== \n");


        System.out.print("What would you like to do today? \n" +
                "1) CREATE AN ACCOUNT \n" +
                "2) RENT A MOVIE \n" +
                "Enter: ");

        int choice = scan.nextInt();

        switch(choice){
            case 1:
                store.addAccount();
                break;

        }

        System.out.println("Your balance is $" + store.numOfUsers.get(0).balance);
    }
}
