
public class Node{
    public int info;
    public Node link;
 
    public Node(int info,Node link){
        this.info = info;
        this.link = link;
    }

    public Node(int info){
        this.info = info;
        this.link = null;
    }

    public Node(){
        this.info = 0;
        this.link = null;
    }

    @Override
    public String toString(){
        return this.info + "";
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Node)) return false;

        Node other = (Node) obj;

        return (
            this.info == other.info &&
            this.link == other.link  
        );

    }



}