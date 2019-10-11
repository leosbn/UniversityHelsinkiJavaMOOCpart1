
/**
 * this class holds the specific bird class
 */
public class Birds {

    private String commonName;
    private String scientName;
    private int timesBirdWasTracked;

    public Birds(String name, String latinName) {
        this.commonName = name;
        this.scientName = latinName;
        this.timesBirdWasTracked = 0;
    }
    
    public String toString(){
        return this.commonName + ", " + this.scientName + ", " + "observed " + this.timesBirdWasTracked + " times.";
    }
    
    public String getCommonName(){
        return this.commonName;
    }
    
    public String getScientName(){
        return this.scientName;
    }
    
    public int getTimesObserved(){
        return this.timesBirdWasTracked;
    }
    
    public void increaseTimesObserved(){
        this.timesBirdWasTracked++;
    }

}
