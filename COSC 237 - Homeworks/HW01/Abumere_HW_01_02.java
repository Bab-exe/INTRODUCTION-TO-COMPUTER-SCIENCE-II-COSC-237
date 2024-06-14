import java.util.InputMismatchException;

import java.util.Scanner;

public class Abumere_HW_01_02 {
    
    //makes a 2d array that is equal from all straight lines; this means all diagonals and all corners = whatever the sum is 
    static int[][] Magic_Square(final int N){
        if (N % 2 == 0 || N <= 0) throw new IllegalArgumentException("INPUT ERROR!!! Invalid size.");

        int[][] output = new int[N][N];
        final int SUM = N * ((N * N) + 1) / 2;

        
        //First, place 1 in the middle of the top row. Then, after integer k has been placed, move up one row and one column to the right to place the next integer k + 1, unless one of the following occurs:

        output[0][N/2] = 1;

        final int EMPTY = 0;

        //1. If a move takes you above the top row in the jth column, move to the bottom of the jth column and place the integer k + 1 there.
        //2. If a move takes you outside to the right of the square in the ith row, place k + 1 in the ith row at the left side.
        //3. If a move takes you to an already filled square or if you move out of the square at the upper right-hand corner, place k + 1 immediately below k.

        int k = 1;
        for (int i = 0; i < N;i++){
            for (int j = 0; j < N;j++){
                // if case 1: above top row
                


                // if case 3: already filled square or out of square upper right corner;
                if (output[i][j] != EMPTY || i == N - 1 && j == N - 1)
                    output[i + 1][j] = k =+ 1;
                
                    
                

            }

        }
        //if (output[][] != EMPTY) continue; 
        

        
        return output;
    }


    public static void main(String[] args){
        Scanner Console = new Scanner(System.in);

        
        char go_again = 'Y';

        while(go_again == 'Y' || go_again == 'y'){

            System.out.print("Enter the size of magic square (positive & odd): \t");
            try { 
                print(  Magic_Square( 3 ) );

                //print(  Magic_Square( Console.nextInt() ) );
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


    

    /** prints the magic square */
    static void print(int[][] arr){
        final int N = arr.length;
        System.out.printf("The magic square with size = %d is:\n",N);

        for (int arr1d[]: arr){
            for (int a: arr1d) 
                System.out.printf("%d\t",a);     

            System.out.println();
        }
        
        System.out.printf("The %dx%d magic square adds up to: \t%d",N,N, (N * ((N*N) + 1) / 2));
    }
}
