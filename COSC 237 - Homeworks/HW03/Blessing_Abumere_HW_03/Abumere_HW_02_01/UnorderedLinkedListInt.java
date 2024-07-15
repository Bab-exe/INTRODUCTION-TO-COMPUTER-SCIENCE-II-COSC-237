package Abumere_HW_02_01;

public class UnorderedLinkedListInt extends LinkedListIntClass{

    public UnorderedLinkedListInt(){
        super();
    }

    public void merge1(UnorderedLinkedListInt list) {
        super.initializeList(); // original list is lost

        for (Node current = list.first; current != null; current = current.link){
            super.insertLast(current.info);
        }    
    }

    public UnorderedLinkedListInt merge2(UnorderedLinkedListInt list) {
        UnorderedLinkedListInt mergedList = new UnorderedLinkedListInt();

        for (Node current = this.first; current != null; current = current.link){
            mergedList.insertLast(current.info);
        }
        for (Node current = list.first; current != null; current = current.link){
            mergedList.insertLast(current.info);
        }
        
        return mergedList;
    }

    public void split(UnorderedLinkedListInt list1, UnorderedLinkedListInt list2,final int KEY) {
        list1.initializeList();
        list2.initializeList();
 
        for (Node current = this.first; current != null; current = current.link){
            if (current.info <= KEY){
                list1.insertLast(current.info);
            } else {
                list2.insertLast(current.info);
            }
        }
    }

    
}
