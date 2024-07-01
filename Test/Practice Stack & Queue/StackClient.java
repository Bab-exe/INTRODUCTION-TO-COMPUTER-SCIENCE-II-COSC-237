public class StackClient {
    public static void main(String[] args) {
    
        Stack x = new Stack(90);

        Stack e = new Stack();
        x.setList(5, 3, 7, 1);

        

       
        x.push(4);
        x.push(6);
        
        x.pop();

        x.push(8);

        
        System.out.println(e);
    }
}
