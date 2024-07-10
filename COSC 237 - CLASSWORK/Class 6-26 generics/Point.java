

public class Point
    <T extends Comparable>
    implements Comparable<Point<T>>
{
    private T x,y;
    
    public Point(T x, T y){
        this.x = x;
        this.y = y;
    }

    public Point(){
        this.x = null;
        this.y = null;
    }

    //get
    public T getX(){
        return x;
    }
    public T getY(){
        return y;
    }

    //set
    public void setX(T x){
        this.x = x; 
    }
    public void setY(T y){
        this.y = y;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Point){
            Point p = (Point) obj;

            return (
                this.x.equals(p.x) &&
                this.y.equals(p.y)
            );
        }   

        return false;
    }
 
    @Override
    public String toString(){
        return "(" + x + ", " + y + ")";
    }

    

    @Override
    public int compareTo(Point<T> p){
    
        final int X_DIFF = this.x.compareTo(p.x);

        if (X_DIFF == 0) return X_DIFF;
         

        return this.y.compareTo(p.y);
    }
}
