public class User {
    String firstName;
    String lastName;
    String city;
    int ID_Number;
    float balance;

    public User(String fName, String lName, String city, int idNumber, float bal){
        this.firstName = fName;
        this.lastName = lName;
        this.city = city;
        this.ID_Number = idNumber;
        this.balance = bal;
    }
}
