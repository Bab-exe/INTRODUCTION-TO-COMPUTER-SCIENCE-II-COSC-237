//Class: BinarySearchTree extends
//Class: DupBinaryTree
public class DupBinarySearchTree<T> extends DupBinaryTree<T> {
  //-----------------------------//
  // Default constructor
  public DupBinarySearchTree()  {
    super();
  }
  
  //-----------------------------//
  // Function to search for an item in the current tree.
  // Input: + T item : The item we are searching for.
  // Output: 0 - If the item is not in the tree.
  //         Otherwise, returns the number of items that is currently in the tree.
  //-----------------------------//
  public int search(T item) {
    return recSearch(root, item);
  }  
  //-----------------------------//
  //----- TO BE IMPLEMENTED -----//
  //-----------------------------//
  // [15pts]
  // Helper: Recursive method called by search()
  // Input: + DupBinaryTreeNode<T> tree : The currrent node on the tree
  //        + T item : The item we are searching for
  // Output: 0 if the item we are searching for is not in the tree.
  //         Otherwise, returns the number of items that is currently in the tree.
  //-----------------------------//
  public int recSearch(DupBinaryTreeNode<T> tree, T item) {
    
  }
  
  //-----------------------------//
  // Function to insert an item into the current tree.
  // Input: + T item : The item we want to insert into the tree.
  // Output: This fuction does not return any value (void return).
  //-----------------------------//
  public void insert(T item) {
    root = recInsert(root, item);
  }  
  //-----------------------------//
  //----- TO BE IMPLEMENTED -----//
  //-----------------------------//
  // [15pts]
  // Helper: Recursive method called by insert()
  // Input: + DupBinaryTreeNode<T> tree : The currrent node on the tree
  //        + T item : The item we are searching for
  // Output: The updated tree with new item inserted.
  // Inserting criteria:
  //  + If item is NOT a duplicate
  //    --> Insert it into the tree as a regular BST
  //  + Else if this is a duplicate of a data which was already in the tree
  //    --> Find the node in the tree that contains the data 
  //    --> Follow its middle link until a null middle link pointer 
  //    --> Insert the duplicate in the middle link of the
  //-----------------------------//
  public DupBinaryTreeNode<T> recInsert(DupBinaryTreeNode<T> tree, T item) {
    
  }
  
  //-----------------------------//
  // Function to delete an item from the current tree.
  // Input: + T item : The item we want to delete from the tree.
  // Output: This fuction does not return any value (void return).
  //-----------------------------//
  //-----------------------------//
  public void delete(T item) {
    root = recDelete(root, item);
  }  
  //-----------------------------//
  //----- TO BE IMPLEMENTED -----//
  //-----------------------------//
  // [15pts]
  // Helper: recursive method called by delete()
  // Input: + DupBinaryTreeNode<T> tree : The currrent node on the tree
  //        + T item : The item to be deleted
  // Output: The updated tree with the current item deleted
  // Deleting criteria:
  //  + If item has NO duplicate value
  //    --> Delete it from the tree as a regular BST
  //  + Else if this is a duplicate of a data
  //    --> Find the node in the tree that contains the data 
  //    --> Follow its middle link until a null middle link pointer 
  //    --> Set the last node to null.
  //-----------------------------//
  public DupBinaryTreeNode<T> recDelete(DupBinaryTreeNode<T> tree, T item) {
    
  }  
  //-----------------------------//
  // Helper: method called by recDelete
  protected DupBinaryTreeNode<T> findMin(DupBinaryTreeNode<T> tree) {
    if (tree != null) {
      while (tree.lLink != null) {
        tree = tree.lLink;
      }
    }
    return tree;
  }
  //-----------------------------//
  // Helper: method called by recDelete
  protected DupBinaryTreeNode<T> removeMin(DupBinaryTreeNode<T> tree) {
    if (tree == null){   //empty tree
      System.err.println("Cannot delete from an empty tree.");
      return null;
    } else if (tree.lLink != null) {
      tree.lLink = removeMin(tree.lLink);
      return tree;
    } else
      return tree.rLink;
  }
}