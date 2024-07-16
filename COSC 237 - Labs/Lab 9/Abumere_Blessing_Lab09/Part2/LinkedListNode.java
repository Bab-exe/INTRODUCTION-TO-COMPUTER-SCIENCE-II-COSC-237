package Part2;

public class LinkedListNode{
    public int info;
    public LinkedListNode link;

    public LinkedListNode(int info){
        this.info = info;
        this.link = null;
    }

    public LinkedListNode(){
        this.info = 0;
        this.link = null;
    }

    @Override
    public String toString(){
        return this.info + "";
    }

    @Override
    public boolean equals(Object obj){
        
        if (obj instanceof LinkedListNode == false) return false;

        LinkedListNode other = (LinkedListNode) obj;

        return this.info == other.info;

    }



}
    