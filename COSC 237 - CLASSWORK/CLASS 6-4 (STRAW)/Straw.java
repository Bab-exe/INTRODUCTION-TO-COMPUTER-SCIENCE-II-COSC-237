//c

public class Straw extends Cylinder{
    private String colour;
    
    private int material;

    public Straw(double x, double y, double radius, double height, String colour, int material){
        super(x, y, radius, height);

        this.colour = colour;
        this.material = material;
    }

    public Straw(double x,double y,double radius,double height,String colour){
        super(
            x, 
            y, 
            radius,
            height
        );
        this.colour = colour;
        
    }

    public Straw(Cylinder c,String col,int mat){
        super(
            c.getX(),
            c.getY(),
            c.getRadius(),
            c.getHeight()
        );

        this.colour = col;
        this.material = mat;
    }

    ///GET
    public String getcolour(){
        return this.colour;
    }

    public int getMaterial(){
        return this.material;
    }

    ///SET
    public void setColor(String colour){
        this.colour = colour;
    }

    public void setMaterial(int material){
        this.material = material;
    }


    ///FUNCTIONs 

    
    public void copy(Straw tocopy){
        
        super.copy(tocopy);
        this.colour = tocopy.colour;
        this.material = tocopy.material;
    }

    public Straw getCopy(){
        return new Straw(
            super.getCopy(),
            this.colour,
            this.material
        );
    }

    @Override
    public String toString(){

        return super.toString() + ";" + this.colour + ";" + this.material;
    }




}
