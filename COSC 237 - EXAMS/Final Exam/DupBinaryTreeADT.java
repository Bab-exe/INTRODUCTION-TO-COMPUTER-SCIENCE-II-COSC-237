//Interface: BinaryTreeADT
public interface DupBinaryTreeADT<T> extends Cloneable {  
  //Returns a clone of this BT.
  public Object clone();
  //-----------------------------//
  //-----------------------------//
  //-----------------------------//
  //-----------------------------//
  // Method to insert item in a DupBT.
  public void insert(T item);
  //-----------------------------//
  // Method to determine whether a tree is a DupBinarySearchTree
  public boolean isDupBinarySearchTree();
  //-----------------------------//
  // Method to determine the height of a DupBT.
  public int treeHeight();  
  //-----------------------------//
  // Method to determine how many duplicates of "item" are in a DupBT.
  public int search(T item);
  //-----------------------------//
  // Method to delete item from a DupBT.
  public void delete(T item);
  //-----------------------------//
  // Method to print the tree WITHOUT duplicated values in an ascending order
  public void printSortedTreeWithoutDuplicates();
  //-----------------------------//
  // Method to print tree WITH duplicated values in an ascending order
  public void printSortedTreeWithDuplicates();
}