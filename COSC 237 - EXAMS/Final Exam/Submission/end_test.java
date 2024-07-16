//-----------------------------//
//class: ClientBST
//Sample input 02 (in this order): 3 2 1 2 3 1 4 1 1 5 999
//Sample input 02 (in this order): 5 4 3 3 1 2 1 5 5 6 4 2 2 1 999
//-----------------------------//
import java.util.Scanner;
public class end_test {
  public static void main(String[] args) {
    
    DupBinarySearchTree<Integer> bst = new DupBinarySearchTree<Integer>();
    //-----------------------------//
    Integer[] num = {3,2,1,2,3,1,4,1,1,5,999};

    
    
    //-----------------------------//
    System.out.println("Printing sorted tree WITHOUT duplicates: ");
    bst.printSortedTreeWithoutDuplicates();
    //-----------------------------//
    System.out.println("\nPrinting sorted tree WITH duplicates: ");
    bst.printSortedTreeWithDuplicates();
    //-----------------------------//
    System.out.print("\nChecking isDupBST(): " + bst.isDupBinarySearchTree());
    //-----------------------------//
    System.out.println("Tree Height: " + bst.treeHeight());
    //-----------------------------//
    System.out.print("Enter value to search for: ");
    
    final Integer value = 3;
    int numCopies = bst.search(value);
    if (numCopies > 0)
      System.out.println(num + " was found in this tree with " + numCopies + " copies");
    else
      System.out.println(num + " was NOT found in this tree");
    //-----------------------------//
    System.out.print("\nEnter value to be deleted from tree: ");
    final Integer delete = 1;
    bst.delete(delete);
    //-----------------------------//
    System.out.println("\nPrinting sorted tree WITH duplicates: ");
    bst.printSortedTreeWithDuplicates();
    //-----------------------------//
   
    System.out.println("ALL DONE");    
  }
}





