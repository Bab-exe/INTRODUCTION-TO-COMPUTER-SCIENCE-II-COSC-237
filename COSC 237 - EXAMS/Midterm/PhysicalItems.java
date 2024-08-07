public abstract class PhysicalItems implements StoreRentals,OnlineRentals{
    private int phyID;
    private int storeID;

    public PhysicalItems(){
        this.phyID = 0;
        this.storeID = 0;
    }
    public PhysicalItems(int phyID, int storeID){
        this.phyID = (phyID > 0) ? phyID : 0;
        this.storeID = (storeID > 0) ? storeID : 0;
    }

    //get

    public int getPhyID(){
        return this.phyID;
    }
    public int getStoreID(){
        return this.storeID;
    }


    //set   

    public void setPhyID(int phyID){    
        this.phyID = (phyID > 0) ? phyID : 0;
    }
    public void setStoreID(int storeID){
        this.storeID = (storeID > 0) ? storeID : 0;
    }

    
    /*Prints out “<Object> with phyID=<phyID>, storeID=<storeID> is due by: <dueDate>” where dueDate is the sub-class’s variable */
    public abstract void printDueDate();
    /**Prints out “Reminder: <Object> with phyID=<phyID>, storeID=<storeID> will be due by:<dueDate>” dueDate is the sub-class’s variable */
    public abstract void printDueDateReminder();
    // ... Other required functions/methods go here ...
    //required
    @Override
    public String toString(){
        return String.format(
            "phyID = %d, " +
            "storeID = %d",
            this.phyID,
            this.storeID
        );
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof PhysicalItems)) return false;
        PhysicalItems other = (PhysicalItems) obj;

        return (
            this.phyID == other.getPhyID() &&
            this.storeID == other.getStoreID()
        );
    }

    }