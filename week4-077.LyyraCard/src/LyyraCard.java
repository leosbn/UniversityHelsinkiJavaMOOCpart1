
public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }
    
    public String toString() {
        return "the card has " + balance + " euros";
    }

    public void payEconomical() {
        if (balance >= 2.50) {
            this.balance -= 2.50;
        }
    }

    public void payGourmet() {
        if (balance >= 4.0) {
            this.balance -= 4;
        }
    }

    public void loadMoney(double amount) {
        if (amount > 0) {
            this.balance += amount;

            if (balance > 150) {
                balance = 150;
            }
        }
    }
}
