package Abumere_HW_02_01;

abstract class LinkedListIntClass implements ILinkedListIntADT{
    protected Node first,last;
    private int count;
    
    public LinkedListIntClass(){
        this.first = null;
        this.last = null;
        this.count = 0;
       
    }

    /** This method will append {@code list} to the original list. Side effect: the original list is lost. */
    abstract public void merge1(UnorderedLinkedListInt list);

    /** This method should create a new {@code list} with the concatenation result.*/
    abstract public UnorderedLinkedListInt merge2(UnorderedLinkedListInt list);

    /** This method should split the original list into {@code list1 and list2}. Follow the same rules as in the previous problems */
    abstract public void split(UnorderedLinkedListInt list1, UnorderedLinkedListInt
    list2, int key);

    /**clear */
    public void initializeList() {
        this.first = null;
        this.last = null;
        this.count = 0;
        System.gc();
    }

    //get
    public int front(){
        return this.first.info;
    }
    public int back(){
        return this.last.info;
    }
    public int length(){
        return this.count;
    }
    public boolean isEmptyList(){
        return (this.first == null && count == 0);
    }

    /** true only if found  */
    public boolean search(int query){
        for (Node current = this.first; current != null; current = current.link){
            if (current.info == query) return true;
        }
        return false;
    }

    public void print(){
        System.out.println(toString());
    }
    
    public void insertLast(int info){
        final Node node = new Node(info);
        if (this.first == null){
            this.first = node;
            this.last = node;
        }
        else {
            this.last.link = node;
            this.last = node;
        }
        count++;
    }
    public void insertLast(int ... mass_info){
        for (int info: mass_info){
            this.insertLast(info);
        }
    }

    public void insertFirst(int info){
        final Node node = new Node(info);
        if (this.first == null){
            this.first = node;
            this.last = node;
        }else{
            node.link = this.first;
            this.first = node;
        }
        count++;
    }

    public boolean deleteNode(int info){
        if (isEmptyList()) return false;
        //weird case
        if (this.first.info == info){
            this.first = this.first.link;
            count--;
            return true;
        }
        
        for(Node previous = this.first,current = previous.link; current != null;previous = current,current = current.link){
            if (current.info == info) {
                previous.link = current.link;
                count--;
                return true;
            }   
        }
        return false;
    }

    /** first  ...  last */
    @Override public String toString(){
        Node current = this.first;

        if (current == null) return null;
        String output = "";


        while(current.link != null){
            output += current.toString() + " ";
            
            current = current.link;
        }

        output += current.toString();
        
        
        return output;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj instanceof LinkedListIntClass == false) return false;

        LinkedListIntClass other = (LinkedListIntClass) obj;

        if (other.count != this.count) return false;

        Node current1 = this.first;
        Node current2 = other.first;

        while(current1 != null){
            if(current1.equals(current2) == false) return false;
            current1 = current1.link;
            current2 = current2.link;
        }
        
        
        

        return true;

    }


   
    protected class Node{
        public int info;
        public Node link;
    
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
            if (obj instanceof Node == false) return false;

            Node other = (Node) obj;


            return (
                this.info == other.info &&
                this.link == other.link  
            );

        }



    }
        
    
}
