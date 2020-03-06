
public class Clock {

    private int hours;
    private int minutes;
    private int seconds;
    
    
    public Clock(int hours,int minutes,int seconds) {
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;
    }
    
    public void setHours(int hours) {
        this.hours=hours;
    }
    public void setMinutes(int minutes) {
        this.minutes=minutes;
    }
    public void setSeconds(int seconds) {
        this.seconds=seconds;
    }

    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }
    public int getSeconds() {
        return seconds;
    }
    
    public String toString() {
        return (hours+":"+minutes+":"+seconds);
    }
    
    
    
    
    
    
    
    
    
    
}