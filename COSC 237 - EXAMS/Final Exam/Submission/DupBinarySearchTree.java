//Class: BinarySearchTree extends
//Class: DupBinaryTree
public class DupBinarySearchTree<T> extends DupBinaryTree<T> {
  final int MAX_DUPLICATE = 5; //for 40% of grade
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
    if (tree == null) return 0;
    else {
      final Comparable<T> ITEM = (Comparable<T>) item;
      
      //smaller
      if (ITEM.compareTo(tree.info) < 0) return recSearch(tree.lLink, item);
      //bigger
      else if (ITEM.compareTo(tree.info) > 0) return recSearch(tree.rLink, item);
      
      return 1 + recSearch(tree.mLink, item);
    }

  }
  
  //-----------------------------//
  // Function to insert an item into the current tree.
  // Input: + T item : The item we want to insert into the tree.
  // Output: This fuction does not return any value (void return).
  //-----------------------------//
  public void insert(T item) {
    root = recInsert(root, item);
  }  

  public void insert(T ... items){
    for (T item : items) {
      insert(item);
    }
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
    //until a null pointer 
    if (tree == null) {
      tree = new DupBinaryTreeNode<>();
      tree.info = item;
    } else {

        if (search(item) >= MAX_DUPLICATE) {
          System.err.println("Cannot insert more than " + MAX_DUPLICATE + " duplicates.");
          return tree;
        }

        final Comparable<T> ITEM = (Comparable<T>) item;

        if (ITEM.compareTo(tree.info) < 0) {
          //smaller = left
          tree.lLink = recInsert(tree.lLink, item);
        } else if (ITEM.compareTo(tree.info) > 0) {
          //bigger = right
          tree.rLink = recInsert(tree.rLink, item);
        } else {
          //middle
          tree.mLink = recInsert(tree.mLink, item);
        }
    }

    return tree;
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
  /** Helper: recursive method called by delete()
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
  */
  //-----------------------------//
  public DupBinaryTreeNode<T> recDelete(DupBinaryTreeNode<T> tree, T item) {
    ///TODO: test delete at middle first and last

    if (tree == null) {
      System.err.println("Item not found.");
    } else {
      final Comparable<T> ITEM = (Comparable<T>) item;
      if (ITEM.compareTo(tree.info) < 0) {
        tree.lLink = recDelete(tree.lLink, item);
      } else if (ITEM.compareTo(tree.info) > 0) {
        tree.rLink = recDelete(tree.rLink, item);
      } else {
        if (tree.mLink != null) {
          tree.mLink = removeMin(tree.mLink);
        } else {
          if (tree.lLink == null) {
            tree = tree.rLink;
          } else {
            if (tree.rLink == null) {
              tree = tree.lLink;
            } else {
              DupBinaryTreeNode<T> temp = findMin(tree.rLink);
              tree.info = temp.info;
              tree.rLink = removeMin(tree.rLink);
            }
          }
        }
      }
    }

    return tree;
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
  
  /** A method named findClosest( T key ) to return the node whose information is the closest (in
absolute distance) to the provided key. For example, in the above tree with information of type Double,
and key = 1.71, the closest node is the one with information 2. */
  public DupBinaryTreeNode<T> findClosest(final T key) {
      if (key instanceof Double == false) {
          System.err.println("Only works for Doubles");
          return null;
      }
      
      if (root == null) return null;


      return findClosest(root, (Double) key, (Double) root.info);

  
  }

  //TODO: CHECK if time
  /** helper */
  
  private DupBinaryTreeNode<T> findClosest(DupBinaryTreeNode<T> tree,final Double key,Double closest) {


      if (tree == null) return null;

      final Double DIFF = Math.abs(key - (Double) tree.info);
      
      if (DIFF < closest) {
          closest = DIFF;
          return tree;
      }
      if (key < (Double) tree.info) {
          return findClosest(tree.lLink, key, DIFF);
      } else {
          return findClosest(tree.rLink, key, DIFF);
      }
      



      
    }
}