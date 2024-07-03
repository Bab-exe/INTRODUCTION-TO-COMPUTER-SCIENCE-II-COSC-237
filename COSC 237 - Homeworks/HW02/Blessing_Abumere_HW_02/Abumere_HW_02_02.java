//package Blessing_Abumere_HW_02.Abumere_HW_02_02;

import java.util.ArrayList;
import java.util.Scanner;

import Lecture08.UnorderedArrayList;


public class Abumere_HW_02_02 {
    static final String DIRECTORY = "Abumere_HW_02_02\\";
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

        java.util.Scanner input = new Scanner(System.in);
        
        System.out.print("Please input the name of the file to be opened for first list:\t");
        ArrayList<Integer> list1 = ListFromFile(input.nextLine());

        System.out.print("Please input the name of the file to be opened for second list:\t");
        ArrayList<Integer> list2 = ListFromFile(input.nextLine());
        
        UnorderedArrayList<Integer> result = new UnorderedArrayList<>();

        result.merge(list1, list2);

        System.out.println("The first list is:\n" + list1); 
        System.out.println("The second list is:\n" + list2);
        System.out.println("The merged list is:\n " + result);
        {
            
            boolean bad_input = true;
            while(bad_input){
                try {
                    System.out.print("Enter key for split:\t");
                    result.split(input.nextInt(), list1, list2);
                    bad_input = false;
                }catch (java.util.InputMismatchException e) {
                    input.nextLine();
                    System.err.println("Key must be a number");
                    
                }
                
            }
            input.close();
        }        
         
        Split_Display(list1, list2);

        
        
        
    }


    static <T> void Split_Display(ArrayList<T> list1,ArrayList<T> list2){
        

        System.out.println("The first list after split is:\n" + list1);
        System.out.println("The second list after split is:\n" + list2);

    }
}
