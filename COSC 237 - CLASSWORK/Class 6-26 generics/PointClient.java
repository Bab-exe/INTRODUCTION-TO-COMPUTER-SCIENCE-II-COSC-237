public class PointClient {
    public static void main(String[] args) {
        Point<Integer> p = new Point<>(1, 2);
        Point<Integer> q = new Point<>(10, 4);



        System.out.println(
            q.compareTo(q)
        );



    }
}
