/** 1. Using an inheritance hierarchy, design a Java program to model 3­dimensional shapes (square
pyramid, sphere, rectangular prism, cube, cylinder, circular cone). Have a top level shape interface with
methods for getting the area and the volume (+ methods toString and equals). Next, build classes and
subclasses for the above 3­dimensional shapes. Make sure that you place common behavior in
superclasses whenever possible. Also, use abstract classes as appropriate. Add methods to subclasses to
represent unique behavior particular to each 3­dimensional shape.
Write the definitions of these classes and do the testing with the client program provided. */
public interface Shape3D {
    public double getArea();
    public double getVolume();
    @Override
    public String toString();
    @Override
    public boolean equals(Object obj);

}
    