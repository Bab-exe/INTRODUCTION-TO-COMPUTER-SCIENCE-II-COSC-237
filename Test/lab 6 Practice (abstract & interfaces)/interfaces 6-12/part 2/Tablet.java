public class Tablet extends BigDevice {
    private int screenSize;

    public Tablet() {
        super();   
        this.screenSize = 0;
    }
    public Tablet(int id, int screenSize) {
        super(id);
        this.screenSize = (screenSize >= 0) ? screenSize : 0;
    }

    //set
    public void setScreenSize(int screenSize) {
        this.screenSize = (screenSize >= 0) ? screenSize : 0;
    }

    //get
    public int getScreenSize() {
        return screenSize;
    }


    //required
    public void printType() {
        System.out.print("Tablet");
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Tablet)) return false;
        Tablet other = (Tablet) obj;

        return (
            super.equals(other) &&
            screenSize == other.screenSize
        );
    }

    @Override
    public String toString(){
        return super.toString() + " ;" + screenSize;
    }

    
    public void printConViaBluetooth() {
        System.out.println("Tablet connected via Bluetooth");
    }

    public void printConViaWifi() {
        System.out.println("Tablet connected via Wifi");
    }
}
