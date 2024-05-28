package QAP2.CreditCard;

public class Person {
    private String lastName;
    private String firstName;
    private Address home;

    //Constructor
    public Person(String fistName, String lastName, Address home) {
        this.firstName = fistName;
        this.lastName = lastName;
        this.home = home;
    }

    //get
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public Address getHome() {
        return home;
    }

    //to String
    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + home.toString();
    }
}
