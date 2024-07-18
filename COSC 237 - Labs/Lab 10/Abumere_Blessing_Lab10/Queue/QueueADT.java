package Queue;

//Interface: QueueADT
public interface QueueADT<T> {
    public void initializeQueue(); // Method to initialize the queue to an empty state.

    public boolean isEmptyQueue(); // Method to determine whether the queue is empty.

    public boolean isFullQueue(); // Method to determine whether the queue is full.

    public T front() throws QueueUnderflowException; // Method to return the first element of the queue.

    public T back() throws QueueUnderflowException; // Method to return the last element of the queue.

    public void enqueue(T newItem); // Method to add newItem to the queue.

    /** Method to remove the first element of the queue. */
    public void dequeue() throws QueueUnderflowException;

    public class QueueException extends RuntimeException {
        public QueueException(String msg) {
            super(msg);
        }
    }

    public class QueueUnderflowException extends QueueException {
        public QueueUnderflowException() {
            super("Queue Underflow");
        }
        public QueueUnderflowException(String msg){
            super(msg);
        }
    }
}
