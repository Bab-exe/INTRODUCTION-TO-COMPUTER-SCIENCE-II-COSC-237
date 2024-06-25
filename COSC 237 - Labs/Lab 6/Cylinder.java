// Class Cylinder, subclass of CircularShapeWithHeight // Represents a cylinder shape.
public class Cylinder extends CircularShapeWithHeight { 
    public Cylinder() {        
        super();
    } 
  
    public Cylinder(double radius, double height) { 
        super(radius, height);
    }
    public double getArea() { 
       return getCrossSectionPerimeter() * getHeight() + 2 * getCrossSectionArea();     
    }
    public double getVolume() { 
       return getCrossSectionArea() * getHeight(); 
    } 
  
    public String toString() { 
       return "For this cylinder the radius = " + super.getRadius() + " and the height = " + super.getHeight();
    } 
  
    public boolean equals(Object obj) { 
       if (!(obj instanceof Cylinder)) return false;
       
       Cylinder other = (Cylinder) obj;
       
       return (super.equals(other));
    } 
}