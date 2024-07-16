
import Part2.LinkedListNode;

public class Part1Client {

    public static void main(String[] args) {

        /** outputs 
        20 
        37 
        10 
        27
         */
        LinkedListNode current = new LinkedListNode();
        current.info = 10;
        LinkedListNode node = new LinkedListNode();
        node.info = 27;
        node.link = null;
        current.link = node;
        node = new LinkedListNode();
        node.info = 20;
        node.link = current;
        current = node;
        node = new LinkedListNode();
        node.info = 37;
        node.link = current.link;
        current.link = node;
        node = current;
        while (node != null) {
            System.out.println(node.info + " ");
            node = node.link;
        }

    }

}
