public class Queue {

     
    private int _front,_rear;

    final int _size;
    private int[] _list;

    public Queue(){
        this(100);
    }
    
    public Queue(int size){
        _size = size;
        _front = 0;
        _rear = -1;
        
        _list = new int[_size];
    }

    public boolean isFullQueue(){
        return (_rear >= _size-1);
    }
    
    public boolean isEmptyQueue(){
        return (_front >= _rear);
    }

    public void resetQueue(){
        _front = 0;
        _rear = -1;
    }

    public void enqueue(int data){
        if (isFullQueue()){
            System.err.println("Error: Queue is full");
            return;
        }

        _list[++_rear] = data;
    }

    public void enqueue(int ... items){
        for (int i = 0; i < items.length; i++){
            enqueue(items[i]);
        }
    }

    public void dequeue(){
        if (isEmptyQueue()){
            System.err.println("Error: Queue is empty");
        }
        
        if (++_front >= _size){
            System.err.println("Queue is full: Resetting Queue");
            resetQueue();
        }
        
    }
    //get
    public int get_Front() {
        return _front;
    }
    public int get_Rear() {
        return _rear;
    }

    //set
    public void set_Front(int front) {
        this._front = (front > 0) ? front : _front;
    }
    public void set_Rear(int rear){
        this._rear = (rear > 0) ? rear : _rear;
    }

    @Override
    public String toString(){
        String output = "size:\t" + _size;
        
        output += "\nfront:\t" + _front;
        output += "\nrear:\t" + _rear;

        output += "\nQueue: \n[";
        for (int i = _front; i < _rear-1;i++){
            output += _list[i] + ", ";
        }

        output+= _list[_rear-1] + "]";

        return output;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Queue){
            Queue other = (Queue) obj;

            for (int i = _front; i <= _rear;i++){
                if (_list[i] != other._list[i]) return false;
            }

        }
        return false;
    }





    



    
}