// Class SquarePyramid. Implements Shape3D 
// Represents a pyramid with a square as its base. 
public class SquarePyramid implements Shape3D { 
    private double length; 
    private double height; 
  
    public SquarePyramid() { 
        length = 0; 
        height = 0; 
    } 
    public SquarePyramid(double l, double h) { 
        this.length = (l > 0) ? l : 0;
        this.height = (h > 0) ? h : 0;
    }
    public double getLength() { 
        return length;
}
    public double getHeight() {        
        return height;
    }
    public double getArea() {        
        return length * (length + Math.sqrt(length * length + 4 * height * height));
    }
    public double getVolume() {       
        return length * length * height / 3.0;
    } 
   
    public String toString() {        
        return "For this square pyramid the base has the length = " + this.length + " and the height = " + this.height;
    } 
  
    public boolean equals(Object obj) {        
        if (!(obj instanceof SquarePyramid)) return false;

        SquarePyramid other = (SquarePyramid) obj;

        return (
            super.equals(other) &&
            this.length == other.length &&
            this.height == other.height
        );
        
    } 
}