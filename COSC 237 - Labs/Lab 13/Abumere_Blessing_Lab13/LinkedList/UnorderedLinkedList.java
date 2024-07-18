package LinkedList;

public class UnorderedLinkedList<T> extends LinkedListClass<T> {

    public UnorderedLinkedList() {
        super();
    }

    
    @Override
    public UnorderedLinkedList<T> clone() {
        UnorderedLinkedList<T> clone = new UnorderedLinkedList<T>();
            clone.copy(this);
        return clone;
    }
    

    // for lab 13

    /** linear search */
    public boolean linearSearch(final T query) {
        for (LinkedListNode<T> current = super.first; current != null; current = current.link) {
            if (query.equals(current.info))
                return true;
        }
        return false;
    }

    /**QUESTION 2
     * to implement binary search I would need to have the middle of the LinkedList and then I would either go to the right of the middle or left depending on if the query is bigger or smaller and it would have to be sorted */

     /** binary search */
    public boolean binarySearch(final T query) {
        bubbleSort(); //only works if sorted
        
        LinkedListNode<T> middle,current;
            middle = getMiddle();

        Comparable<T> _info = (Comparable<T>) middle.info;
        if (_info.compareTo(query) <= 0){
            for (current = middle; current != null; current = current.link)
                if (query.equals(current.info)) return true;
        }else {
            for (current = super.first; current != middle; current = current.link)
                if (query.equals(current.info)) return true;
        }

        return false;
    }

    /** exists for binary search */
    private LinkedListNode<T> getMiddle(){

        LinkedListNode<T> current = super.first;
        for (int i = 0; i < super.length()/2; i++)
            current = current.link;
        

        return current;
    }
    


    /* inspiration
    public void bubbleSort() {
        for (int pass = 0; pass < length - 1; pass++) {
            for (int i = 0; i < length - 1; i++) {
                Comparable<T> listElem = (Comparable<T>) list[i];
                if (listElem.compareTo(list[i + 1]) > 0) {
                    T temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
        }
    }
    */
    /** bbuble sort */
    public void bubbleSort(){
        if (isEmptyList()) return;

        Comparable<T> _info;
        T temp;
        LinkedListNode<T> pass,i;

        for (pass = super.first; pass.link != null; pass = pass.link){
            for (i = super.first; i.link != null; i = i.link){
                _info = (Comparable<T>) i.info;
                if (_info.compareTo(i.link.info) > 0){
                    temp = i.info;
                    i.info = i.link.info;
                    i.link.info = temp;
                }
            }
        }
        
        
    }

    /**selection sort */
    public void selectionSort(){
        if (isEmptyList()) return;

        LinkedListNode<T> current, mininum,next;
        T temp;
        Comparable<T> _info;

        for (current = super.first; current.link != null; current = current.link){
            mininum = current;
            for (next = current.link; next != null; next = next.link){
                _info = (Comparable<T>) next.info;
                if (_info.compareTo(mininum.info) < 0)
                    mininum = next;
                
            }
            temp = current.info;
            current.info = mininum.info;
            mininum.info = temp;
        }
    }

    @Override
    public String toString() {

        if (super.first == null)
            return null;

        String output = "";

        for (LinkedListNode<T> current = super.first; current.link != null; current = current.link) {
            output += current.info + " ";
        }

        return output + super.last.info;
    }

    //equals in inhrerited class
}
