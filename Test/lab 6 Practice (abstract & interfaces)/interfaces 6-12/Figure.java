public interface Figure {
    
    public double getArea();
    public double getPerimeter();

    public int getSideCount();

    @Override
    public boolean equals(Object obj);

    @Override
    public String toString();
}
