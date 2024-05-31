public class Point2DClient {
    


    public static void main (String[] args){


        Point2D p1 = new Point2D();


        Point2D p2 = new Point2D(3.5, -7.2);

        p1.add( p2 );

        p2.sub ( p1 );

        double dist = p1.distance( p2 );

        Point2D p3 = p1.getCopy();

        p1.copy( p2);


        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
