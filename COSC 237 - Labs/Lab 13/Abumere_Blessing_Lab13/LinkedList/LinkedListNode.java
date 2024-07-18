package LinkedList;

public class LinkedListNode<T>{
    public T info;
    public LinkedListNode<T> link;

    public LinkedListNode(T info){
        this.info = info;
        this.link = null;
    }

    public LinkedListNode(){
        this.info = null;
        this.link = null;
    }

    @Override
    public String toString(){
        return this.info + "";
    }

    @Override
    public boolean equals(Object obj){
        
        if (obj instanceof LinkedListNode == false) return false;

        LinkedListNode<?> other = (LinkedListNode<?>) obj;

        return this.info == other.info;

    }

    



}
    