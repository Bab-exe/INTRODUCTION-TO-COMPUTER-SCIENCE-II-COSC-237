// Class Sphere. Implements Shape3D // Represents a perfect sphere.
public class Sphere implements Shape3D { 
    private double radius; 
  
    public Sphere() {    
        this.radius = 0;
    } 
  
    public Sphere(double r) { 
       this.radius = (r > 0) ? r : 0;
    }
    public double getRadius() { 
       return radius;
    }
    public double getArea() {        
        return 4 * Math.PI * Math.pow(radius, 2);
    }
    public double getVolume() { 
       return 4.0 * Math.PI * Math.pow(radius, 3) / 3.0;
    } 
  
    public String toString() {        

        return "The radius of this sphere = " + radius;
    } 
  
    public boolean equals(Object obj) {        
        if (!(obj instanceof Sphere)) return false;

        Sphere other = (Sphere) obj;

        return (super.equals(other) && this.radius == other.radius);
    } 
}