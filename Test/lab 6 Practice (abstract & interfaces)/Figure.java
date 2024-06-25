public abstract class Figure {

    private int sideCount = 0;

    public Figure(){
        sideCount = 0;
    }
    public Figure(int sideCount){
        this.sideCount = (sideCount > 0) ? sideCount : 0;
    }

    ///get
    public int getSideCount(){
        return this.sideCount;
    }
       

    ///set
    public void setSideCount(int sideCount){
        this.sideCount = (sideCount > 0) ? sideCount : 0;


    }

    ///function
    @Override
    public String toString(){ return ("" + (this.sideCount) ) ;}


    public boolean equals(Object object){
        if (object instanceof Figure){
            Figure other = (Figure) object;

            return this.sideCount == other.sideCount;
        }

        return false;

    }


    //abstract
    public abstract double area();

    public abstract double perimeter();

    public abstract void draw();
}