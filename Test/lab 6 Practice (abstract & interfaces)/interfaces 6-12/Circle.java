public class Circle implements Figure {
    private double x,y;
    private double radius;

    public Circle() {
        x = 0;
        y = 0;
        radius = 0;
    }
    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    ///set
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void set(double x, double y, double radius) {
        this.x = x;
        this.y = y; 
        this.radius = radius;
    }


    ///get
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getRadius() {
        return radius;
    }

    //implements
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public int getSideCount() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Circle))  return false;
    
        Circle other = (Circle) obj;

        return( 
            x == other.x && 
            y == other.y && 
            radius == other.radius
        );
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + "); " + radius;
    }
    

    
}
