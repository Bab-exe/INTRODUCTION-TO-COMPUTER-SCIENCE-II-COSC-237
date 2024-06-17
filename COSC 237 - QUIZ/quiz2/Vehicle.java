public abstract class Vehicle implements Fuel, Electricity 
{
    
    private int vehType;
    private int numWheels;
    private double horsePower;

    public boolean start(){
        System.out.println("Vehicle is Starting");
        return true;
    }
    public boolean shutdown(){
        System.out.println("Vehicle is Shutting Down");
        return true;
    }
    public void runs(){
        System.out.println("Vehicle is Running");
    }
    public double nearestStation(int type){
        System.out.println("Vehicle nearest station is type: " + type);
        return 0;

    }

    public Vehicle(){
        this.vehType = 0;
        this.numWheels = 0;
        this.horsePower = 0;
    }
    public Vehicle(int vehType, int numWheels, double horsePower){
        this.vehType = (vehType > 0) ? vehType : 0;
        this.numWheels = (numWheels > 0) ? numWheels : 0;
        this.horsePower = (horsePower > 0) ? horsePower : 0.0;
    }


    ///get

    public int getVehType(){
        return this.vehType;
    }
    public int getNumWheels(){
        return this.numWheels;  
    }
    public double getHorsePower(){
        return this.horsePower;
    }   

    ///set

    public void setVehType(int vehType){
        this.vehType = (vehType > 0) ? vehType : 0;
    }
    public void setNumWheels(int numWheels){
        this.numWheels = (numWheels > 0) ? numWheels : 0;
    }
    public void setHorsePower(double horsePower){
        this.horsePower =( horsePower > 0) ? horsePower : 0.0;
    }
    
    @Override
    public String toString() {
        return String.format(
            "Vehicle Type: %d, Wheels: %d, Horse Power: %.2f",
            this.vehType,
            this.numWheels,
            this.horsePower
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Vehicle)) return false;

        Vehicle other = (Vehicle) obj;
        return (
            this.vehType == other.vehType &&
            this.numWheels == other.numWheels &&
            this.horsePower == other.horsePower
        );
    }

}
