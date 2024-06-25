public class Rectangle implements Figure{
    
    private double width,length;

    public Rectangle() {
        width = 0;
        length = 0 ;

    }

    public Rectangle(double width, double length) {
        this.width = (width >= 0 )  ? width : 0;
        this.length = (length >= 0) ? length : 0;


    }

    ///sets
    public void setWidth(double width) {
        this.width = (width >= 0) ? width : 0;
    }

    public void setLength(double length) {
        this.length = (length >= 0) ? length : 0;
    }

    public void set(double width, double length) {
        this.width = (width >= 0) ? width : 0;
        this.length = (length >= 0) ? length : 0;
    }
    
    
    //gets
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    ///implements
    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public int getSideCount() {
        return 4;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Rectangle)) return false;

        Rectangle other = (Rectangle) obj;  

        return ( 
            this.width == other.width && 
            this.length == other.length
        );
    }

    @Override
    public String toString() {

        return width + "; " + length;
    }
}
