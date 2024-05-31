
import java.lang.Math;

public class Point2D {

    private double x,y;

    public Point2D(double x,double y){

        this.x = x;

        this.y = y;
    }

    public Point2D(){
        this(0.0,0.0);

    }

    public double getX(){ return this.x; }
    public double getY() { return this.y; }

    public void set(double x1, double y1){
        this.x = x1;
        this.y = y1;
    }

    public void add(Point2D p2){
        this.x += p2.x;

        this.y += p2.y;
    }

    public void sub(Point2D p2){
        this.x -= p2.x;

        this.y -= p2.y;
    }
    
    public double distance(Point2D p2){
        return Math.sqrt 
        ( 
            ((this.x - p2.x) * (this.x - p2.x)) 
            +
            ((this.y - p2.y) * ( this.y - p2.y))  
        );
        
    }

    public void copy(Point2D p2){
        this.x = p2.x;
        this.y = p2.y;
    }

    public Point2D getCopy(){  return new Point2D(this.x, this.y); }

    public String toString(){ return x  + " ," + y;}

    public boolean equals(Object obj){
        if (obj instanceof Point2D){
            Point2D other = (Point2D) obj;
            return other.x == x && other.y == y;
        }return false;
    }
}
