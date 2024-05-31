public class Fraction {
    private double top, bottom;

    public Fraction(double top, double bot){
        this.setBottom(bot);

        this.setTop(top);
    }
    public Fraction(){
        this(0, 1);
    }

   


    public void setTop(double top){
        this.top = top;
    }
    public double getTop(){
        return this.top;
    }


    public void setBottom(double bottom){
        if (bottom == 0) throw new IllegalArgumentException("Bottom cannot be zero");

        this.bottom = bottom;
    }
    public double getBottom(){  return this.bottom; }


    public boolean equals(Fraction f){
        
        return this.top == f.getTop() && this.bottom == f.getBottom();
    }

    public String toString(){
        return this.top + "\n/\n" + this.bottom;
    }

    public void add(Fraction f){
        this.top = this.top * f.getBottom() + f.getTop() * this.bottom;
        this.bottom = this.bottom * f.getBottom();
    }

    public void subtract(Fraction f){
        this.top = this.top * f.getBottom() - f.getTop() * this.bottom;
        this.bottom = this.bottom * f.getBottom();
    }

    public void multiply(Fraction f){
        this.top = this.top * f.getTop();
        this.bottom = this.bottom * f.getBottom();
    }

    public boolean divide(Fraction f){

        if (f.getTop() == 0) {return false; }

        this.top = this.top * f.getBottom();
        this.bottom = this.bottom * f.getTop();

        return true;

         
    }



    public int gcd(int a, int b){
        if (b == 0) return a;
        return gcd(b, a % b);
    }


    public void simplify(){
        int gcd = gcd((int)this.top, (int)this.bottom);
        this.top /= gcd;
        this.bottom /= gcd;
    }

    public void flip(){
        
        double old_bottom = this.bottom;

        if (this.top == 0) throw new DenominatorException("Bottom Cant Be Zero");
        this.bottom = this.top;
        
        this.top = old_bottom;

    }


    public void copy(Fraction other){
        this.top = other.top;
        this.bottom = other.bottom;

    }

    public Fraction getCopy(){ return new Fraction(this.top,this.bottom);}

    private class DenominatorException extends IllegalArgumentException{


        public DenominatorException(String msg){
            super(msg);
        }
    }
}


