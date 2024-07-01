package Lecture08;

/**
 * Class: ArrayListClass implements
 * Interface: ArrayListADT and Clonable
 */
public abstract class ArrayListClass<T> implements Lecture08.ArrayListADT<T>  {
    protected int length; // to store the length of the list
    protected int maxSize; // to store the maximum size of the list
    protected T[] list; // array to hold the list elements

   
    // Default constructor
    public ArrayListClass() {
        maxSize = 100;
        length = 0;

        list = (T[]) new Object[maxSize];
    }

    // Alternate Constructor
    public ArrayListClass(int size) {
        if (size <= 0) {
            System.err.println("The array size must be positive. Creating an array of size 100.");
            maxSize = 100;
        } else {
            maxSize = size;
        }
        length = 0;
        list = (T[]) new Object[maxSize];
    }

    public boolean isEmpty() {
        return (length == 0);
    }

    public boolean isFull() {
        return (length == maxSize);
    }

    public int listSize() {
        return length;
    }

    public int maxListSize() {
        return maxSize;
    }

    public void print() {
        for (int i = 0; i < length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public Object clone() {
        ArrayListClass<T> copy = null;
        try {
            copy = (ArrayListClass<T>) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
        copy.list = (T[]) list.clone();
        return copy;
    }

    public boolean isItemAtEqual(int location, T item) {
        if (location < 0 || location >= length) {
            System.err.println("The location of the item to be compared is out of range.");
            return false;
        }
        return (list[location].equals(item));
    }

    public void clearList() {
        for (int i = 0; i < length; i++) {
            list[i] = null;
        }
        length = 0;
        System.gc(); // invoke garbage collector
    }

    public void removeAt(int location) {
        if (location < 0 || location >= length) {
            System.err.println("The location of the item to be removed is out of range.");
        } else {
            for (int i = location; i < length - 1; i++) {
                list[i] = list[i + 1];
            }
            list[length - 1] = null;
            length--;
        }
    }

    public T retrieveAt(int location) {
        if (location < 0 || location >= length) {
            System.err.println("The location of the item to be retrieved is out of range.");
            return null;
        } else {
            return list[location];
        }
    }

    public abstract void insertAt(int location, T insertItem);

    public abstract void insertEnd(T insertItem);

    public abstract void replaceAt(int location, T repItem);

    public abstract int search(T searchItem);

    public abstract void remove(T removeItem);
}
