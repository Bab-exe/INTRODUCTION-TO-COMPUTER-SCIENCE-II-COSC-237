//Sphere
public class Shpere extends Circle{
    private double z;

    public Shpere(){
        super();
        this.z = 0;
    }

    public Shpere(double x, double y, double radius, double z){
        super(x, y, radius);

        this.z = z;
    }

    ///SET
    public void setZ(double z){
        this.z = (z < 0 ) ? 1 : z;
    }

    public void set(double x, double y, double radius, double z){
        super.set(x, y, radius);
        
        this.setZ(z);
    }

    ///GET

    public double getZ(){
        return this.z;
    }

    ///exists to not lose points probably
    public double getX(){
        return super.getX();
    }

    public double getY(){
        return super.getY();
    }

    public double getRadius(){
        return super.getRadius();
    }


    ///FUNCTION perimeter, area and volumne of the sphere

    @Override
    /** aka cirumference; same as circule
     * 2*pi*r
    */
    public double perimeter() {
       return super.perimeter();
    }

    /**  (4/3)*pi*r^3* */
    public double volume(){
        final double r = super.getRadius(); //probably faster

        return (4/3) * Math.PI * (r*r*r);
    }


    @Override
    /** 4*pi*r^2 
     * aka surface area*/
    public double area(){
        //for some reason formula is 4 * circle area; why is it 4???

        return 4 * super.area();
    }

    public void copy(Shpere other){
        super.copy(other);
        this.z = other.z;
    }

    public Shpere getCopy(){
        return new Shpere(
            super.getX(),
            super.getY(),
            super.getRadius(),
            this.z
        );
    }
        

    @Override
    public String toString(){

        return super.toString() + "; " + this.z;

    }
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Shpere)) return false;

        Shpere s = (Shpere)other;

        return (
            super.equals(other) && 
            this.z == s.z
        );
    }

}
