//Class: DupBinaryTree implements
//Interface: DupBinaryTreeADT
//Inner class: DupBinaryTreeNode
import java.util.NoSuchElementException;

public abstract class DupBinaryTree<T> implements DupBinaryTreeADT<T> {
  //======================================================================//
  //Definition of the DupBinaryTreeNode class
  protected class DupBinaryTreeNode<T> {
    public T info;
    public DupBinaryTreeNode<T> lLink;
    public DupBinaryTreeNode<T> mLink;
    public DupBinaryTreeNode<T> rLink;
    
    //-----------------------------//
    //----- TO BE IMPLEMENTED -----//
    //-----------------------------//
    // [7.5pts] Default constructor
    public DupBinaryTreeNode() {
      
    }
    
    //-----------------------------//
    //----- TO BE IMPLEMENTED -----//
    //-----------------------------//
    // [7.5pts] Alternate constructor
    public DupBinaryTreeNode(T item, DupBinaryTreeNode<T> left, DupBinaryTreeNode<T> middle, DupBinaryTreeNode<T> right) {
      
    }
    
    //-----------------------------//
    // clone() method
    public Object clone() {
      DupBinaryTreeNode<T> copy = null;
      try {
        copy = (DupBinaryTreeNode<T>) super.clone();
      } catch (CloneNotSupportedException e) {
        return null;
      }
      return copy;
    }
    
    //-----------------------------//
    // toString() method
    public String toString() {
      return info.toString();
    }    
  } // End of class DupBinaryTreeNode<T>
  //======================================================================//
  
  //-----------------------------//
  //Instance variable vor class DupBinaryTree
  protected DupBinaryTreeNode<T> root;
  //-----------------------------//
  //Default constructor
  public DupBinaryTree() {
    root = null;
  }
  //-----------------------------//
  public Object clone() {
    DupBinaryTree<T> copy = null;
    try {
      copy = (DupBinaryTree<T>) super.clone();
    } catch (CloneNotSupportedException e) {
      return null;
    }
    if (root != null)  
      copy.root = copyTree(root);
    return copy;
  }
  //-----------------------------//
  // Helper method called by clone     
  private DupBinaryTreeNode<T> copyTree(DupBinaryTreeNode<T> otherTreeRoot) {
    DupBinaryTreeNode<T> temp;
    if (otherTreeRoot == null)
      temp = null;
    else {
      temp = (DupBinaryTreeNode<T>) otherTreeRoot.clone();
      temp.lLink = copyTree(otherTreeRoot.lLink);
      temp.mLink = copyTree(otherTreeRoot.mLink);
      temp.rLink = copyTree(otherTreeRoot.rLink);
    }
    return temp;
  }
  
  //-----------------------------//
  // Function to print the sorted tree without duplicates values
  // Input: + Nothing
  // Output: + The sorted tree without duplicates values
  //-----------------------------//
  public void printSortedTreeWithoutDuplicates() {
    printDistinct(root);
  }  
  //-----------------------------//
  //----- TO BE IMPLEMENTED -----//
  //-----------------------------//
  // [10pts]
  // Function to print the sorted tree without duplicates values
  // Input: + DupBinaryTreeNode<T> t : The current node in the tree
  // Output: + Nothing (void)
  //-----------------------------//
  public void printDistinct(DupBinaryTreeNode<T> t) {
    
  }
  
  //-----------------------------//  
  // Function to print the sorted tree with duplicates values
  // Input: + Nothing
  // Output: + The sorted tree without duplicates values
  //-----------------------------//
  public void printSortedTreeWithDuplicates() {
    printDup(root);
  }  
  //-----------------------------//
  //----- TO BE IMPLEMENTED -----//
  //-----------------------------//
  // [10pts]
  // Function to print the sorted tree with duplicates values
  // Input: + DupBinaryTreeNode<T> t : The current node in the tree
  // Output: + Nothing (void)
  //-----------------------------//
  public void printDup(DupBinaryTreeNode<T> t) {
    
  }
  
  //-----------------------------//
  // Function to find the height of the tree with duplicates values taken into account
  // Input: + Nothing
  // Output: + The height of the tree
  //-----------------------------//
  public int treeHeight() {
    return height(root);
  }
  //-----------------------------//
  //----- TO BE IMPLEMENTED -----//
  //-----------------------------//
  // [7.5pts]
  // Function to find the height of a node
  // Input: + DupBinaryTreeNode<T> t : The current node in the tree
  // Output: + The height of that node (int)
  //-----------------------------//
  // Helper method called by treeHeight
  private int height(DupBinaryTreeNode<T> t) {
    
  }
  
  //-----------------------------//
  // Function to check whether a tree is indeed a DupBinarySearchTree
  // Input: + Nothing
  // Output: True or False.
  //-----------------------------//
  public boolean isDupBinarySearchTree() {
    return isDupBST(root); 
  }  
  //-----------------------------//
  //----- TO BE IMPLEMENTED -----//
  //-----------------------------//
  // [7.5pts]
  // Function to check whether the subtree, starting at the node tree is indeed a DupBinarySearchTree
  // Note: a BST is a DupBinarySearchTree but not the other way around
  // Input: DupBinaryTreeNode<T> tree : The current node in the tree
  // Output: True or False
  //-----------------------------//
  public boolean isDupBST(DupBinaryTreeNode<T> tree){    
    
  }  
  //-----------------------------//  
  //abstract methods
  public abstract int search(T item);
  public abstract void insert(T item);
  public abstract void delete(T item);
}


