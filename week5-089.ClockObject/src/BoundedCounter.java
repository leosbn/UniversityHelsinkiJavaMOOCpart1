
public class BoundedCounter {
    // copy here the class BoundedCounter from last weeks assignment 78
    
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void next() {
        this.value++;
        if (this.value > this.upperLimit) {
            this.value = 0;
        }
    }

    public String toString() {
        if (this.value > 9) {
            return "" + this.value;
        } else {
            return "0" + this.value;
        }
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int userInput) {
        if (userInput >= 0 && userInput <= upperLimit) {
            this.value = userInput;
        } else if (userInput > upperLimit){
            this.value = 0;
        }
    }
}
