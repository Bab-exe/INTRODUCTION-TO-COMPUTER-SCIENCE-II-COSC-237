

import Abumere_HW_02_02.DoubleLinkedList;

public class test {
    public static void main(String[] args){
        DoubleLinkedList<String>list_1 = new DoubleLinkedList<String>();


        list_1.insertNode("a");
        list_1.insertNode("b");
        list_1.insertNode("c");
        list_1.insertNode("d");
        list_1.insertNode("e");
        
        list_1.deleteNode("b");
        System.out.println(list_1.backwardsString());


    }
}
