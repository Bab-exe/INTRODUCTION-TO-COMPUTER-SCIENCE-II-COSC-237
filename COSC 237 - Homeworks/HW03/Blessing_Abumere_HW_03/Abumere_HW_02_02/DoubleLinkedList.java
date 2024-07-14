package Abumere_HW_02_02;



public class DoubleLinkedList<T> implements IDoubleLinkedListADT<T> {
    protected int count; //number of nodes
    protected DoubleLinkedListNode<T> first,last; //reference to first and last node
    
    public DoubleLinkedList() {
        first = null;
        last = null;
        count = 0;
    }

    /** clear list */
    public void initializeList() {
        first = null;
        last = null;
        count = 0;

        System.gc();
    }

    /** true only if count equal to or for some reason less than 0 */
    public boolean isEmptyList() {
        return (count <= 0);
    }


    /// get
    public T front() {
        return first.info;
    }
    public T back() {
        return last.info;     
    }
    public int length() {
        return count;     
    }

    public void print() {
        System.out.println(toString());
    }

    public void reversePrint() {
        System.out.println(backwardsString());
    }

    public DoubleLinkedListNode<T> search(T searchItem) {
        if (isEmptyList() || searchItem == null) return null;

        for (DoubleLinkedListNode<T> current = this.first ; current != null ; current = current.next){
            if (current.info.equals(searchItem))
                return current;
            
        }
        return null;
    }

    /**inserts new item */
    public void insertNode(T insertItem) {
        DoubleLinkedListNode<T> node = new DoubleLinkedListNode<T>(insertItem);
        if (this.first == null){
            this.first = node;
            this.last = (node.next == null) ? node : node.next; 
        }else{

            node.back = this.last;
            this.last.next = node;

            this.last = node;
        }

        count++;
    }

    /** true if success false otherwise */
    public boolean deleteNode(T deleteItem) {
        
        DoubleLinkedListNode<T> deleteNode = search(deleteItem); 
            if (deleteNode == null) return false;
            
        if(this.first == deleteNode){
            this.first = this.first.next;

            if (this.first != null) 
                this.first.back = null;
        }
        else if (this.last == deleteNode){
            this.last = this.last.back;

            if (this.last != null)
                this.last.next = null;
        }        
        else{
            deleteNode.back.next = deleteNode.next;
            deleteNode.next.back = deleteNode.back;
        }

        count--;

        System.gc();
        return true;   
    }

     /** toString but made much worse*/
    public String recursiveToString() {
        return recursiveToString(this.first);
    }

    /** exists to make the real method work */
    private String recursiveToString(DoubleLinkedListNode<T> node) {
        if (node == null) return null;
       
        return (node.next == null)
        ? node.toString()
        : node.toString() + " -> " + recursiveToString(node.next);
    }

    /**toString but backwards (last -> ... -> front*/
    public String backwardsString() {
        if (isEmptyList()) return null;
        String result = this.last.toString();

        for (DoubleLinkedListNode<T> current = this.last.back ; current != null ; current = current.back){
            result += " -> " + current.toString();
        }

        return result;

    }

    /** backwardstoString but made worse */
    public String recursiveBackwardsString() {
        return recursiveBackwardsString(this.last);
    }

    /** exists to make the real method work */
    private String recursiveBackwardsString(DoubleLinkedListNode<T> node) {
        if (node == null) return null;
       
        return (
            (node.back == null)
            ? node.toString()
            : node.toString() + " -> " + recursiveBackwardsString(node.back)
        );
        
    }

    
    
    public void copy(DoubleLinkedList<T> otherList) {
        initializeList();

        for (DoubleLinkedListNode<T> current = otherList.first ; current != null ; current = current.next){
            insertNode(current.info);
        }

    }

    
    public void reversedCopy(DoubleLinkedList<T> otherList) {
        initializeList();

        for (DoubleLinkedListNode<T> current = otherList.last ; current != null ; current = current.back){
            insertNode(current.info);
        }
    }

    
    /** (front -> ... -> back) */
    @Override public String toString(){
        if (isEmptyList()) return null;

        String result = this.first.toString();

        for (DoubleLinkedListNode<T> current = this.first.next ; current != null ; current = current.next){
            result += " -> " + current.toString();
        }

        return result;
    }

    @Override public boolean equals(Object obj){
        if (obj instanceof DoubleLinkedList == false) return false;

        DoubleLinkedList<T> other = (DoubleLinkedList<T>) obj;

        final boolean NOT_NULL = (
            this.first != null && other.first != null &&
            this.last != null && other.last != null
        );

        return (
            NOT_NULL && 
            this.first.equals(other.first) &&
            this.last.equals(other.last) &&
            this.count == other.count
        );
    }
 
    //Double linked list node class
    public class DoubleLinkedListNode<T> {
        T info;
        DoubleLinkedListNode<T> next,back;
        
        public DoubleLinkedListNode() {
            info = null;
            next = null;
            back = null;
        }
        public DoubleLinkedListNode(T elem) {
            info = elem;
            next = null;
            back = null;
        }

        @Override
        public String toString() {
            return info.toString();
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DoubleLinkedListNode == false) return false;
        
            DoubleLinkedListNode<T> other = (DoubleLinkedListNode<T>) obj;
            
            return (
                this.info.equals(other.info) &&
                this.next == other.next && 
                this.back == other.back
            );
        }
    
    }

}
    