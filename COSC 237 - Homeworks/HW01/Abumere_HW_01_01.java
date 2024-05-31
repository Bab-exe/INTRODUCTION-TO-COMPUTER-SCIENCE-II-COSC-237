import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

//Blessing Abumere
class Abumere_HW_01_02{

    /** Generate: Generate a matrix with values 1 - 10 */
    public static int[][] Generate(final int SIZE){
        Random rand_obj = new Random();
        int[][] output = new int[SIZE][SIZE];

        for (int r = 0 ; r < SIZE;r++)
            for (int c = 0; c< SIZE;c++)
                output[r][c] = random(1,10,rand_obj);

        return output;
    }
    
    /**1. add two matrices */
    public static void Addition(Scanner Console){
        System.out.print("\nEnter the size of square matrices: \t");
            final int SIZE = Console.nextInt();

        int[][] matrix1 = Generate(SIZE);
        int[][] matrix2 = Generate(SIZE);

        int[][] result = new int[SIZE][SIZE];


        //show 1 and 2 matrices
        print2d(matrix1,matrix2);


        for (int r = 0; r < SIZE;r++)
            for (int c = 0; c < SIZE;c++)
                result[r][c] = matrix1[r][c] + matrix2[r][c];

        
        
        System.out.println("\nThe resulting matrix is:");
            print2d(result);
        


        System.out.println("\n\tCommand number 1 completed.");


        Console.nextLine();
    }

    /**2. subtract two matrices */
    public static void Subtraction(Scanner Console){
        System.out.print("\nEnter the size of square matrices: \t");
            final int SIZE = Console.nextInt();

        int[][] matrix1 = Generate(SIZE);
        int[][] matrix2 = Generate(SIZE);

        int[][] result = new int[SIZE][SIZE];


        // show 1 and 2 matrices
        print2d(matrix1,matrix2);

        //subtract
        for (int r = 0; r < SIZE;r++)
            for (int c = 0; c < SIZE;c++)
                result[r][c] = matrix1[r][c] - matrix2[r][c];

        System.out.println("\nThe resulting matrix is:");
            print2d(result);

        System.out.println("\n\tCommand number 2 completed.");
    }

    /** 3. Multiply two matrices */
    public static void Multiply(Scanner Console){
        System.out.print("\nEnter the size of square matrices: \t");
            final int SIZE = Console.nextInt();

        /* testcase
        int[][] matrix1 = {
            {6 ,9 ,10},
            {4 ,7 ,8},
            {10 ,8 ,7}
        };

        int[][] matrix2 = {
            {4 ,10 ,6},
            {3 ,8 ,4},
            {8 ,2 ,5}
        };
        */
        
        int[][] matrix1 = Generate(SIZE);
        int[][] matrix2 = Generate(SIZE);

        int[][] result = new int[SIZE][SIZE];

        //show 1 and 2 matrices
        print2d(matrix1,matrix2);

        //multiply formula : c00 = a00 * b00 += a01 * b10 += a02 * b20 
        for (int i = 0; i< SIZE; i++)
            for (int r = 0; r <SIZE ; r++)
                for (int c = 0 ; c< SIZE; c++)
                    result[r][c] += matrix1[r][i] * matrix2[i][c];
                
            
        

        System.out.println("\nThe resulting matrix is:");
            print2d(result);

        System.out.println("\n\tCommand number 3 completed.");
    }
    /** 4. Multiply by a constant */
    public static void Multiply_K(Scanner Console){
        System.out.print("\nEnter the size of square matrices: \t");
            final int SIZE = Console.nextInt();

        System.out.print("Enter the multiplication Constant: \t");
            final int K = Console.nextInt();


        int[][] result = new int[SIZE][SIZE]; 
    
        int[][] matrix1 = Generate(SIZE);

        System.out.println("The matrix is:");
            print2d(matrix1);

        for (int r = 0; r < SIZE;r++)
            for (int c = 0; c < SIZE;c++)
                result[r][c] = matrix1[r][c] * K;

        System.out.printf("\nThe matrix multiplied by %d is:\n",K);
            print2d(result);

        System.out.println("\n\tCommand number 4 completed.");
    }

    /** 5. Transpose a matrix  */
    public static void Transposition(Scanner Console){
        System.out.print("\nEnter the size of square matrices: \t");
            final int SIZE = Console.nextInt();
    
        /*testcase   
        int[][] matrix1 = {
            {4 ,9 ,4 ,3 ,7 ,2 ,6},
            {2 ,2 ,10 ,6 ,3 ,9 ,9},
            {7 ,4 ,2 ,8 ,9 ,9 ,2},
            {9 ,1 ,7 ,5 ,10 ,10 ,5},
            {8 ,6 ,8 ,7 ,7 ,1 ,8},
            {3 ,2 ,9 ,8 ,10 ,6 ,2},
            {6 ,10 ,6 ,10 ,6 ,6 ,5}
        };
        */
        int[][] matrix1 = Generate(SIZE);
        int[][] result = new int[SIZE][SIZE];

        System.out.println("The matrix is:");
            print2d(matrix1);

        for (int r = 0; r < SIZE;r++)
            for (int c = 0; c < SIZE;c++)
                result[r][c] = matrix1[c][r];

        System.out.println("The transposed matrix is:");
            print2d(result);

        System.out.println("\n\tCommand number 5 completed.");
    }

    /** 6. Matrix Trace: sum of left diagonal */
    public static void Trace(Scanner Console){
        System.out.print("\nEnter the size of square matrices: \t");
            final int SIZE = Console.nextInt();

        int[][] matrix1 = Generate(SIZE);

        /*testcase
        int[][] matrix1 = {
            {2 ,2 ,5 ,9, 4},
            {7, 3, 1, 5, 4},
            {8, 9, 10, 4, 4},
            {4, 6, 10, 4, 8},
            {6, 10, 10, 9, 8}
        };
        */
        int result = 0;

        System.out.println("The matrix is:");
            print2d(matrix1);

        //left diagonal only
        for (int l = 0; l < SIZE; l++){
            result += matrix1[l][l];
        }

        System.out.println("The trace of the matrix is: " + result);

        System.out.println("\n\tCommand number 6 completed.");
    }
    
    /**menu: lists the options for matrix operations for which you designed the previous functions,
and an option to exit the program. */
    public static void menu(){  
        System.out.printf("\n%s\n%s",
    "Your options are:", 
            "-----------------"
        );
        System.out.printf("\n\t%s\n\t%s\n\t%s\n\t%s\n\t%s\n\t%s",
            "1) Add 2 matrices" ,
            "2) Subtract 2 matrices" ,
            "3) Multiply 2 matrices" ,
            "4) Multiply matrix by a constant" ,
            "5) Transpose matrix" ,
            "6) Matrix trace" ,
            "0) EXIT"
        );         
    }

    public static void main(String[] args){
        Scanner Console = new Scanner(System.in);

        boolean exit = false;
        int input_option;

        do {
            menu();
            
            //redos when exception caugh t and if exit is not true
            try {
                System.out.print("\nPlease Enter Your Option: \t");
                input_option = Console.nextInt(); 
              
                switch (input_option){
                    case 0: exit = true;
                    break;

                    case 1: Addition(Console);
                    break;

                    case 2: Subtraction(Console);
                    break;

                    case 3: Multiply(Console); //checked
                    break;

                    case 4: Multiply_K(Console);
                    break;

                    case 5: Transposition(Console); //checked
                    break;

                    case 6: Trace(Console); //checked
                    break;

                    default: throw new IllegalArgumentException("\nThere is no Option " + input_option);
                }
            }catch(InputMismatchException e) {
                System.out.println("Invalid input. Input must be a number.");
                continue;
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
                continue;
            }
        } 
        while (!exit);
        
        
        System.out.println("\nTesting completed.");
        Console.close();
    }


    /** random number with object parameter for looping */
    static int random(final int minimum,final int maximum,Random rand){
        return rand.nextInt(1 +maximum - minimum) + minimum;
    }

    /** prints 2 matrices and identifies each */
    static void print2d(int[][] matrix1,int[][] matrix2){
        System.out.println("First matrix is:");
            print2d(matrix1);

        System.out.println("Second matrix is:");
            print2d(matrix2);
    }

    /** prints a 2d int array */
    static void print2d(int[][] arr){
        for (int arr1d[]: arr){
            for (int a: arr1d)
                System.out.printf("%d\t",a);     
            
            System.out.println();
        }
    }
}