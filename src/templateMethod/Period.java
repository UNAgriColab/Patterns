package templateMethod;

public class Period {

    private int secs;
    private int mins;
    private int hour;

    public Period (int hour , int mins , int secs){
        this.secs= secs;
        this.mins = mins;
        this.hour = hour;
    }
    public int getSecs(){
        int secInmin = 60;
        int secsInhour = 60*secInmin;
        return this.hour*secsInhour + this.mins*secInmin + this.secs;
    }
}
