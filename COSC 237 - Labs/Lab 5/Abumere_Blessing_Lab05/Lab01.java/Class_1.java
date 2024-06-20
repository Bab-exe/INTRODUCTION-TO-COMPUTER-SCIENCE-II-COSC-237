//Inheritance: Exercise #1 Class_1
public class Class_1 {
    private int x;
    private int y;
    public Class_1() {
        x = 0;
        y = 0;
    }
    public Class_1(int x1, int y1) {
        x = x1;
        y = y1;
    }
    public void print() {
        System.out.print(x + " " + y);
    }
    @Override
    public String toString() {
        return x + " " + y;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Class_1)) return false;
        Class_1 other = (Class_1) obj;
        return x == other.x && y == other.y;
    }
    public void set(int x1, int y1) {
        x = x1;
        y = y1;
    }

    //get
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
    //set
    public void setX(int x1){
        x = x1;
    }
    public void setY(int y1){
        y = y1;
    }
}