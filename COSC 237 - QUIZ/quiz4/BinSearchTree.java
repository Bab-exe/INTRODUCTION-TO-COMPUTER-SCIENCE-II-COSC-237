import org.w3c.dom.Node;

public class BinSearchTree extends IBinarySearchTree{

    private BSTNode root;

    public BinSearchTree(){
        this.root = null;
    }


    /** for int */
    public BinSearchTree(int info){
        this.root = new BSTNode(info);
    }

    /** for node */
    public BinSearchTree(BSTNode root){
        this.root = root;
    }

    public void print(){

        BSTNode parent = this.root;
        BSTNode current = parent.L_Link;
        //left side 
        while (isLeafNode(current) == false){

            System.out.println(parent.info);

            if (isLeafNode(parent.L_Link)){
                System.out.println(parent.L_Link.info);
            }
            current = current.L_Link;            
        }

        /*right side
        while (isLeafNode(current) == false){
            
        } */
    }

    

    //quiz4
    /** returns the number of nodes that have information equals to or greater than key */
    public int findGTE(int key){
        
        BSTNode current = this.root;
        BSTNode previous = null;


        int nodes = 0;
        

        
        boolean L_exists, R_exists;
        
        
        

        do{
            L_exists = (current.L_Link != null);
            R_exists = (current.R_Link != null);
            
            if (current.info >= key){
                nodes++;
            }

            
            if (L_exists){
                current = current.L_Link;
                continue;
            }

            previous = current;
            if (R_exists){
                current = current.R_Link;

            }

            

        }while (L_exists || R_exists);            
        

        return nodes;


    }   

    
    @Override
    public String toString(){
        return String.format(
            "Root: %s\n" +
            "Max Left: %s\n" +
            "Max Right: %s\n" ,
            root,
            maxLeft(root),
            maxRight(root)

            
        );
    }
    /** returns false if nothing was changed and true if successful insert */
    public boolean insert(int _item){
        //if empty
        if (root == null){
            root = new BSTNode(_item);
            return true;
        }
        
        BSTNode current = root;

        while(current != null){
            if (current.info == _item){
                System.err.printf("'%d' is already in the Tree\n",_item );
                return false;
            }

            current.P_Link = current;
            //if go Left
            if (current.info > _item){

                if (current.L_Link == null){
                    current.L_Link = new BSTNode(_item);
                    current.L_Link.P_Link = current;
                    return true;
                }
                current = current.L_Link;
                
            }else{

                if (current.R_Link == null){
                    current.R_Link = new BSTNode(_item);
                    current.R_Link.P_Link = current;
                    return true;
                }

                current = current.R_Link;   
            }   
            
        }


        return false;
        
    }

    /** mass insertion; exists for testing */
    public boolean[] insert(int ... _items){

        boolean[] output = new boolean[_items.length];
        
        for (int i = 0; i< _items.length; i++){
            output[i] = insert(_items[i]);
        }

        return output;
    }
    /** TRUE if node doesnt have a left or isRight link but has a parent link */
    public boolean isLeafNode(BSTNode node){
        return (node.L_Link == null && node.R_Link == null && node.P_Link != null);
    }


    public BSTNode search(int key){
        BSTNode current = this.root;

        while (current != null){
            if (key == current.info) return current;

            current = (key < current.info) ? current.L_Link : current.R_Link;
        }


        return null;
    }


    

    


}
