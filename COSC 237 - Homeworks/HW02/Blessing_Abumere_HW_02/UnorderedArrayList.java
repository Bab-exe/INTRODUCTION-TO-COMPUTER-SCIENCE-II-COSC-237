package Blessing_Abumere_HW_02.Abumere_HW_02_02;


import Blessing_Abumere_HW_02.Lecture08.*;

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
    public T[] merge(T[] list_1, T[] list_2) {
        T[] list_3 = (T[])new Object[list_1.length + list_2.length];
 
        for (int i = 0; i < list_1.length; i++){
            list_3[i] = list_1[i];
        }

        int l3 = list_1.length; //list 3 index
        for (int i = 0; i< list_2.length; i++,l3++){
            list_3[l3] = list_2[i];
        }
        
        return (list_3);
    }

    /**
     * 2. A method named split that divides a list into 2 lists according to a key.
     * If list_1 and list_2 are the resulting lists, list_1 should contain all the items  of the original list whose keys are less than or equal to the key passed and list_2 should contain all the items of the original list whose keys are larger than the keypassed.
     */
    public void split(T[] list, T key) {
        T[] list_1 = (T[])new Object[list.length];
        T[] list_2 = (T[])new Object[list.length];

        int l1 = 0,l2 = 0;
        for (int i = 0; i < list.length; i++){
            Comparable<T> value = (Comparable<T>) list[i];

            if (value.compareTo(key) <= 0){
                list_1[l1] = list[i];
                l1++;
            }
            else{
                list_2[l2] = list[i];
                l2++;
            }
        }
        
    }
   
    // Bubble Sort
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
            list[length] = insertItem;
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
