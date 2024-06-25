// Class CircularShape. Implements Shape3D. 
// ABSTRACT CLASS ­­> no objects of this type! // An abstract superclass for shapes with a circular cross­section.
public abstract class CircularShape implements Shape3D { 
    private double radius; 
  
    public CircularShape() { 
       this.radius = 0;
    } 
  
    public CircularShape(double r) { 
       this.radius = (r > 0) ? r : 0;
    } 
  
    public double getDiameter() {        
       return 2 * radius;
    }
    public double getRadius() { 
       return radius;
    } 
  
    public double getCrossSectionArea() { 
       return Math.PI * Math.pow(radius, 2); 
    } 
  
    public double getCrossSectionPerimeter() { 
       return 2 * Math.PI * radius; 
    } 

    public boolean equals(Object obj) { 
       if (!(obj instanceof CircularShape)) return false;
  
       CircularShape other = (CircularShape) obj;
  
       return (this.radius == other.radius && super.equals(other));
    }
}