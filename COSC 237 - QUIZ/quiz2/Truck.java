public class Truck extends Vehicle {
    private int truckClass;
    private double trunkSize;

    public Truck(){
        super(2,6,0);

        this.truckClass = 0;
        this.trunkSize = 0;
    }
    public Truck(int vehType, int numWheels, double horsePower, int truckClass,double trunkSize) {
        //trucks have atleast 6 wheels probably
        super(
            vehType,
            numWheels = (numWheels >= 6) ? numWheels : 6,
            horsePower
        );

        this.truckClass = truckClass;
        this.trunkSize = 0;
    }


    public int openDoors(){
        System.out.println("Opening Doors for Truck");
        return 0;
    }

    public boolean lock(){
        System.out.println("Locking Truck");
        return true;
    }

    public double tow(Object obj){
        System.out.println("Truck is towing " + obj.getClass());
        return 0;
    }
    ///GET

    public int getTruckClass(){
        return this.truckClass;
    }

    public double getTrunkSize(){
        return this.trunkSize;
    }

    ///SET

    public void setTruckClass(int truckClass){
        this.truckClass = (truckClass > 0) ? truckClass : 0;
    }

    public void setTrunkSize(double trunkSize){
        this.trunkSize = (trunkSize > 0) ? trunkSize : 0;
    }

    ///////implements

    ///electricty
    public int charge(int capacity){
        System.out.println("Truck is charging the battery capacity of " + capacity);
        return 0;
    }

    public boolean checkBattery(){
        System.out.println("Checking battery for Truck");
        return true;
    }
    
    


    //fuel
    public double checkFuel(){
        System.out.println("Checking fuel for Truck");
        return 0;
    }

    public int reFuel(int type, int gallon){
        System.out.printf("Refueling Truck with %d gallon of %s\n",gallon,type);
        return 0;
    }
}   
