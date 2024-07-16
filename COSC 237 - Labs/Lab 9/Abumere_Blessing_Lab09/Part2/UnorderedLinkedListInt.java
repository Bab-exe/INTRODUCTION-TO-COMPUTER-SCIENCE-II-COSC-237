package Part2;

public class UnorderedLinkedListInt extends LinkedListIntClass{

    public UnorderedLinkedListInt(){
        super();
    }

    
    
    public int findSum(){
        int sum = 0;
        for (LinkedListNode current = this.first; current != null; current = current.link){
            sum += current.info;
        }
        return sum;
    }

    
    public int findMin(){
        int min = this.first.info;

        for (LinkedListNode current = this.first; current != null; current = current.link){
            if (current.info < min) min = current.info;
        }

        return min;
    }

    @Override
    public String toString(){
        
        if (this.first == null) return "[null]";

        String output = "";

        for (LinkedListNode current = this.first; current.link != null; current = current.link){
            output += current.info + ", ";
        }

        return "[" + output + super.last.info + "]";
    }

}
