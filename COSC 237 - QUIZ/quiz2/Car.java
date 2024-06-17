public class Car extends Vehicle 
{

    private int carClass;
    private double horsePower; //??? already in vehicle

    public Car(){
        super(1,4,0);
        this.carClass = 0;
        this.horsePower = 0;
    }

    public Car(int carClass, double HP){
        super(1,4,HP); //cars have 4 wheels 

        this.carClass = carClass;
        this.horsePower = super.getHorsePower(); //already in super
    }

    public int getCarClass(){
        return this.carClass;
    }

    //already in vehicle??
    public double getHorsePower(){
        return this.horsePower;
    }

    

    public int openDoors(){
        System.out.println("Opening Doors for Car");
        return 0;
    }

    public boolean openTrunk(){
        System.out.println("Opening Trunk for Car");
        return true;
    }

    public boolean lock(){
        System.out.println("Locking Car");
        return true;
    }
    @Override
    public String toString(){
        return super.toString() + String.format(

            ", Car Class: %d, Horse Power: %.2f",
            this.carClass,
            this.horsePower
        );
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Car)) return false;
        Car other = (Car) obj;
        return (
            super.equals(obj) &&
            this.carClass == other.carClass &&
            this.horsePower == other.horsePower
        );
    }

    ////IMPLEMENTs

    //Electricity 
    public int charge(int capacity){
        System.out.println("Car is charging the battery capacity of capacity " + capacity); 
        return 0;
    }

    public boolean checkBattery(){
        System.out.println("Checking battery for Car ");
        return true;
    }

    //Fuel
    public double checkFuel(){
        System.out.println("Checking fuel for Car ");
        return 0;
    }
    
    public int reFuel(int type, int gallon){
        System.out.printf("Refueling Car with %d gallons of %s\n",gallon,type);
        return 0;
    }

    
}
