package Part2;

abstract class LinkedListIntClass implements ILinkedListIntADT{
    protected LinkedListNode first,last;
    private int count;
    
    public LinkedListIntClass(){
        this.first = null;
        this.last = null;
        this.count = 0;
       
    }
    
    public void copy(LinkedListIntClass other){
        initializeList();

        for (LinkedListNode current = other.first; current != null; current = current.link){
            this.insertLast(current.info);
        }


    }

    /** returns the smallest of all the data values in a list */
    abstract public int findMin();

    /** returns the sum of all the data values in a list */
    abstract public int findSum();

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
    public int front(){
        return this.first.info;
    }
    public int back(){
        return this.last.info;
    }
    public int length(){
        return this.count;
    }
    public boolean isEmptyList(){
        return (this.first == null && count == 0);
    }

    /** true only if found  */
    public boolean search(int query){
        for (LinkedListNode current = this.first; current != null; current = current.link){
            if (current.info == query) return true;
        }
        return false;
    }

    public void print(){
        System.out.println(toString());
    }
    
    public void insertLast(int info){
        final LinkedListNode node = new LinkedListNode(info);
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
    public void insertLast(int ... mass_info){
        for (int info: mass_info){
            this.insertLast(info);
        }
    }

    public void insertFirst(int info){
        final LinkedListNode node = new LinkedListNode(info);
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
    public boolean deleteNode(final int info){
        if (isEmptyList()) return false;
        //special cases
        if (this.first.info == info){
            this.first = this.first.link;
            count--;
            return true;
        }

        for(LinkedListNode previous = this.first,current = previous.link; current != null;previous = current,current = current.link){
            if (current.info == info) {
                if (current == this.last){
                    previous.link = null;
                    this.last = previous;
                }else{
                    previous.link = current.link;
                }
                
                count--;
                return true;
            }   
        }
        return false;
    }

    /** deletes all LinkedListNodes that contain {@code info} */
    public boolean deleteAll(final int info){
        if (deleteNode(info) == false) return false;

        while(deleteNode(info));

        System.gc();

        return true;


    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof LinkedListIntClass == false) return false;

        LinkedListIntClass other = (LinkedListIntClass) obj;

        if (other.count != this.count) return false;

        LinkedListNode current1 = this.first;
        LinkedListNode current2 = other.first;

        while(current1 != null){
            if(current1.equals(current2) == false) return false;
            current1 = current1.link;
            current2 = current2.link;
        }
        
        return true;
    }
   
    
    
}
