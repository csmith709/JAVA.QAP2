package QAP2.CreditCard;

public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // constructor
    public CreditCard(Person newCardHolder, Money limit){
        this.owner = newCardHolder;
        this.creditLimit = limit;
        this.balance = new Money(0);
    }

    //get current balance
    public Money getBalance(){
        return balance;
    }

    //get limit
    public Money getCreditLimit(){
        return creditLimit;
    }

    //get cardholder personal info
    public String getPersonals() {
        return owner.toString();
    }

    //charging amount to creditcard
    public void charge(Money amount) {
        if (balance.add(amount).compareTo(creditLimit) > 0) {
            throw new IllegalArgumentException("Charge would exceed credit limit.");
        } else {
            balance = balance.add(amount);
        }
    }

    //make payment
    public void payment(Money amount) {
        if (amount.compareTo(new Money(0)) < 0) {
            throw new IllegalArgumentException("Payment amount cannot be negative.");
        }
        balance = balance.subtract(amount);
    }
}
