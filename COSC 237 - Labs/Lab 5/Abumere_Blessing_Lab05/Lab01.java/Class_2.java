//Inheritance: Exercise #1 Class_2
public class Class_2 extends Class_1 {
    private int z;
    //x = 0, y = 0, z = 0
    public Class_2() {
        super();
    }
    //x = x1, y = y1, z = z1
    public Class_2(int x1, int y1, int z1) {
        super(x1,y1);
        this.z = z1;
    }
    
    //output x, y, z
    public void print() {
        System.out.printf("%d, %d, %d",super.getX(),super.getY(),this.z);
       
    }
    @Override
    public String toString() {
        return super.toString() + " " + this.z;
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Class_2)) return false;
        Class_2 other = (Class_2) obj;
        return super.equals(obj) && this.z == other.z;
    }
    //x = x1, y = y1, z = z1
    public void set(int x1, int y1, int z1) {
        super.set(x1, y1);
        this.z = z1;
    }

    //get
    public int getZ() {
        return z;
    }
    //set
    public void setZ(int z1) {
        this.z = z1;
    }
    
}