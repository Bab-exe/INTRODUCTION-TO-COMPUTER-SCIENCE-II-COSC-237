

public class Point {

    private int x,y;

    public Point(int x,int y){
        if (x < 0 || y < 0) throw new IllegalArgumentException("ERROR! Should be positive.");
        this.x = x;
        this.y = y;
    }

    public Point(){
        this.x = 0;
        this.y = 0;
    }


    ////GETS
    public int getX(){ return this.x; }
    public int getY() { return this.y; }


    ////SETs
    public void setX(int x1){ 
        if (x1 < 0) throw new IllegalArgumentException("ERROR! X Should be positive.");
        this.x = x1; 

    }
    public void setY(int y1){ 
        if (y1 < 0) throw new IllegalArgumentException("ERROR! Y Should be positive.");
        this.y = y1;
    }

    public void set(int x1, int y1){
        this.setX(x1);
        this.setY(y1);
    }
    

    public void set(){
        this.x = 0;
        this.y = 0;
    }



    ////FUNCTION
    public void add(Point p2){
        this.x += p2.x;

        this.y += p2.y;
    }

    public void sub(Point p2){
        this.x -= p2.x;

        this.y -= p2.y;
    }
    
    /** √((x2 – x1)² + (y2 – y1)²) */
    public double distance(Point p2){
        return Math.sqrt 
        ( 
            (double)
            ((this.x - p2.x) * (this.x - p2.x)) +
            ((this.y - p2.y) * (this.y - p2.y))  
        );
        
    }

    /** distanceFromOrigin to calculate the distance between a point and the origin
at(0, 0) */
    public double distanceFromOrigin(){
        return distance(new Point(0,0));
    }
    
    /** A method named translate to shift the location of a point by a given amount */
    public void translate(int dx, int dy){
        this.x += dx;

        this.y += dy;

    }

    /** A method named isHorizontal that returns true if any given point lines up horizontally with a
given point. */
    public boolean isHorizontal(Point p2){
        return (this.y == p2.y) ;
    }

    /** A method named isVertical that returns true if any given Point object lines up vertically with a
given Point object */
    public boolean isVertical(Point p2){
        return (this.x == p2.x);
    }

    /** A method named slope that returns the slope of the line between this Point object and a given
Point object. */
    public double slope(Point p2){
        //y2 - y1 / x2 - x1
        return ((double)(p2.y - this.y) / (p2.x - this.x)); 
    }

    public void copy(Point p2){
        this.x = p2.x;
        this.y = p2.y;
    }

    public Point getCopy(){  return new Point(this.x, this.y); }

    @Override
    public String toString(){ return "(" + x  + ", " + y + ")";}

    /**A method named print to print each Point object as (x, y)*/
    public void print(){ 
        System.out.print(this.toString());
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Point){
            Point other = (Point) obj;
            return other.x == x && other.y == y;
        }return false;
    }

    
}
