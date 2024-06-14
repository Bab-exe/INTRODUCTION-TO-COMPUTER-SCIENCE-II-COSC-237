public class Square extends Figure{
    private double side = 0;

    public Square(){
        super(4);
        this.side = 0; 
    }
    public Square(double sides){
        super(4);

        this.side  = (sides >= 0) ? sides : 0;
    }
    

    ///set
    public void setSide(double side){
        this.side = (side >= 0) ? side : 0;
    }
    public void set(double sides){
        this.side = (sides >= 0) ? sides : 0;
    }

    ///get
    public double getSide(){
        return this.side;
    }

    ///abstract
    public double area(){
        return this.side * this.side;
    }
    public double perimeter(){
        return this.side * 4;
    }
    public void draw(){
        System.out.println("Drawing a square ");
    }

    //overrides
    @Override
    public String toString(){
        return super.toString() + ";" +this.side;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Square)) return false;
        
        Square other = (Square) obj;
        return super.equals(other) &&  this.side == other.side;
    }
}