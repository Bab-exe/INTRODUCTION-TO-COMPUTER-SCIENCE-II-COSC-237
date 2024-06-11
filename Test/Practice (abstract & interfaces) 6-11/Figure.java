public abstract class Figure {

    private int sideCount;

    public Figure(){

    }
    public Figure(int sideCount){

    }

    ///get
    public int getSideCount(){ return sideCount;}

    ///set
    public abstract void setSideCount(int sideCount);

    ///function
    @Override
    public String toString(){ return this.sideCount + " sides";}


    public boolean equals(Object object){

        if (object instanceof Figure){
            Figure other = (Figure) object;
            return this.sideCount == other.sideCount;
    }




}