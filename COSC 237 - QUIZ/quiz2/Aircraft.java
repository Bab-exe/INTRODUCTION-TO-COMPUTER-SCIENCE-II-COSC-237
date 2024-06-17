public abstract class Aircraft implements Electricity{
    private int airType;
    private double batCapacity;

    public Aircraft(){
        this.airType = 0;
        this.batCapacity = 0.0;
    }
    public Aircraft(int airType, double batCapacity){
        this.airType = (airType > 0) ? airType : 0;
        this.batCapacity = (batCapacity > 0) ? batCapacity : 0.0;
    }
    
    ///GET

    public int getAirType(){
        return this.airType;
    }
    public double getBatCapacity(){
        return this.batCapacity;
    }
    //SET

    public void setAirType(int airType){
        this.airType = (airType > 0) ? airType : 0;
    }
    public void setBatCapacity(double batCapacity){
        this.batCapacity = (batCapacity > 0) ? batCapacity : 0.0;
    }



    public boolean start(){
        System.out.println("Aircraft is Starting");
        return true;
    }

    public boolean fly(){
        System.out.println("Aircraft is Flying");
        return true;
    }

    public boolean land(int mode){
        System.out.println("Aircraft is Landing with landing mode " + mode);
        return true;
    }

    public void returnBase(){
        System.out.println("Aircraft is Returning to Base");
    }

    

    @Override
    public String toString(){
        return String.format(
            ", Aircraft Type: %d, Battery Capacity: %.2f",
            this.airType,
            this.batCapacity
        );
    }
    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Aircraft)) return false;

        Aircraft other = (Aircraft) obj;
        return (
            this.airType == other.airType &&
            this.batCapacity == other.batCapacity
        );
        
    }
}
