package lesson6.clockfeatures.domain;

/**
 * Hour should represent a value between 0 and 24
 */
public class Hour {
    private byte hour;

    public Hour() {
    }
//argument counstructor is improved with validation
    public Hour(byte hour) {
        this.setHour(hour);
    }

    public byte getHour() {
        return hour;
    }

    /**
     * Validation is in place
     * bytes from 0 till 24 are allowed
     * @param hour -byte
     */
    public void setHour(byte hour) {
        if (hour<0){
            //Trow an error;
            return;
        }else if (hour>24){
            //Throw an error;
            return;
        }
        this.hour = hour;
    }
}
