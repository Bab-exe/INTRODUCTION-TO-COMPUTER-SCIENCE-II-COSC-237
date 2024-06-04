

public class Rectangle {
    private double width,length;

    public Rectangle(double width, double length){
        if (length < 0 || width < 0 ) throw new IllegalArgumentException("Values Must Be Positive");

        this.width = width;
        this.length = length;
    }

    public Rectangle(){
        this.width = 0; 
        this.length = 0;
    }

    public double getWidth(){ return this.width; }

    public double getLength(){return this.length;}
    public void setWidth(double w){
        if (w < 0) throw new IllegalArgumentException("Width Must Be Positive");
        this.width = w;
    }
    public void setLength(double h){
        if (h < 0) throw new IllegalArgumentException("length Must Be Positive");
        this.length = h;
    }
    

    public double area(){ return this.width * this.length; }

    /** perimeter = 2*width + 2*length */
    public double perimeter(){ return (2 * this.width) + (2 * this.length); }

    public void copy (Rectangle r){
        this.length = r.length;
        this.width = r.width;
    }

    public Rectangle getCopy(){ return new Rectangle(this.width,this.length); }

    public String toString(){ 
        return this.width + ";" + this.length;
    }
    public boolean equals(Object obj){
        if (!(obj instanceof Rectangle)) return false;

        Rectangle other = (Rectangle) obj;
        return other.width == this.width && other.length == this.length;

    }

}
