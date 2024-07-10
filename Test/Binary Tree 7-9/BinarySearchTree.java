public class BinarySearchTree implements IBinarySearchTree{
    
    
    private TreeNode root;

    public BinarySearchTree(TreeNode _root){
        root = _root;

    }


    public boolean insert(int _item){
        if (root == null)
            root = new TreeNode(_item);

        TreeNode current = root;


        while(current != null){
            if (current.info == _item){
                System.err.printf("'%d' is already in the Tree",_item );
                return false;
            }

            current.pLink = current;
            if (current.info > _item){
                current = current.lLink;
                
            }else{
                current = current.rLink;
                
            }
                
        }


        return false;
        
    }

    public TreeNode search(int key){

        TreeNode current = this.root;
        while (current != null){

            if (key == current.info) return current;

            current = (key < current.info) ? current.lLink : current.rLink;
        }


        return null;
    }

    public boolean delete(int key){
        TreeNode item = search(key); 

        if (item == null) return false;

        
        if (item.lLink != null) {
            item.info = item.lLink.info;

            item.lLink = null;
        }

        if (isLeafNode(item)){
            item = null;

            return true;
        };
        
        


    }

    public boolean isLeafNode(TreeNode node){
        return (node.lLink == null && node.rLink == null)
    }

    
}
