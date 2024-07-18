package LinkedList;


abstract class LinkedListClass<T> implements LinkedListADT<T>{
    protected LinkedListNode<T> first,last;
    private int count;
    
    public LinkedListClass(){
        this.first = null;
        this.last = null;
        this.count = 0;
       
    }
    
    public void copy(LinkedListClass<T> other){
        initializeList();

        for (LinkedListNode<T> current = other.first; current != null; current = current.link){
            this.insertLast(current.info);
        }
    }

    // for lab 13 */
    abstract public boolean linearSearch(T query);
    abstract public boolean binarySearch(T query);
    abstract public void bubbleSort();
    abstract public void selectionSort();
    


    @Override
    abstract public String toString();

    /**clear */
    public void initializeList() {
        this.first = null;
        this.last = null;
        this.count = 0;
        System.gc();
    }

    //get
    public T front(){
        return this.first.info;
    }
    public T back(){
        return this.last.info;
    }
    public int length(){
        return this.count;
    }
    public boolean isEmptyList(){
        return (this.first == null && count == 0);
    }

    /** true only if found  */
    public boolean search(T query){
        for (LinkedListNode<T> current = this.first; current != null; current = current.link){
            if (current.info == query) return true;
        }
        return false;
    }

    public void print(){
        System.out.println(toString());
    }
    
    public void insertLast(T info){
        final LinkedListNode<T> node = new LinkedListNode<T>(info);
        if (this.first == null){
            this.first = node;
            this.last = node;
        }
        else {
            this.last.link = node;
            this.last = node;
        }
        count++;
    }
    public void insertLast(T ... mass_info){
        for (T info: mass_info){
            this.insertLast(info);
        }
    }

    public void insertFirst(T info){
        final LinkedListNode<T> node = new LinkedListNode<T>(info);
        if (this.first == null){
            this.first = node;
            this.last = node;
        }else{
            node.link = this.first;
            this.first = node;
        }
        count++;
    }

    /** deletes 1 LinkedListNode that has {@code info} */
    public void deleteNode(final T info){
        if (isEmptyList()) return;
        //special cases
        if (this.first.info.equals(info)){
            this.first = this.first.link;
            count--;
            
        }

        for(LinkedListNode<T> previous = this.first,current = previous.link; current != null;previous = current,current = current.link){
            if (current.info.equals(current)) {
                if (current == this.last){
                    previous.link = null;
                    this.last = previous;
                }else{
                    previous.link = current.link;
                }
                
                count--;
                
            }   
        }
        
    }

    

    @Override
    public boolean equals(Object obj){
        if(obj instanceof LinkedListClass == false) return false;

        LinkedListClass<T> other = (LinkedListClass<T>) obj;

        if (other.count != this.count) return false;

        LinkedListNode<T> current1 = this.first;
        LinkedListNode<T> current2 = other.first;

        while(current1 != null){
            if(current1.equals(current2) == false) return false;
            current1 = current1.link;
            current2 = current2.link;
        }
        
        return true;
    }
   
    
    
}
