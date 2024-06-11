/*Task: Create a Time class. The class should contain 3 fields (integers called hrs, mins, secs, for
hours, minutes and seconds) and the following methods:
1. Default and alternate constructors.
2. Three getters (accessors) to return hours, minutes and seconds
3. A method named set; invalid values set to 0
4. Two methods named printMilitary and printStandard to print each Time object in military
and standard format
5. A method toString()
6. A method named equals to compare 2 Time objects for equality
7. 2 methods named copy and getCopy to make a copy of a Time object into another Time object
8. A method named advanceSecs to advance time by 1 second
9. A method named lessThan to decide if a time comes before another tim */

public class Time {

    private int hrs;
    private int mins;
    private int secs;

    public Time() {
        //default
        this.hrs = 0;
        this.mins = 0;
        this.secs = 0;
    }

    public Time(int hrs, int mins, int secs) {

        this.hrs = (hrs > 0 ) ? hrs : 0 ;
        

        //for calc
        this.setMinutes(mins);
        this.setSeconds(secs);
    }

    ///GETS
    public int getHours(){
        return this.hrs;
    }

    public int getMinutes(){
        return this.mins;
    }

    public int getSeconds(){
        return this.secs;
    }

    ///SETS (all positive) ; for calc formula is // new y=  x %60 ; new z = x /60

    //doesnt matter 
    public void setHours(int hrs){
        this.hrs = (hrs > 0) ? hrs : this.hrs;
    }

    //needs calc */
    public void setMinutes(int mins){
        if (mins >= 60 || mins < 0){  
            setHours( (mins / 60) + this.hrs);
            mins = mins % 60;
        }

        this.mins = mins;
    }

    ///needs calc
    public void setSeconds(int secs){
        if (secs >= 60 || secs < 0){

            // new minutes is %60 ; new hours is /60
            setMinutes( (secs / 60) + this.mins);

            secs = secs % 60;
        }

        this.secs = secs;
    }

    public void set(){
        this.hrs = 0;
        this.mins = 0;
        this.secs = 0;
    }

    /** must be positive */
    public void set(int hrs, int mins, int secs){
        this.hrs = (hrs > 0) ? hrs : 0;

        this.setMinutes(mins);
        this.setSeconds(secs);
    }

    //same as set but exists to be safe
    public void setTime(int hrs, int mins, int secs){
        this.set(hrs, mins, secs);
    }
    public void setTime(){
        this.set();
    }
    

    ///COPY & EQUALS
    public void copy(Time t){
        this.hrs = t.hrs;
        this.mins = t.mins;
        this.secs = t.secs;
    }

    public Time getCopy(){
        return new Time(this.hrs, this.mins, this.secs);
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Time)) return false;

        Time t = (Time) obj;

        return(
            this.hrs == t.hrs && 
            this.mins == t.mins && 
            this.secs == t.secs
        );
    }

    ///FUNCTION
    /**  to advance time by 1 second */
    public void advanceSecs(){
        this.setSeconds(this.secs + 1);
    }
    
    /** to decide if a time comes before another time */
    public boolean lessThan(Time t){
        return (
            (this.hrs < t.hrs) || //this hour less than t
            (this.hrs == t.hrs && this.mins < t.mins) || //this min less than t
            (this.hrs == t.hrs && this.mins == t.mins && this.secs < t.secs) ); //this sec less than t
    }

    @Override
    public String toString(){
        return this.hrs + ":" + this.mins + ":" + this.secs;
    }



    ///part 3
    public boolean notEquals(Time otherTime) {

        return !this.equals(otherTime);
    }
    public boolean lessOrEquals(Time otherTime) {

        return this.lessThan(otherTime) || this.equals(otherTime);
    } 
    public boolean greaterThan(Time otherTime) {
        return !this.lessOrEquals(otherTime);
    }
    
    public boolean greaterOrEquals(Time otherTime) {
        return this.greaterThan(otherTime) || this.equals(otherTime);
    }

    ///MILITARY & STANDARD
    public String toStandard(){

        //shouldnt equal 0; if it does its 12am
        final int HOUR_CALC = this.hrs % 12  ;

        final int HOUR = (HOUR_CALC == 0 ) ? 12 : HOUR_CALC;
        
        final String PERIOD = (HOUR > 12) ? "PM" : "AM"; 
    
        return HOUR + ":" + this.mins + ":" + this.secs + " " + PERIOD;
    }


    public String toMilitary(){
        //max is 23

        final int HOUR = this.hrs % 24  ;

       
        return HOUR + ":" + this.mins + ":" + this.secs;
        
    }
}
