import java.util.ArrayList;

public class Abumere_HW_02_03 {
    static final String DIRECTORY = "Abumere_HW_02_03\\"; 
    
    /** gets only the numbers from file */
    static ArrayList<Integer> ListFromFile(String filename){
        ArrayList<Integer> list = new ArrayList<Integer>();

        java.io.File file = new java.io.File(filename);

        if (file.exists() == false) {
            file = new java.io.File(DIRECTORY + filename);
        }

        try(java.util.Scanner input = new java.util.Scanner(file) ){
            while(input.hasNext()){
                try {
                    list.add(input.nextInt());
                } catch (java.util.InputMismatchException e) {
                    input.next();
                    continue;
                }
                
            }
        }catch(java.io.FileNotFoundException e){
            System.err.println("File: '"+  file.getName() + "' doesnt exist"); 
            
        }
        
        return list;
    }

    public static void main(String[] args) {

        OrderedArrayList<Integer> list = new OrderedArrayList<Integer>();
        
        Integer[] x = {5,90};
        Integer[] y = {21,1,9,80};
        list.merge(
            x,
            y
        );

       

        System.out.print(list);
        
        
    }
}
