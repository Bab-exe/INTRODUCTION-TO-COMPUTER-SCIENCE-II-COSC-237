public abstract class IBinarySearchTree {
    public abstract BSTNode search(int key);
    //public boolean delete(int key);
    

    
    /** keeps going left which will return the  SMALLEST value */
    public BSTNode maxLeft(BSTNode node){

        BSTNode current;
        for (current = node; current.L_Link != null; current = current.L_Link);


        return current;
    }

    /** keeps going right which will return the BIGGEST value*/
    public BSTNode maxRight(BSTNode node){
        BSTNode current;
        for (current = node; current.R_Link != null; current = current.R_Link);

        return current;
    }

    /** TRUE if node doesnt have a left or isRight link but has a parent link */
    public boolean isLeafNode(BSTNode node){
        return (node.L_Link == null && node.R_Link == null && node.P_Link != null);
    }

    
}
