//-----------------------------//
//class: ClientBST
//Sample input 02 (in this order): 3 2 1 2 3 1 4 1 1 5 999
//Sample input 02 (in this order): 5 4 3 3 1 2 1 5 5 6 4 2 2 1 999
//-----------------------------//
import java.util.Scanner;
public class ClientDupBST {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    DupBinarySearchTree<Double> bst = new DupBinarySearchTree<Double>();
    //-----------------------------//
    Double num;
    System.out.print("Enter Doubles(999 to stop): ");
    num = input.nextDouble();
    while (num != 999) {
      bst.insert(num);
      num = input.nextDouble();
    }
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
    num = input.nextDouble();
    int numCopies = bst.search(num);
    if (numCopies > 0)
      System.out.println(num + " was found in this tree with " + numCopies + " copies");
    else
      System.out.println(num + " was NOT found in this tree");
    //-----------------------------//
    System.out.print("\nEnter value to be deleted from tree: ");
    num = input.nextDouble();
    bst.delete(num);
    //-----------------------------//
    System.out.println("\nPrinting sorted tree WITH duplicates: ");
    bst.printSortedTreeWithDuplicates();
    //-----------------------------//
     input.close();
    System.out.println("ALL DONE");    
  }
}





