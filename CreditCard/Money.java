package QAP2.CreditCard;

public class Money implements Comparable<Money>{
    private long dollars;
    private long cents;

    //Money can't be in the negatives (if/else)
    public Money(double amount){
        if (amount < 0){
            throw new IllegalArgumentException("Amount can not be less than 0.");
        } else {
            this.dollars = (long) amount;
        this.cents = Math.round((amount - this.dollars) * 100);
        }
    }

    //copy constructor
    public Money(Money otherObject){
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    //add other money amounts
    public Money add(Money otherAmount){
        long totalCents = this.cents + otherAmount.cents;
        long totalDollars = this.dollars + otherAmount.dollars + (totalCents / 100);
        totalCents = totalCents % 100;
        return new Money(totalDollars + totalCents / 100.0);
    }

    public long getDollars() {
        return dollars;
    }

    public long getCents() {
        return cents;
    }

    public double asDouble() {
        return dollars + (cents / 100.0);
    }

    public Money(long dollars, long cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    //subtract
    public Money subtract(Money otherAmount) {
        long totalCents = this.dollars * 100 + this.cents;
        long otherTotalCents = otherAmount.dollars * 100 + otherAmount.cents;
    
        if (totalCents < otherTotalCents) {
            throw new IllegalArgumentException("Subtraction would result in a negative amount.");
        }
    
        long differenceCents = totalCents - otherTotalCents;
        long resultDollars = differenceCents / 100;
        long resultCents = differenceCents % 100;
    
        return new Money(resultDollars, resultCents);
    }

    //compare one Monet obj to another
    // 1 is greater, -1 is less than, 0 is equal
    @Override
    public int compareTo(Money otherObject){
        if (this.dollars > otherObject.dollars) {
            return 1;
        } else if (this.dollars < otherObject.dollars) {
            return -1;
        } else {
            if (this.cents > otherObject.cents) {
                return 1;
            } else if (this.cents < otherObject.cents) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    //true or false
    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null || getClass() != otherObject.getClass()) {
            return false;
        }
        Money money = (Money) otherObject;
        return dollars == money.dollars && cents == money.cents;
    }

    // to string
    @Override
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }

}