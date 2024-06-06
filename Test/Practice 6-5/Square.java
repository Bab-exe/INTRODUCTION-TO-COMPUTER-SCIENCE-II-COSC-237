public class Square{
    

    private double side;

    private double x,y,z;


    public Square(){

        this.side = 0;

        this.x = 0;
        this.y = 0;
        this.z = 0;
    }


    public Square(double side, double x, double y, double z){
        if (side < 0 ) throw new IllegalArgumentException("side must be positive");

        this.side = side;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    ///GET
    public double getSide(){
        return this.side;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public double getZ(){
        return this.z;
    }



    ///SET

    public void set(double side, double x, double y, double z){

        if (side < 0 ) throw new IllegalArgumentException("side must be positive");

        this.side = side;

        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void setSide(double side){
        if (side < 0 ) throw new IllegalArgumentException("side must be positive");
        this.side = side;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public void setZ(double z){
        this.z = z;
    }
   
    ///FUNCTIONS
    public void copy(Square s){
        this.side = s.side;

        this.x = s.x;
        this.y = s.y;
        this.z = s.z;
    }

    public Square getCopy(){

        return new Square(
            this.side,
            this.x,
            this.y,
            this.z
        );
    }

    @Override
    public boolean equals(Object obj){

        if(!(obj instanceof Square)) return false;

        Square s = (Square) obj;
        
        return (
            this.side == s.side &&
            this.x == s.x &&
            this.y == s.y &&
            this.z == s.z
        );
    }    


    /** perimeter = 4 * side */
    public double perimeter(){
        return 4 * this.side;
    }

    /** area = side * side */
    public double area(){
        return this.side * this.side;
    }



    @Override
    public String toString(){

        return "(" + this.x + "," + this.y + "," + this.z + ") " + this.side;

    }



}
