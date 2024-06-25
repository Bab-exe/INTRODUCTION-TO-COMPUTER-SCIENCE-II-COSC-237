// Class Cube, subclass of RectangularPrism // Represents a perfect cube.
public class Cube extends RectangularPrism { 
    public Cube() {        
        super();
    } 
  
    public Cube(double size) { 
        super(size, size, size);
    } 
  
    public String toString() {       
        return "For this cube all sides = " + super.getHeight();
    } 
}