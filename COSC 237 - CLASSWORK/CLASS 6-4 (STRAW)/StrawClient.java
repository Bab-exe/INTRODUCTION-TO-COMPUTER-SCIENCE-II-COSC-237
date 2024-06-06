public class StrawClient {
    
    public static void main(String[] args) {
                
        Straw s1 = new Straw(3.1, 5.2, 7.5, 2, "Gold");

        Straw s2 = new Straw(2.5, 3.2, 4, 1, "Black");

        System.out.println( s1 );

        s2.setColor("Gold");

        s2.setHeight( 10 );

        System.out.println("-----------------");

        System.out.println( s2 );

        System.out.println( s2.volume() );

        System.out.println( s2.area() );

        System.out.println( s2.perimeter() );

        if ( s1.equals( s2 ) ) {

        System.out.println( "Equals Straw" );

        } else {

        System.out.println( "NOT Equals Straw" );

        }

 }
    
}
