public class LinkedListClient {
    public static void main(String[] args) {

        LinkedList nodelist = new LinkedList();
        

        nodelist.insert(1,2,3,4,5);

        System.out.println("list: " + nodelist);

        final int info = 5;
        System.out.println(
            nodelist.delete(info) 
            ? "deleted " + info
            : "failed to delete " + info
        );
    }

    


}
