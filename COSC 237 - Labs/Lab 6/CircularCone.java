// Class CircularCone, subclass of CircularShapeWithHeight // Represents cones with a circular base.
public class CircularCone extends CircularShapeWithHeight { 
    public CircularCone() { 
      super();
    } 
  
   public CircularCone(double radius, double height) { 
      super(radius, height);
      
   }
    public double getArea() {        
      final double r = getRadius();
      final double h = getHeight();
      return Math.PI * r * Math.sqrt(r * r + h * h); 
    }
    public double getVolume() { 
       return getCrossSectionArea() * getHeight() / 3.0; 
    } 
  
    public String toString() { 
       return "For this circular cone the radius = " + super.getRadius() + " and the height = " + super.getHeight();
    } 
  
   public boolean equals(Object obj) { 
      if (!(obj instanceof CircularCone)) return false;
      
      CircularCone other = (CircularCone) obj;
      
      return (super.equals(other));
   
   } 
}