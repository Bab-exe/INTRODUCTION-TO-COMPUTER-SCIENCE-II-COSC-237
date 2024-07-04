public class QueueClient {
    public static void main(String[] args) {
        
        Queue q = new Queue(90);
        q.enqueue(5,3,-1,6,4,-3,9,7);

        

        
        System.out.println(q);


    }
}
