public class PyramidClient {

    public static void main(String[] args) {
   
     Pyramid p1 = new Pyramid();
   
     Pyramid p2 = new Pyramid(5.2, 9.6, -76.23, 50, 20);
   
     p1.setLocation( 5.2, -7.1, 8.23 );
   
     p1.setSide(30);
   
     p1.setHeight(40);
   
     System.out.println(p1);
   
     System.out.println(p2.findSideLength());
   
     System.out.println(p2.perimeter());
   
     System.out.println(p2.area());   
   
     System.out.println(p2.volume());
   
     if ( p1.equals(p2) ) {
   
      System.out.println("Equal Pyramid");
   
     } else {
   
      System.out.println("NOT Equal Pyramid");
   
     }   
   
    }
   
   }