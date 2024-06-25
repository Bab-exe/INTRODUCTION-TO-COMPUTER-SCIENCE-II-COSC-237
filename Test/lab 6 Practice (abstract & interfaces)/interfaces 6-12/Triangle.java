public class Triangle implements Figure{

    private double a,b,c;

    public Triangle() {
        

        a = 1;
        b = 1;
        c = 1;
    }

    public Triangle(double a,double b, double c) {
        

        this.a = (a >= 0) ? a : 0;
        this.b = (b >= 0) ? b : 0;
        this.c = (c >= 0) ? c : 0;
    }

    ///sets
    public void set(double a, double b,double c){

        this.a = (a >= 0) ? a : 0;
        this.b = (b >= 0) ? b : 0;
        this.c = (c >= 0) ? c : 0;
    }
    public void setA(double a){
        this.a = (a >= 0) ? a : 0;
    }
    public void setB(double b){
        this.b = (b >= 0) ? b : 0;
    }
    public void setC(double c){
        this.c = (c >= 0) ? c : 0;
    }


    ///gets
    public int getSideCount(){

        return 3;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }


    //override
    @Override
    public String toString(){

        return  this.a + ";" + this.b + ";" + this.c;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Triangle)) return false;

        Triangle other = (Triangle) obj;

        return ( 
            this.a == other.a &&
            this.b == other.b &&
            this.c == other.c
        );
    }

    //abstract / required 
    public double getArea(){

        final double S = this.getPerimeter() / 2;

        return Math.sqrt(
            S * (S - this.a) * (S - this.b) * (S - this.c)
        );
    }

    public double getPerimeter(){
        return this.a + this.b + this.c;
    }

    



    
}
