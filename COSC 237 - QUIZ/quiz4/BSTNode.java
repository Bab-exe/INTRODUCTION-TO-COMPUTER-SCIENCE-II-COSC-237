public class BSTNode {
    public BSTNode L_Link, R_Link , P_Link;

    public int info;


    
    public BSTNode(int info){
        this.info = info;
        L_Link = R_Link = P_Link = null;
    }


    @Override
    public boolean equals(Object obj){
        if (obj instanceof BSTNode == false) return false;

        BSTNode other =  ((BSTNode) obj);
        return (
            info == other.info &&
            ((L_Link == null && other.L_Link == null) || L_Link.equals(other.L_Link)) &&
            ((R_Link == null && other.R_Link == null) || R_Link.equals(other.R_Link)) &&
            ((P_Link == null && other.P_Link == null) || P_Link.equals(other.P_Link))
        );
    }
   
    @Override
    public final String toString(){
        return (
            ((L_Link == null) ? null : L_Link.info)
            + " < " + info + " > " + 
            ((R_Link == null) ? null : R_Link.info)
        );

    }


}
