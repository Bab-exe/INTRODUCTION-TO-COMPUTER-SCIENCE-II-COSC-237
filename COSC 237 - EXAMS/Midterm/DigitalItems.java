public abstract class DigitalItems implements OnlineRentals{
    private int diID;
    private String serial;

    public DigitalItems(){
        this.diID = 0;
        this.serial = null;
    }

    public DigitalItems(int diID, String serial){
        this.diID = (diID > 0) ? diID : 0;
        this.serial = serial;
    }

    /**Prints out “<Object> with diID=<diID>, serial=<serial> is due by: <dueDate>” where
    dueDate is the sub-class’s variable*/
    public abstract void printDueDate();
    /**Print out “Reminder: <Object> with diID=<diID>, serial=<serial> will be due by:
    <dueDate>” where dueDate is the sub-class’s variable*/
    public abstract void printDueDateReminder();
    // ... Other required methods/functions go here ...

    //set

    public void setDiID(int diID){
        this.diID = (diID > 0) ? diID : 0;
    }

    public void setSerial(String serial){
        this.serial = serial;
    }

    //get

    public int getDiID(){
        return this.diID;
    }

    public String getSerial(){
        return this.serial;
    }

    @Override
    public String toString(){
        return String.format(
            "diID = %d, " +
            "serial = %s",  

            this.diID,
            this.serial
        );
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof DigitalItems)) return false;
        DigitalItems other = (DigitalItems) obj;
        return (
            this.diID == other.getDiID() &&
            this.serial.equals(other.getSerial())
        );
    }
}