/** 4 sides 
 * 8 on top
 * 4 on bottom 
 * = 12
 * 
 */

public class Cube extends Square{
    //default
    public Cube(){
        super(); //edge
        super.setSideCount(12);        
    }

    public Cube(double edge){
        super(edge);
        super.setSideCount(12);

        
    }

   
    public void set(double edge){
        super.setSide(edge);
        
    }
    


    /** volume= sides^3 */
    public double volume(){
        final double EDGE = super.getSide();

        return (EDGE * EDGE * EDGE);
    }

    //override
    @Override
    public String toString(){
        return super.toString() + ";CUBE";
    }

    public boolean equals(Object obj){

        if (!(obj instanceof Cube)) return false;

        Cube other = (Cube) obj;

        return (
            super.equals(other) &&  
            this.getSide() == other.getSide()
            );
    }

    //abstract
    public void draw(){
        System.out.println("Drawing a cube");
    }

     /** surface area = 6a^2 ; where a is edge*/
     public double area(){
        final double EDGE = super.getSide();
        return 6 * (EDGE * EDGE);
    }

    /** perimeter = 12a; where a is edge */
    public double perimeter(){

        return 12 * (super.getSide());
    }
}
