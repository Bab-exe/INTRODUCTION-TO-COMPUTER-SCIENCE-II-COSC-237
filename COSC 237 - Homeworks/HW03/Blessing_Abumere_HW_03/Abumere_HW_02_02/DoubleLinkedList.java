package Abumere_HW_02_02;

public class DoubleLinkedList<T> implements IDoubleLinkedListADT<T> {
    protected int count = 0; //number of nodes
    protected DoubleLinkedListNode<T> first,last; //reference to first and last node
    
    public DoubleLinkedList() {
        first = null;
        last = null;
        count = 0;
    }

    public void initializeList() {
        first = null;
        last = null;
        count = 0;
    }

    /** true only if count <= 0 */
    public boolean isEmptyList() {
        return (count <= 0);
    }


    /// getters
    public T front() {
        return first.info;
    }
    public T back() {
        return last.info;     
    }
    public int length() {
        return count;     
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'print'");
    }

    
    public void reversePrint() {
        System.out.println(backwardsString());
    }

    
    public boolean search(T searchItem) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'search'");
    }

    /**insert new item in constant time */
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

    
    public boolean deleteNode(T deleteItem) {
        if (isEmptyList()) return false;
        
        for (DoubleLinkedListNode<T> current = this.first ; current != null ; current = current.next){
            if (current.info.equals(deleteItem)){
                
                
                if(current == this.first){
                    this.first = current.next;
                    this.first.back = null;
                }
                else if (current == this.last){
                    this.last = current.back;
                    this.last.next = null;
                    
                }
                else{
                    //normal
                    current.back.next = current.next;
                    current.next.back = current.back;
                }
                
                count--;
                System.gc();
                return true;
            }
        }
            
        

        return false;
    }

    @Override
    public String recursiveToString() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'recursiveToString'");
    }

    @Override
    /*** backwards tostring */
    public String backwardsString() {
        String result = this.last.toString();

        for (DoubleLinkedListNode<T> current = this.last.back ; current != null ; current = current.back){
            result += " -> " + current.toString();
        }

        return result;

    }

    @Override
    public String recursiveBackwardsString() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'recursiveBackwardsString'");
    }

    
    @Override
    public void copy(DoubleLinkedList<T> otherList) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'copy'");
    }

    @Override
    public void reversedCopy(DoubleLinkedList<T> otherList) {
        this.first = null;
        this.last = null;

        for (DoubleLinkedListNode<T> current = otherList.last ; current != null ; current = current.back){
            insertNode(current.info);
        }

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

            DoubleLinkedListNode<?> other = (DoubleLinkedListNode<?>) obj;
            return (
                this.info.equals(other.info) &&
                this.next == other.next && 
                this.back == other.back
            );
        }
    }

}
    