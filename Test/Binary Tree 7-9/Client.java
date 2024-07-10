public class Client {
    public static void main(String[] args) {
        

        TreeNode parent = new TreeNode(30);

        TreeNode a = new TreeNode(0);

        TreeNode b = new TreeNode(1);

        TreeNode c = new TreeNode(2);

        TreeNode d = new TreeNode(4);

        TreeNode e = new TreeNode(5);
        
        
        
        

        for (TreeNode node : new TreeNode[]{a,b,c,d,e}){
            parent.Link(node);
        }

        String tab = "";
        System.out.println(
            IBinarySearchTree.maxRight(a)
        );
        
        


    }
}
