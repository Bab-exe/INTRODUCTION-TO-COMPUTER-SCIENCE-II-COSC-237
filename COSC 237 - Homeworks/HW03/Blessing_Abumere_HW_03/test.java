

import Abumere_HW_02_01.UnorderedLinkedListInt;

public class test {
    public static void main(String[] args) {
        
        /** Enter integers for the first list(999 to stop)
37 10 88 59 27 20 14 32 89 100 12 999
Enter integers for the second list(999 to stop)
23 56 34 15 78 19 999
The first list is: 37 10 88 59 27 20 14 32 89 100 12
The length of the first list is: 11
First element/list1: 37
Last element/list1: 12
The second list is: 23 56 34 15 78 19
The length of the second list is: 6
First element/list2: 23
Last element/list2: 19
After concatenating the 2 lists, the merged list1 is: 37 10 88 59 27 20 14 32 89 100 12 23
56 34 15 78 19
The length of the merged list is: 17
First element/merged list: 37
Last element/merged list: 19 */
        UnorderedLinkedListInt list1 = new UnorderedLinkedListInt();
        UnorderedLinkedListInt list2 = new UnorderedLinkedListInt();

        list1.insertLast(37, 10, 88, 59, 27, 20, 14, 32, 89, 100, 12);
        list2.insertLast(23, 56, 34, 15, 78, 19);

        System.out.print("\nThe first list is: ");
        list1.print();
        System.out.println("\nThe length of the first list is: " + list1.length());
        System.out.println("First element/list1: " + list1.front());
        System.out.println("Last element/list1: " + list1.back());

        System.out.print("\nThe second list is: ");
        list2.print();
        System.out.println("\nThe length of the second list is: " + list2.length());
        System.out.println("First element/list2: " + list2.front());
        System.out.println("Last element/list2: " + list2.back());

        
        UnorderedLinkedListInt list3 = list1.merge2(list2);

        System.out.print("\nAfter concatenating the 2 lists, the merged list1 is: ");
        list3.print();
        System.out.println("\nThe length of the merged list is: " + list3.length());
        System.out.println("First element/merged list: " + list3.front());
        System.out.println("Last element/merged list: " + list3.back());

        final int key = 20;

        System.out.println("enter key for split:" + key);
        list3.split(list1, list2, key);

        System.out.print("\nThe first list after split is: ");
        list1.print();
        System.out.print("\nThe second list after split is: ");
        list2.print();
        System.out.println();
        
    }
    


    
}
