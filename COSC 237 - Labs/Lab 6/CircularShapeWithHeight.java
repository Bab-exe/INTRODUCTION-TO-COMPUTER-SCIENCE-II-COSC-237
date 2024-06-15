// Class CircularShapeWithHeight. Subclass of CircularShape 
// ABSTRACT CLASS ­­> no objects of this type! // An abstract superclass for shapes with a circular cross­section that extends over some height.
public abstract class CircularShapeWithHeight extends CircularShape { 
    private double height;
    public CircularShapeWithHeight() { 
        height = 0;
    } 
    public CircularShapeWithHeight(double radius, double height) { 
        super(radius);
        this.height = (height > 0) ? height : 0;
    }
    public double getHeight() { 
        return height;
    } 

    public String toString(){
        return this.height + ";";
    }
    public boolean equals(Object obj) { 
        if (!(obj instanceof CircularShapeWithHeight)) return false;
        
        CircularShapeWithHeight other = (CircularShapeWithHeight) obj;
        return (super.equals(other) && this.height == other.height);
    }

    
    
}