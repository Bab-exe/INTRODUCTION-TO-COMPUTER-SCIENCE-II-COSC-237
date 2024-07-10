public interface IBinarySearchTree {
    public TreeNode search(int key);
    public boolean delete(int key);
    
    public static TreeNode maxLeft(TreeNode node){

        TreeNode current;
        for (current = node; current.lLink != null; current = current.lLink);


        return current;
    }
    public static TreeNode maxRight(TreeNode node){
        TreeNode current;
        for (current = node; current.rLink != null; current = current.rLink);

        return current;
    }

    public TreeNode minLeft(TreeNode node);
    public TreeNode minRight(TreeNode node);


    
}
