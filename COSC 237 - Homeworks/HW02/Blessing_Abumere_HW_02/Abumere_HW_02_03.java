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
                    list.add(input.nextInt());
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

        OrderedArrayList<Number> list = new OrderedArrayList<>();
        
        
        Number[] list1 = ListFromFile("list1.txt");
        Number[] list2 = ListFromFile("list2.txt");


        System.out.println(list1);

        System.out.println(list2);
        list.merge(list1, list2);


        System.out.println("The first list is:\n" + java.util.Arrays.toString(list1)); 
        System.out.println("The second list is:\n" + java.util.Arrays.toString(list2));

        System.out.printf(
            "merged: %s\n" +
            "lengths: 1[%d], 2[%d], merge[%d]\n",
            list,
            list1.length,
            list2.length,
            list.listSize()

        );

    }
    static void merge(int[] list1,int[] list2){

        int[] LIST = new int[list1.length + list2.length];

        int index = 0;
        
        //merge the two sorted arrays in order

        int i1 = 0,i2 = 0;
        for (int i = 0; i< LIST.length; i++){
            if(i1 < list1.length && i2 < list2.length){
                if(list1[i1] < list2[i2]){
                    LIST[i] = list1[i1];
                    i1++;
                }else{
                    LIST[i] = list2[i2];
                    i2++;
                }
                continue;
            }
            LIST[i] = i1 < list1.length ? list1[i1++] : list2[i2++];
            
        }
        

        System.out.println(
            java.util.Arrays.toString(list1) + "\n" +
            java.util.Arrays.toString(list2) + "\n" +
            java.util.Arrays.toString(LIST)
        );
        
    }
}
