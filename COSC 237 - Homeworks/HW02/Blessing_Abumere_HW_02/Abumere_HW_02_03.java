import java.util.ArrayList;

public class Abumere_HW_02_03 {
    static final String DIRECTORY = "Abumere_HW_02_03\\"; 
    
    /** gets only the numbers from file */
    static Number[] ListFromFile(String filename){
        ArrayList<Number> list = new ArrayList<Number>(10);

        java.io.File file = new java.io.File(filename);

        if (file.exists() == false) {
            file = new java.io.File(DIRECTORY + filename);
        }

        try(java.util.Scanner input = new java.util.Scanner(file) ){
            while(input.hasNext()){
                try {
                    list.add(input.nextInt()); //if changed to nextdOUBLE then doubles will work cus its a number type
                } catch (java.util.InputMismatchException e) {
                    input.next();
                    continue;
                }
                
            }
        }catch(java.io.FileNotFoundException e){
            System.err.println("File: '"+  file.getName() + "' doesnt exist"); 
        }
        
        return list.toArray(new Number[list.size()]);
    }

    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);
        //Integer works also but if u use Number u can use Double and float
        OrderedArrayList<Number> list = new OrderedArrayList<>();
        
        System.out.print("Please input the name of the file to be opened for first list:\t");
            Number[] list1 = ListFromFile(input.nextLine());
        
        System.out.print("Please input the name of the file to be opened for second list:\t");
            Number[] list2 = ListFromFile(input.nextLine());

        list.merge(list1,list2 );

        System.out.println("The first list is:\n" + java.util.Arrays.toString(list1)); 
        System.out.println("The second list is:\n" + java.util.Arrays.toString(list2));
        System.out.println("The merged list is:\n" + list.toString());

        Prompt_split(input, list);
        
        /** debug 
        System.out.printf(
            "merged: %s\n" +
            "lengths: 1[%d], 2[%d], merge[%d]\n",
            list,
            list1.length,
            list2.length,
            list.listSize()
        );
        */

        input.close();
    }

    static void Prompt_split(java.util.Scanner input, OrderedArrayList<Number> list){
        ArrayList<Number> list1 = new ArrayList<Number>();
        ArrayList<Number> list2 = new ArrayList<Number>();
        System.out.print("\nEnter key for split:\t");
            list.split(input.nextInt(), list1, list2);

        System.out.println("The first list after split is:\n" + list1);
        System.out.println("The second list after split is:\n" + list2);
        
    }

    
}
