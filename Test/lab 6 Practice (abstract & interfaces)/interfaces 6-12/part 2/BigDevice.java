public abstract class BigDevice implements Connectible {
    private int bigID;

    public BigDevice() {
        bigID = 0;
    }
    public BigDevice(int bigID) {
        this.bigID = (bigID >= 0) ? bigID : 0;
    }

    ///set 
    public void setBigID(int id){
        this.bigID= ( id > 0) ? bigID : 0 ;
    }


    ///get
    public int getBigID() {
        return bigID;
    }



    @Override
    public String toString(){
        return bigID + "";
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof BigDevice)) return false;

        BigDevice other = (BigDevice) obj;

        return (
            super.equals(obj) && 
            other.bigID == this.bigID
        );
        
    }

    public abstract void printType();


    
}
