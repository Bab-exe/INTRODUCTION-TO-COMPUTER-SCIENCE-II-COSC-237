//b 
public class Cylinder extends Circle{
    private double height;

    public Cylinder(double x, double y, double radius, double height){
        super(x, y, radius);

        if (height < 0 ) throw new IllegalArgumentException("Height must be positive");
        this.height = height;
    }
    public Cylinder(){

        super();
        this.height = 0;
    }


    ///GET
    public double getHeight(){
        return height;
    }


    ///SET
    public void setHeight(double height){
        if (height < 0 ) throw new IllegalArgumentException("Height must be positive");
        this.height = height;
    }

    ///FUNCTIONS

    
    public void copy(Cylinder other){
        
        super.copy(other);
        
        this.height = other.height;

    }


    
    public double volume(){
        return super.area() * this.height;
    }

    
    /** 
     * 
     * Cylinder Area = 2πrh+2πr2 */
    @Override
    public double area(){
        return (super.area() * 2) + super.perimeter() * this.height;
    }

    public String toString(){
        return super.toString() + ";" + this.height;
    }


}
