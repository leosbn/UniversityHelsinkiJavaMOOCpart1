
public class Counter {

    private int value;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, true);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        if (!this.check) {
            this.value--;
        }
        if (this.value == 0 && this.check == true) {
            this.value = 0;
        }
        if (this.value > 0 && this.check == true) {
            this.value--;
        }
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.value += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            if (!this.check) {
                this.value -= decreaseAmount;
            }
            if (this.check && this.value == 0) {
                this.value = 0;
            }
            if (this.check && this.value - decreaseAmount < 0){
                this.value = 0;
            }
        }
    }
}
