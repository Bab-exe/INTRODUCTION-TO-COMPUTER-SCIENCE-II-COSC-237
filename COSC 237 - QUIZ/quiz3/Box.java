

public class Box<T extends Comparable<T>>  implements Comparable<T> {
    private int size;
    private T item;

    //Default and alternate constructors
    public Box() {
        size = 0;
        item = null;
    }
    public Box(int _size, T _item) {
        size = (_size > 0) ? _size : 0;
        item = _item;
    }

    //Getters and setters
    public  T getItem() {
        return item;
    }
    public int getSize() {
        return size;
    }
    
    public void setItem(T _item){
        this.item = _item;
    }
    public void setSize(int _size){
        this.size = (_size > 0) ? _size : 0;
    }
    public void set(int _size, T _item){
        this.size = (_size > 0) ? _size : 0;
        this.item = _item;
    }

    //toString() and equals()
    @Override
    public String toString() {
        return "Size: " + size + " Item: " + item.toString();
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Box<?> == false) return false;
        Box<?> other = (Box<?>) obj;

        return (
            this.size == other.size &&
            this.item.equals(other.item)
        );
    }
    /**
        --- returns ---
        1 if this.size is greater than obj's size and this.item is greater than obj's item
        0 if this.size equals obj's size and this.item equals obj's item
        -1 otherwise
        */
    
    public int compareTo (Box<T> other) {
        if (equals(other)) return 0;

        return (this.size > other.size && this.item.compareTo((T) other.item) > 0)
            ? 1 
            : -1;
    }

    @Override
    public int compareTo(T obj) {
        

        return (obj instanceof Box<?>) ? compareTo(obj) : -1;


        
    }

    
}