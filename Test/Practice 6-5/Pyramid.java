public class Pyramid extends Square{
    private double height;



    public Pyramid(){

        super(0,0,0,0);

        this.height = 1;
    }
    public Pyramid(double side, double x, double y, double z, double height){
        super(side, x, y, z);

        if(height < 0) throw new IllegalArgumentException("Height must be positive");
        
        this.height = height;
    }
    

    ////GET

    public double getHeight(){
        return this.height;
    }

    ////SET

    public void set(double side, double x, double y, double z, double height){
        super.set(side, x, y, z);

        if (height < 0) throw new IllegalArgumentException("Height must be positive");
        this.height = height;
    }
    public void setHeight(double height){
        if(height < 0) throw new IllegalArgumentException("Height must be positive");
        this.height = height;
    }

    /** sets (x,y,z) */
    public void setLocation(double x,double y ,double z){
        super.setX(x);
        super.setY(y);
        super.setZ(z);
    }


    ////FUNCTIONS

    /** perimeter = 4 * side ?? same as square */
    
    @Override
    /** a^2+2a * sqrt(a^2/4 + h^2*)
     * h  = height
     * a = side length */
    public double area(){
        final double a = this.getSide();
        final double h = this.height;

        return (a*a) + (2*a * Math.sqrt( ((a*a) / 4) + (h * h)));

    }

    /** A+(1/2)p*s
     * A = area
     * p = perimeter
     * s = side length
     */
    public double surfaceArea(){

        return super.area() + (4 * this.height);
    }

    
    /** volume = (side * side * height) / 3 */
    public double volume(){
        final double side = this.getSide();

        return (side * side * this.height) / 3;
    }

    /** sidelength = sqrt(a^2 + b^2) */
    public double findSideLength(){
        

        //a  = height

        final double a = this.height;
        final double b = (super.getSide() * Math.sqrt(2)) / 2;
        
        return Math.sqrt( (a * a) + (b * b));

    }

    public void copy(Pyramid p){

        super.copy(p);

        this.height = p.height;
    }

    public Pyramid getCopy(){

        return new Pyramid(
            this.getSide(),
            this.getX(),
            this.getY(),
            this.getZ(),
            this.height    
        );
    }
    
    @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof Pyramid)) return false;

        Pyramid p = (Pyramid) obj;

        return (
            super.equals(obj) &&
            this.height == p.height
        );
    }

    @Override
    public String toString(){
        return super.toString() + "; " + this.height;
    }
}
