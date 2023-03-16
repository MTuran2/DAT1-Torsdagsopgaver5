package Task1;

public class Customer {

    private String firstName;
    private String lastName;
    private String username;
    private int id;

    public Customer(String fName, String lName, String uName, int idNumber) {
        this.firstName = fName;
        this.lastName = lName;
        this.username = uName;
        this.id = idNumber;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getUsername() {
        return this.username;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString(){

        String s = "Name: " + getFirstName() + " " + getLastName() + " , Username: " + getUsername() + " , Id: " + getId() + ".\n";
        return s;
    }


}
