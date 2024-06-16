import java.util.Arrays; //for testing
import java.util.InputMismatchException;
import java.util.Scanner;



public class Abumere_HW_01_02 {
    
    /**makes a 2d array that is equal from all straight lines; this means all diagonals and all corners = whatever the sum is 
     * @param N size of the square
     * @return MAGIC SQUARE / 2d array / matrix
     * @throws IllegalArgumentException if N isnt odd even or isnt positive
    */
    static int[][] Magic_Square(final int N){
        if (N % 2 == 0 || N <= 0) throw new IllegalArgumentException("INPUT ERROR!!! Invalid size.");

        int[][] output = new int[N][N];
        

        
        //First, place 1 in the middle of the top row. 
        int i = 0;
        int j = N/2;
        
        int k = 0; 

            k = k + 1;
        output[i][j] = k;

        
        int I,J; // big letters = calculated vals
        for (int count = 1; count < N * N; count++) {

            //will never be bigger than N
            I = (i - 1 + N) % N; 
            J = (j + 1) % N; 

            //only empty really matters
            if (output[I][J] == 0) {
                i = I; 
                j = J;
            } else {
                i = (i + 1) % N;  
            }

            k = k + 1; 
            output[i][j] = k;
        }
        
        return output;
    }


    public static void main(String[] args){
        Scanner Console = new Scanner(System.in);
        
    /* 
    //testing stuff
        {
            int[][] test3x3 = new int[][]{
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 2 }
            };
            int[][] test5x5 = new int[][]{
                {17,24,1,8,15},
                {23,5,7,14,16},
                {4,6,13,20,22},
                {10,12,19,21,3},
                {11,18,25,2,9}
            };
            int[][] test7x7 = new int[][]{
                {30,39,48,1,10,19,28},
                {38,47,7,9,18,27,29},
                {46,6,8,17,26,35,37},
                {5,14,16,25,34,36,45},
                {13,15,24,33,42,44,4},
                {21,23,32,41,43,3,12},
                {22,31,40,49,2,11,20}
            };
            
            final boolean T1x1 = Arrays.deepEquals(new int[][]{{1}},Magic_Square(1)); //1x1 ;free
            final boolean T3x3 = Arrays.deepEquals(test3x3, Magic_Square(3)) ;//3x3
            final boolean T5x5 = Arrays.deepEquals(test5x5, Magic_Square(5)) ;//5x5
            final boolean T7x7 = Arrays.deepEquals(test7x7, Magic_Square(7)) ;//7x7
            System.err.print(
                T1x1 && T3x3 && T5x5 && T7x7
                ? "ALL PASSED"  
                : "passed\n" + 
                    String.format(
                        "1x1: %b\n"
                        + "3x3: %b\n"
                        + "5x5: %b\n"
                        + "7x7: %b\n",
                        T1x1,
                        T3x3,
                        T5x5,
                        T7x7

                    ) 
            );
    
            
        }
        */
          
        System.out.println();

        char go_again = 'Y';
        while(go_again == 'Y' || go_again == 'y'){
            System.out.print("Enter the size of magic square (positive & odd): \t");
            try { 
                printMagicSquare(  Magic_Square( Console.nextInt() ) );
            }
            catch (InputMismatchException e){
                Console.nextLine();
                System.err.println("Size must be a number\n");
                continue;
            }
            catch (IllegalArgumentException e){ 
                System.err.println(e.getMessage() + "\n");
                continue;
            }
           
            System.out.print("\n\nDo you want to continue (Y/N): \t");
                go_again = Console.next().charAt(0);            
        }
        
        Console.close();
    }

    static String stringMagicSquare(int[][] arr){
        String output = "";
        final int N = arr.length;
        output += String.format("The magic square with size = %d is:\n",N);

        for (int arr1d[]: arr){
            for (int a: arr1d) {
                output += String.format("%d\t",a); 
            }
            output += "\n";
        }
        final double SUM = (N * ((N*N) + 1) / 2);
        output += String.format("The %dx%d magic square adds up to: \t%.0f",N,N, SUM);

        return output;
    }

    /** prints the magic square */
    static void printMagicSquare(int[][] ... arr3d){
        for (int arr2d[][] : arr3d){
            System.out.println(stringMagicSquare(arr2d));
            System.out.println();
        }
        
    }
}
