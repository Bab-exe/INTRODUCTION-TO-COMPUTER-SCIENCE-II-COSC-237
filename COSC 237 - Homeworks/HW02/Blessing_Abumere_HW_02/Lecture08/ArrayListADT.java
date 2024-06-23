package Blessing_Abumere_HW_02.Lecture08;
public interface ArrayListADT<T> extends Cloneable {
    /**Method to determine whether the list is empty.*/
    public boolean isEmpty(); 
    
    /**Method to determine whether the list is full.*/
    public boolean isFull(); 

    /**Method to return the number of elements in the list.*/
    public int listSize(); 

    /**Method to return the maximum size of the list.*/
    public int maxListSize(); 

     /**Method to output the elements of the list.*/
    public void print();

    /** Returns a copy of objects data in store. Clones only
    the references, not the objects*/
    public Object clone(); 

    /**Method to determine
    whether item is the same as the item in the list at location. */
    public boolean isItemAtEqual(int location, T item); 

    /**Method to insert
    insertItem in the list at the position*/
    public void insertAt(int location, T insertItem); 

    /**Method to insert insertItem at the end of
    the list.*/
    public void insertEnd(T insertItem); 

    /**Method to remove the item from the list
    at location.*/
    public void removeAt(int location); 

    /**Method to retrieve the element from the
    list at location.*/
    public T retrieveAt(int location); 

    /**Method to replace the element
    in the list at location with repItem.*/
    public void replaceAt(int location, T repItem); 

    /**Method to remove all the elements from the list.*/
    public void clearList(); 

    /**Method to determine whether searchItem is in the list.*/
    public int search(T searchItem); 
    
    /**Method to remove an item from the list.*/
    public void remove(T removeItem); 
    }
    