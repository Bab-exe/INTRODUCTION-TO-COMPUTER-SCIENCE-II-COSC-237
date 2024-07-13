public class TreeNode {

    public int info;


    //left = smaller ; right = bigger
    public TreeNode lLink,rLink;
    public TreeNode pLink;
    

    public TreeNode(){
        
    }
    
    public TreeNode(int _info){
        info = _info;    

        pLink = rLink = lLink = null;
    }

    public boolean Link(int _info){
        return Link(new TreeNode(_info));
    }
    public boolean Link(TreeNode node){
        if (node.info == info) return false;

        final boolean isLeft = node.info < info;

        if (isLeft){
            if (lLink == null){
                lLink = node;
                lLink.pLink = this;
                return true;
            }

            throw new RuntimeException("Left Node already exists");



                
        }else {
            if (rLink == null){
                rLink = node;
                rLink.pLink = this;
                return true;
            }

            throw new RuntimeException("Right Node already exists");
        }
    }

    
    @Override
    public boolean equals(Object obj){

        if (obj instanceof TreeNode == false) return false;

        TreeNode other = (TreeNode) obj;
        return (
            info == other.info &&
            ((lLink == null && other.lLink == null) || lLink.equals(other.lLink)) &&
            ((rLink == null && other.rLink == null) || rLink.equals(other.rLink)) &&
            ((pLink == null && other.pLink == null) || pLink.equals(other.pLink))



        );
         
    }
   
    @Override
    public final String toString(){
        return (
            ((lLink == null) ? null : lLink.info)
            + " < "+ info + " > " + 
            ((rLink == null) ? null : rLink.info)
        );

    }



}
