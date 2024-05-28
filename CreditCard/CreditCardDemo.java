package QAP2.CreditCard;

public class CreditCardDemo {
    public static void main(String[] args) {
        //set values for Money
        final Money LIMIT = new Money(1000);
        final Money FIRST_AMOUNT = new Money(200);
        final Money SECOND_AMOUNT = new Money (10.02);
        final Money THIRD_AMOUNT = new Money(25);
        final Money FOURTH_AMOUNT = new Money(990);

        //set vaues for person
        Person owner = new Person("Christie", "Diane",
                new Address("237J Harvey Hall", "Menomonie", "WI", "54751"));

        CreditCard visa = new CreditCard(owner, LIMIT);

        //initial balance and limit
        System.out.println(visa.getPersonals());
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Credit limit: " + visa.getCreditLimit());
        //space for printing
        System.out.println();

        // charging the card (1st)
        System.out.println("Attempt to charge: " + FIRST_AMOUNT);
        visa.charge(FIRST_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());

        // charging the card (2nd)
        System.out.println("Attempt to charge: " + SECOND_AMOUNT);
        visa.charge(SECOND_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());

        // charging the card (3rd)
        System.out.println("Attempt to pay: " + THIRD_AMOUNT);
        visa.payment(THIRD_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());

        // charging the card (4th)
        System.out.println("Attempt to charge: " + FOURTH_AMOUNT);
        try {
            visa.charge(FOURTH_AMOUNT);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Balance: " + visa.getBalance());


    }
}
