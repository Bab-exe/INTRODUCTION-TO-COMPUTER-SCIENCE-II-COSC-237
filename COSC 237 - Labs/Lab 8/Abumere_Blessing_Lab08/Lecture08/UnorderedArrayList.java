package Lecture08;

//doesnt work on its own for some reason???
/**
 * Class: UnorderedArrayList extends
 * Class: ArrayListClass
 */
public class UnorderedArrayList<T> extends ArrayListClass<T> {
    // Default constructor
    public UnorderedArrayList() {
        super();
    }

    // Alternate Constructor
    public UnorderedArrayList(int size) {
        super(size);
    }

     /**
     * 1. A method named merge that concatenates 2 unordered lists into a third.
     * Assume
     * that list_1 and list_2 don't have any keys in common. The resulting list
     * should
     * be an unsorted list that contains all of the items from list_1 and list_2
     * (preserve the order).
     */
    
    /*replaces every integer of value k with k copies of itself */
    public void scaleByK(){
        
        if (listSize() == 0 || list[0] instanceof Integer == false) return;

        java.util.HashSet<Integer> unique = new java.util.HashSet<Integer>();

        for (int i = 0; i < listSize(); i++){
            unique.add((Integer)list[i]);
        }

        Integer[] temp = unique.toArray(new Integer[unique.size()]);
        clearList();

        for (int i = 0; i < temp.length;i++){
            for (int j = 0; j < temp[i]; j++){
                insertEnd((T)temp[i]);
            }
        }
        
        
    }
    

    public void merge(T[] list_1, T[] list_2) {
        for (int i =0 ;i < list_1.length; i++){
            insertEnd(list_1[i]);
        }

        for (int i =0 ;i < list_2.length; i++){
            insertEnd(list_2[i]);
        }        
    }

    public void merge(java.util.ArrayList<T> list_1, java.util.ArrayList<T> list_2) {
        this.merge((T[])list_1.toArray(), (T[])list_2.toArray());
    }



    
    /**
     * 2. A method named split that divides a list into 2 lists according to a key.
     * If list_1 and list_2 are the resulting lists, list_1 should contain all the items  of the original list whose keys are less than or equal to the key passed and list_2 should contain all the items of the original list whose keys are larger than the keypassed.
     */
    public <T extends Comparable<T>> void split(T key,java.util.ArrayList<T> list_1,java.util.ArrayList<T> list_2){ 
        
        list_1.clear();
        list_2.clear();
        
        

        for (int i = 0; i < length; i++){
            if (key.compareTo((T)list[i]) >= 0){
                list_1.add((T)list[i]);
            }else{
                list_2.add((T)list[i]);
            }
        }
        
    }

    

    
    
    /** Bubble Sort */
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

    // implementation for abstract methods defined in ArrayListClass
    // unordered list ­­> linear search
    public int search(T searchItem) {
        for (int i = 0; i < length; i++)
            if (list[i].equals(searchItem))
                return i;
        return -1;
    }

    public void insertAt(int location, T insertItem) {
        if (location < 0 || location >= maxSize)
            System.err.println("The position of the item to be inserted is out of range.");
        else if (length >= maxSize)
            System.err.println("Cannot insert in a full list.");
        else {
            for (int i = length; i > location; i--)
                list[i] = list[i - 1]; // shift right
            list[location] = insertItem;
            length++;
        }
    }

    public void insertEnd(T insertItem) {
        if (length >= maxSize)
            System.err.println("Cannot insert in a full list.");
        else {
            super.list[length] = insertItem;
            length++;
        }
    }

    public void replaceAt(int location, T repItem) {
        if (location < 0 || location >= length) {
            System.err.println("The location of the item to be replaced is out of range.");
        } else {
            list[location] = repItem;
        }
    }

    public void remove(T removeItem) {
        int i;
        if (length == 0) {
            System.err.println("Cannot delete from an empty list.");
        } else {
            i = search(removeItem);
            if (i != -1) {
                removeAt(i);
            } else {
                System.out.println("Cannot delete! The item to be deleted is not in the list.");
            }
        }
    }

    
   
}
