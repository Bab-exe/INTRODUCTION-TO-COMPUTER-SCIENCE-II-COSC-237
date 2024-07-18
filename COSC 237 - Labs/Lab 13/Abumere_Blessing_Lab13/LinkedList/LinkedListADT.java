package LinkedList;

//Interface: LinkedListADT
public interface LinkedListADT<T> {
    public boolean isEmptyList();
    public void initializeList();
    public void print();
    public int length();
    public T front();
    public T back();
    public boolean search(T searchItem);
    public void insertFirst(T newItem);
    public void insertLast(T newItem);
    public void deleteNode(T deleteItem);
}