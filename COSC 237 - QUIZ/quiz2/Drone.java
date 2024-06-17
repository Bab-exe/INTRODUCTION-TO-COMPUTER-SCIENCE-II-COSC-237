public class Drone extends Aircraft{
    private double camRes;
    private double flyTime;

    public Drone(){
        super();
        this.camRes = 0.0;
        this.flyTime = 0.0;
    }
    public Drone(int airType, double batCapacity, double camRes, double flyTime){ 
        super(
            airType,
            batCapacity
        );
        this.camRes = (camRes   > 0) ? camRes    : 0.0;
        this.flyTime = (flyTime > 0) ? flyTime : 0.0;
    }
    ///SET
    public void setCamRes(double camRes){
        this.camRes = (camRes > 0) ? camRes : 0.0;
    }
    public void setFlyTime(double flyTime){
        this.flyTime = (flyTime > 0) ? flyTime : 0.0;
    }


    ///GET
    public double getCamRes(){
        return this.camRes;
    }
    public double getFlyTime(){
        return this.flyTime;
    }

    public void record(){
        System.out.println("Drone is Recording");
    }
    public void capture(){
        System.out.println("Drone is now capturing");
    }

    public void flip(int mode){
        System.out.println("Drone is Flipping in mode " + mode);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
            ", Camera Resolution: %.2f, Fly Time: %.2f",
        
            this.camRes,
            this.flyTime
        );
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Drone)) return false;
        Drone other = (Drone) obj;
        return (
            super.equals(obj) &&
            this.camRes == other.camRes &&
            this.flyTime == other.flyTime
        );
    }
    ///IMPLEMENT
    public boolean checkBattery(){
        System.out.println("Checking battery for Drone");
        return true;
    }
    
    public int charge(int capacity){
        System.out.println("Drone is charging the battery capacity of " + capacity);
        return 0;
    }

}
