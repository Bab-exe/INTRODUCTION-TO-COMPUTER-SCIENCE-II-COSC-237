package Lecture08;
    //8. ADT: Ordered List
    //Class: OrderedArrayList extends
    //Class: ArrayListClass

public class OrderedArrayList<T> extends ArrayListClass<T> {

         //Default constructor
        public OrderedArrayList() {
            super();
        }
        //Alternate constructor
        public OrderedArrayList(int size) {
            super(size);
        }
    
        /** one traversal ; only works if list is 'ordered'*/
        public void merge(T[] list1, T[] list2) {
            if (list1.length + list2.length > super.maxSize) {
                System.err.printf("The merged lists would surpass the set Max Size\n%d > |%d|\n", list1.length+list2.length, super.maxSize);
                return;
            }
            super.clearList();
            super.length = list1.length + list2.length;
            
            
            //TODO skips Integer(70) for some reason???? 
            Comparable<T> _item1 = null;
            int i1 = 0,i2 = 0;
            
            for (int i = 0; i< super.length; i++){
            
                //will be null if list1 is finished
                _item1 = (i1 < list1.length) ? (Comparable<T>) list1[i1] : null;
                
                if (_item1 != null){
                    if (i2 < list2.length){
                        super.list[i] = (_item1.compareTo(list2[i2]) <= 0) ? list1[i1++] : list2[i2++];
                        continue;
                    }
                    super.list[i] = list1[i1++];
                }else{
                    super.list[i] = list2[i2++];
                }
        }
        
            
            
            
              
        }
       
        public void split(T key, java.util.ArrayList<T> L1, java.util.ArrayList<T> L2){

            L1.clear();
            L2.clear();
            
            final Comparable<T> KEY = (Comparable<T>) key;
            

            //list1
            int i = 0;
            while(i < super.length && KEY.compareTo(super.list[i]) > 0){
                L1.add(super.list[i++]);
            }
            //list2
            while(i < super.length){
                L2.add(super.list[i++]);
            }

            
            
        }   
        //implementation for abstract methods defined in ArrayListClass
        //ordered list ­­> binary search
        public int search(T item) {
            int first = 0;
            int last = length - 1;
            int middle = -1;
    
            while (first <= last) {
                middle = (first + last) / 2;
                Comparable<T> listElem = (Comparable<T>) list[middle];
                if (listElem.compareTo(item) == 0)
                    return middle;
                else 
                    if (listElem.compareTo(item) > 0)
                        last = middle - 1;
                    else
                        first = middle + 1;
            }
            return -1;
        }
    
    
        public void insert(T item) {
            int loc;
            boolean found = false;
            if (length == 0) //list is empty
                list[length++] = item; //insert item and increment length
            else if (length == maxSize) //list is full
                System.err.println("Cannot insert in a full list.");
            else {
                for (loc = 0; loc < length; loc++) {
                    Comparable<T> temp = (Comparable<T>) list[loc];
                    if (temp.compareTo(item) >= 0) {
                        found = true;
                        break;
                    }
            }
            //starting at the end, shift right
            for (int i = length; i > loc; i--)
                list[i] = list[i - 1];
                list[loc] = item;
                length++;
            }
        }
    
        /*Another version for insert:
            public void insert(T item) {
            int loc;
            boolean found = false;
            if (length == 0) //list is empty
            list[length++] = item; //insert item and increment length
            else if (length == maxSize) //list is full
            System.err.println("Cannot insert in a full list.");
            else {
            int i = length - 1;
            //while (i >= 0 && list[i] > item) {
            while (i >= 0 && ((Comparable<T>) list[i]).compareTo(item) > 0) {
            list[i + 1] = list[i];
            i­­;
            }
            list[i + 1] = item; // Insert item
            length++;
            }
            } */
    
        public void insertAt(int location, T item) {
            if (location < 0 || location >= maxSize)
                System.err.println("The position of the item to be inserted is out of range.");
            else if (length == maxSize) //list is full
                System.err.println("Cannot insert in a full list.");
            else {
                System.out.println("This is a sorted list. Doing insert in place (call to insert).");
                insert(item);
            }
        }
    
        public void insertEnd(T item) {
            if (length == maxSize) //the list is full
                System.err.println("Cannot insert in a full list.");
            else {
                System.out.println("This is a sorted list. Doing insert in place (call to insert).");
                insert(item);
            }
        }
         
        public void replaceAt(int location, T item) {
            //the list is sorted!
            //is actually removing the element at location and inserting item in place
            if (location < 0 || location >= length)
                System.err.println("The position of the item to be replaced is out of range.");
            else {
                removeAt(location);//method in ArrayListClass
                insert(item);
            }
        }
            
        public void remove(T item) {
            int loc;
            if (length == 0)
                System.err.println("Cannot delete from an empty list.");
            else {
                loc = search(item);
                if (loc != -1)
                removeAt(loc);//method in ArrayListClass
            else
                System.out.println("The item to be deleted is not in the list.");
            }
        }
     
        /*Another version for remove:
        public void remove(T item) {
        int loc;
        if (length == 0)
        System.err.println("Cannot delete from an empty list.");
        else {
        loc = search(item);
        if (loc != ­1) {
        for(int i = loc; i < length ­ 1; i++)
        list[i] = list[i + 1]; //shift left
        length­­;
        }
        else
        System.out.println("The item to be deleted is not in the list.");
        }
        } */
    
        
        //tostring & equals are inherited from ArrayListClass
    
        
    }
    
    