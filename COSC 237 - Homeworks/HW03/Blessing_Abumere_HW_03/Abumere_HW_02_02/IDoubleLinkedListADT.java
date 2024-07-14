package Abumere_HW_02_02;

public interface IDoubleLinkedListADT<T> {
    public void initializeList();
    public boolean isEmptyList();
    public T front();
    public T back();
    public int length();
    public void print();
    public void reversePrint();
    public boolean search(T searchItem);
    public void insertNode(T insertItem);
    public boolean deleteNode(T deleteItem);
    @Override public String toString();
    public String recursiveToString();
    public String backwardsString();
    public String recursiveBackwardsString();
    @Override public boolean equals(Object o);
    public void copy(DoubleLinkedList<T> otherList);
    public void reversedCopy(DoubleLinkedList<T> otherList);
}
    