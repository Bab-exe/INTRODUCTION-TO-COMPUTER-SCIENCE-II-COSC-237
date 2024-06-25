// Class RectangularPrism. Implements Shape3D // Represents a three­dimensional rectangular shape.
public class RectangularPrism implements Shape3D { 
    private double length; 
    private double width; 
    private double height; 
  
    public RectangularPrism() {   
        length = 0; 
        width = 0; 
        height = 0;
    } 
  
    public RectangularPrism(double l, double w, double h) {        
        this.length = (l > 0) ? l : 0;        
        this.width = (w > 0) ? w : 0;        
        this.height = (h > 0) ? h : 0;
    }
    public double getLength() {        
        return length;
    }
    public double getWidth() {        
        return width;
    } 
  
    public double getHeight() {        
        return height;
    }
    public double getArea() {        
        return 2 * (length * width + width * height + length * height);
    }
    public double getVolume() {       
        return length * width * height;
    } 
  
    @Override
    public String toString() { 
        return "For this rectangular prism the base has the length = " + this.length + " and the width = " + this.width + "\nThe height of the prism = " + this.height;
    } 
  
    @Override
    public boolean equals(Object obj) {        
        if (!(obj instanceof RectangularPrism)) return false;

        RectangularPrism other = (RectangularPrism) obj;

        return (
            super.equals(other) &&
            this.length == other.length &&
            this.width == other.width &&
            this.height == other.height
        );
    } 
}