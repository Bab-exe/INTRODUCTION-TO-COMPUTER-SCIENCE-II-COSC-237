public class CircularQueue {

    private final int SIZE;
    private int front,rear;

    private int[] list;

    public CircularQueue(){
        this(100);
    }
    public CircularQueue(int size){
        this.SIZE = (size > 0) ? size : 100;

        this.front = 0;

        this.rear = front + 1;
    }

    public boolean isEmptyQueue(){
        if (rear >= SIZE){
            rear = rear % SIZE;

            return true;
        }

        return false;
    }

    



}
