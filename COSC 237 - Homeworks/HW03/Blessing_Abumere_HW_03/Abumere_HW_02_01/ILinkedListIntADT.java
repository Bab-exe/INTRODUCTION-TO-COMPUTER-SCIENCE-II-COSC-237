package Abumere_HW_02_01;

public interface ILinkedListIntADT {
    public boolean isEmptyList();
    public void initializeList();
    public void print();
    public int length();
    public int front();
    public int back();
    public boolean search(int searchItem);
    public void insertFirst(int newItem);
    public void insertLast(int newItem);
    public boolean deleteNode(int deleteItem);
}
