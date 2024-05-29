import java.util.Scanner;
import java.util.*;


public class Test <Type> {
    public static void main(String[] args) {
        
        /*   
        System.out.println("Which Method Do You Want To Run?");
            final int METHOD = Console.nextInt();

        try {
            switch (METHOD){
            case 1: 
            break;

            case 2: 
            break;

            case 3:
            break;

            case 4:
            break;

            default: throw new IllegalArgumentException("\nMethod " +  METHOD + " doesnt exist");
        }     
         
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            Console.close();
        }
            */
        
    }

      /** a better System.out.print() */
    static <Type> void print(Type x){ 
        System.out.print(x);
    }
    static <Type> void print(Type[] x){
        System.out.print(Arrays.toString(x));
    }
    static void print(int ... x){
        System.out.print(Arrays.toString(x));
    }
    /** prints a 2d int array */
    static void print(int[] ... x){
        for (int[] x_arr : x){
            print(x_arr);
            System.out.println();
        }

    }
    /** prints a 2d generic array */
    static <Type> void print(Type[][] x){
        for (Type[] x_arr : x){    
            System.out.println(Arrays.toString(x_arr));
        }

    }
    /** prints a 3d int array */
    static void print(int[][][] arr ){
        for (int[][] a: arr)
            print(a);
    }
    /** prints a 3d generic array */
    static <Type> void print(Type[][][] arr){
        for (Type[][] a: arr)
            print(a);
    } 
    
    /** a better System.out.println() */
    static void println(int ... x){
        print(x);
        System.out.println();
    }
    static <Type> void println(Type x){
        print(x);
        System.out.println();
    }

    /** 
     * generates a random number between the minimum and maximum;
     * {@code generates random minimum <= number <= maximum } */
    static int random(final int minimum,final int maximum){

        Random rand = new Random();
        return rand.nextInt(1 +maximum - minimum) + minimum;
    }

    //**Gets 1d Array from console */
    static int[] Prompt_Array(Scanner Console){
            System.out.println("\nProvide the array size:");
                final int SIZE = Console.nextInt();
        
            int[] arr = new int[SIZE]; 
            
            System.out.println("Provide the array elements:");
        
            for (int i=0;i<SIZE;i++)
                arr[i] = Console.nextInt();

            return arr;
    }

    /** Gets 2d array from Console */
    static int[][] Prompt_Array2d(Scanner Console){
        System.out.println("\nProvide the array Rows:");
            final int ROW = Console.nextInt();

        System.out.println("Provide the array Columns:");
            final int COLUMN = Console.nextInt();
    
        int[][] arr = new int[ROW][COLUMN]; 
        
        System.out.println("\nProvide the array elements:");
        for (int row = 0 ; row< ROW;row++){
            for (int column = 0;column<COLUMN;column++){
                //System.out.printf("array[%d][%d]: ",row,column);
                arr[row][column] = Console.nextInt();
            }
            System.out.println();
        }
        return arr;
    }  
}
