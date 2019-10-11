
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
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

    public double differenceInYears(MyDate comparedDate) {
        double effectiveYears = 0;
        effectiveYears = Math.abs(this.year - comparedDate.year);
        //se il primo anno è maggiore
        if (this.year > comparedDate.year) {
            if (this.month < comparedDate.month) {
                effectiveYears--;
            } else if (this.month == comparedDate.month && this.day < comparedDate.day) {
                effectiveYears--;
            }
        } else if (this.year < comparedDate.year) {
            //se il secondo anno è maggiore
            if (this.month < comparedDate.month) {
                effectiveYears--;
            }
            if (this.month == comparedDate.month && this.day < comparedDate.day) {
                //effectiveYears--;
            } else if (this.month == comparedDate.month && this.day > comparedDate.day) {
                effectiveYears--;
            }
            if (this.month > comparedDate.month && this.day > comparedDate.day) {
                effectiveYears++;
            } else if (this.month > comparedDate.month && this.day < comparedDate.day) {
                effectiveYears--;
            }

        }
        return effectiveYears;
    }
}
