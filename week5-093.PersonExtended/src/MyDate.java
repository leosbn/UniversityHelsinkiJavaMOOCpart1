
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInYears(MyDate compared) {
        int effectiveYears = 0;
        effectiveYears = Math.abs(this.year - compared.year);
        //se il primo anno è maggiore
        if (this.year > compared.year) {
            if (this.month < compared.month) {
                effectiveYears--;
            } else if (this.month == compared.month && this.day < compared.day) {
                effectiveYears--;
            }
        } else if (this.year < compared.year) {
            //se il secondo anno è maggiore
            if (this.month < compared.month) {
                effectiveYears--;
            }
            if (this.month == compared.month && this.day < compared.day) {
                //effectiveYears--;
            } else if (this.month == compared.month && this.day > compared.day) {
                effectiveYears--;
            }
            if (this.month > compared.month && this.day > compared.day) {
                effectiveYears++;
            } else if (this.month > compared.month && this.day < compared.day) {
                effectiveYears--;
            }

        }
        return effectiveYears;
    }
}
