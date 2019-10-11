
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added){
        Money sum = new Money(this.euros + added.euros, this.cents + added.cents);
        return sum;
    }
    
    public boolean less(Money compared){
        if (this.euros < compared.euros){
            return true;
        } else if (this.euros > compared.euros){
            return false;
        } else {
            if (this.cents < compared.cents){
                return true;
            } else {
                return false;
            }
        }
    }
    
    public int eurosToCents(int euro, int cent){
        return euro * 100 + cent;
    }
    
    public Money minus(Money decremented){
        int thisMoney = eurosToCents(this.euros, this.cents);
        int thatMoney = eurosToCents(decremented.euros, decremented.cents);
        int solution = thisMoney - thatMoney;
        if (solution<0){
            return new Money(0,0);
        } else if (solution==0){
            return new Money(0,0);
        } else {
            return new Money(solution/100, solution%100);
        }
    }
    
    
}
