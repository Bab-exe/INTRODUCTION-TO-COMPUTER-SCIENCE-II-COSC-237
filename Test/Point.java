
import java.lang.Math;

public class Point {

    private double x,y;

    public Point(double x,double y){

        this.x = x;

        this.y = y;
    }

    public Point(){
        this(0.0,0.0);

    }

    public double getX(){ return this.x; }
    public double getY() { return this.y; }

    public void set(double x1, double y1){
        this.x = x1;
        this.y = y1;
    }

    public void add(Point p2){
        this.x += p2.x;

        this.y += p2.y;
    }

    public void sub(Point p2){
        this.x -= p2.x;

        this.y -= p2.y;
    }
    
    public double distance(Point p2){
        return Math.sqrt 
        ( 
            ((this.x - p2.x) * (this.x - p2.x)) 
            +
            ((this.y - p2.y) * ( this.y - p2.y))  
        );
        
    }

    /** distanceFromOrigin to calculate the distance between a point and the origin
at(0, 0) */
    public double distanceFromOrigin(Point p){
       
        return distance(new Point(0,0));
    }
    /** A method named translate to shift the location of a point by a given amount */
    public void translate(double dx, double dy){

        this.x += dx;

        this.y += dy;

    }

    /** A method named isHorizontal that returns true if any given point lines up horizontally with a
given point. */
    public boolean isHorizontal(Point p2){
        return this.y == p2.y;
    }

    /** A method named isVertical that returns true if any given Point object lines up vertically with a
given Point object */
    public boolean isVertical(Point p2){
        return this.x == p2.x;
    }

    /** A method named slope that returns the slope of the line between this Point object and a given
Point object. */
    public double slope(Point p2){
        double m = (p2.y - this.y) / (p2.x - this.x); 
    }

    public void copy(Point p2){
        this.x = p2.x;
        this.y = p2.y;
    }

    public Point getCopy(){  return new Point(this.x, this.y); }

    public String toString(){ return x  + " ," + y;}

    public boolean equals(Object obj){
        if (obj instanceof Point){
            Point other = (Point) obj;
            return other.x == x && other.y == y;
        }return false;
    }
}
