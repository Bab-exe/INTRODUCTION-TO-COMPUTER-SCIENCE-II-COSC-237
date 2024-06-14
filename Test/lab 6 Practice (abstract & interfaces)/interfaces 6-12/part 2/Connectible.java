public interface Connectible {
    void printConViaBluetooth();
    void printConViaWifi();
    
    @Override
    public String toString();

    @Override
    public boolean equals(Object obj);
}
