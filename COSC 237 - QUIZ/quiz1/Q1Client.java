public class Q1Client {
  public static void main(String[] args) {
  System.out.println("Testing Circle");
    Circle c1 = new Circle();
    Circle c2 = new Circle(2.5, -3.1, 3);
    c1.set(2.5, -3.1, 5);
    System.out.println(c1);
    System.out.println(c2);
    System.out.println("c1 == c2 : " + c1.equals(c2) );
    System.out.println(c1.perimeter());
    System.out.println(c2.perimeter());
    System.out.println(c1.area());
    System.out.println(c2.area());
    
    System.out.println("Testing Shpere");
    Shpere s1 = new Shpere();
    Shpere s2 = new Shpere(-3.2, 7.6, 2.1, 5);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println("s1 == s2 : " + s1.equals(s2) );    
  }
}