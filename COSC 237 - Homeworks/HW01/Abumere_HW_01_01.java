import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

//Blessing Abumere
class HW1{

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

        result = arithmatic(matrix1,matrix2,'+');
        
        System.out.println("\nThe resulting matrix is:");
            print2d(result);
        


        System.out.println("\n\tCommand number 1 completed.");


        Console.nextLine();
    }

    //2. subtract two matrices
    public static void Subtraction(Scanner Console){
        System.out.print("\nEnter the size of square matrices: \t");
            final int SIZE = Console.nextInt();

        int[][] matrix1 = Generate(SIZE);
        int[][] matrix2 = Generate(SIZE);

        int[][] result = new int[SIZE][SIZE];


        // show 1 and 2 matrices
        print2d(matrix1,matrix2);


        
        result = arithmatic(matrix1,matrix2,'-');

        System.out.println("\nThe resulting matrix is:");
            print2d(result);

        System.out.println("\n\tCommand number 2 completed.");

    }





    
    /**lists the options for matrix operations for which you designed the previous functions,
and an option to exit the program. */
    public static void menu(){  
        System.out.printf("\n%s2\n%s",
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
            
            //when illegal redo the loop
            try {
                System.out.print("\nPlease Enter Your Option: \t");
                input_option = Console.nextInt(); 
            }
            catch(InputMismatchException e) {continue;}
               
                 
            switch (input_option){
                case 0: exit = true;
                break;

                case 1: Addition(Console);
                break;

                case 2: Subtraction(Console);
                break;

                case 3: 
                break;


                default: continue;
            }
        } 
        while (!exit);
        
     
        
        Console.close();
    }



    static int random(final int minimum,final int maximum,Random rand){
        return rand.nextInt(1 +maximum - minimum) + minimum;
    }


    //for matrix addition, subtraction, multiplication
    static int[][] arithmatic(int[][] m1,int[][] m2,char operation){

        final int SIZE = m1.length;
        int[][] result = new int[SIZE][SIZE];

        for (int row = 0; row < SIZE;row++)
            for (int col = 0; col< SIZE; col++)
                result[row][col] = arithmatic(m1[row][col],m2[row][col],operation);

        return result;
    }
    static int arithmatic(int val1, int val2,char operation){
        switch (operation)
        {
              case '+': return val1 + val2;
              case '-': return val1 - val2;
              case '*': return val1 * val2;

              default: throw new IllegalArgumentException(operation + " operation doesnt exist");
         }
    }

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