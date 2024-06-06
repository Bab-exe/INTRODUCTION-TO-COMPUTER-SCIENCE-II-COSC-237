public class Box extends Rectangle{
    private double height;

    public Box(double width, double length, double height){
        super(width,length);
        if (height < 0) throw new IllegalArgumentException("Height Must Be Positive");
        
        this.height = height;
    }

    public Box(double height){
        super();
        
        if (height < 0) throw new IllegalArgumentException("Height Must Be Positive");
        this.height = height;
    }

    public Box(){
        super();
        
        if (height < 0) throw new IllegalArgumentException("Height Must Be Positive");
        this.height = 0;
    }
    
    public double getHeight(){ 
        return this.height;
    }
    public void setHeight(double h){
        if (h < 0) throw new IllegalArgumentException("Height Must Be Positive");
        this.height = h;
    }

    public double getLength(){ return super.getLength(); }
    public void setLength(double l){
        if (l < 0) throw new IllegalArgumentException("Length Must Be Positive");
        super.setLength(l);
    }

    public double getWidth(){ return super.getWidth(); }
    public void setWidth(double w){
        if (w < 0) throw new IllegalArgumentException("Width Must Be Positive");
        super.setWidth(w);
    }
    
    
    @Override
    public String toString(){
        return super.toString() + ";" + this.height;
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Box)) return false;
        Box other = (Box) obj;

        return 
            other.height == this.height 
            && other.getLength() == this.getLength() 
            && other.getWidth() == this.getWidth();
    }

    //functionalities 

    /** Volume = lwh */
    public double volume(){
        return super.area() * this.height;
    }

    @Override
    public double area(){
        return (2 * super.getLength()) + (2 * super.getWidth()) + (2 * this.height);
    }
    
    @Override
    public double perimeter(){
        return (2 * super.perimeter()) + (4 * this.height);
    }

    /** Surface Area = 2lw+2lh+2hw */
    public double surfaceArea(){
        return (2 * super.getLength()) + (2 * super.getWidth()) + (2 * this.height);
    }


}
