public class test {
    public static void main(String[] args) {
        DupBinarySearchTree<Double> bst = new DupBinarySearchTree<Double>();


        bst.insert(2.0,1.6,4.0);
        
        
        System.out.println(bst.findClosest(1.7));    
        
        System.out.printf(
            "\nHeight: %d\n",
            bst.treeHeight()
        );
    }
}
