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
        this.height = 1;
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
    @Override
    public boolean equals(Object o){

        if (!(o instanceof Cylinder)) return false;

        Cylinder other = (Cylinder) o;

        return 
            super.equals(other) && 
            this.height == other.height;
    }
    
    
    public void copy(Cylinder other){
        
        super.copy(other);
        
        this.height = other.height;

    }

    public Cylinder getCopy(){
        return new Cylinder(
                        this.getX(), 
                        this.getY(), 
                        this.getRadius(), 
                        this.height
                    );
    }

    
    /** Cylinder Volume = π(r^2)h */
    public double volume(){
        final double r = this.getRadius();

        return Math.PI * (r * r) * this.height; 
    }

    @Override
    /** Cylinder Perimeter = 2(2r + h) */
    public double perimeter(){
        return 2 * ((2* this.getRadius()) + this.height);
    }
    
    @Override
    /** Cylinder Area/Surface Area = 2πrh+2πr^2 */
    public double area(){
        final double r = this.getRadius();
        
        return (2 * Math.PI * r * this.height) + (2 * Math.PI * (r * r));
    }
        

    @Override
    public String toString(){
        return super.toString() + ";" + this.height;
    }


}
