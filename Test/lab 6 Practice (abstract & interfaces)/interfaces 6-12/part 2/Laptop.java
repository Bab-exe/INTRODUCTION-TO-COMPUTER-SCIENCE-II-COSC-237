public class Laptop extends BigDevice {
    private int cpu, ram;

    
    public Laptop() {
        super();
        cpu = 0;
        ram = 0;
    }

    public Laptop(int bigID, int cpu, int ram) {
        super(bigID);
        this.cpu = (cpu >= 0) ? cpu : 0;
        this.ram = (ram >= 0) ? ram : 0;
    }

    ///set
    public void set(int cpu, int ram) {
        this.cpu = (cpu >= 0) ? cpu : 0;
        this.ram = (ram >= 0) ? ram : 0;
    }

    public void setCPU(int cpu) {
        this.cpu = (cpu >= 0) ? cpu : 0;
    }

    public void setRAM(int ram) {
        this.ram = (ram >= 0) ? ram : 0;
    }

    ///get
    public int getCPU() {
        return this.cpu;
    }

    public int getRAM() {
        return this.ram;
    }


    
    @Override
    public String toString() {
        return super.toString() + " ;" + cpu + ";" + ram; 
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Laptop)) return false;

        Laptop other = (Laptop) obj;

        return (
            super.equals(other) &&
            cpu == other.cpu &&
            ram == other.ram
        );
    }



    ///required
    
    public void printType(){
        System.out.print("Laptop");
    }

    public void printConViaWifi() {
        System.out.println("Laptop connected via Wifi");
    }

    public void printConViaBluetooth() {
        System.out.println("Laptop connected via Bluetooth");
    }
}
