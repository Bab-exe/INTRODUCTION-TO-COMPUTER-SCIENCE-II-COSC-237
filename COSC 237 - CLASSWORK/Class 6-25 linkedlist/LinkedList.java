public class LinkedList{

    public Node first,last;
    
   

    public LinkedList(){
        this.first = null;
        this.last = null;
       
    }

    public LinkedList(Node node){
        this.first = node;
        this.last = node;
    }

    public LinkedList(Node first,Node last){
        this.first = first;
        this.last = last;
    }
    
    public void insert(int info){
        Node node = new Node(info);
        if (this.first == null){
            this.first = node;
            this.last = (node.link == null) ? node : node.link;
        }
        else {

            this.last.link = node;
            this.last = node;
        }
    
    }
    public void insert(int ... infos){
        for (int i = 0 ; i < infos.length; i++) {
            this.insert(infos[i]);
        }
    }
    
    
    //with nodes
    public void insert(Node ... nodes){
        for (int i = 0 ; i < nodes.length; i++) {
            this.insert(nodes[i]);
        }
        

    }
    public void insert(Node node){

        if (this.first == null){
            this.first = node;
            this.last = (node.link == null) ? node : node.link;
        }
        else {

            this.last.link = node;
            this.last = node;
        }
    }
    

    public boolean delete(int info){
        if (this.first == null) return false;

        Node current  = this.first;
        Node previous = current;
        
        for(;current != null; previous = current,current = current.link){

            if (current.info == info) {
                
                this.delete(current.link);


                return true;
            }
        }

        
        System.gc();

        return false;
    }


    //with  nodes
    public boolean delete(Node node){

        if (this.first == null) return true;
        Node current = this.first;

        while (current != null){
            if (current.equals(node)) {    
                this.first = node.link;   
                return true;
            }
    
            current = current.link;
        }
        return false;
    }
    
    public boolean delete(Node ... nodes){

        //deletes all if empty
        if (nodes.length == 0) this.delete(this.last);
        int i,full_success;
        
        for (i = 0,full_success=0 ; i < nodes.length; i++) ;
            full_success += (this.delete(nodes[i])) ? 1 : 0;
        


        return full_success == i;
        
    }
    @Override
    public String toString(){

        

        Node current = this.first;

        if (current == null) return null;
        String output = new String (current.toString() + "");


        while(current.link != null){
            current = current.link;
            output += " --> " + current.info  ;
            

        }
        
        
        return output;
    }
    
    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof LinkedList)) return false;

        LinkedList other = (LinkedList) obj;

        Node current1 = this.first;
        Node current2 = other.first;

        while(current1 != null && current2 != null){
            if(current1.info != current2.info) return false;
        }
        
        
        

        return current1==null && current2 == null;

    }


   
    
    
}
