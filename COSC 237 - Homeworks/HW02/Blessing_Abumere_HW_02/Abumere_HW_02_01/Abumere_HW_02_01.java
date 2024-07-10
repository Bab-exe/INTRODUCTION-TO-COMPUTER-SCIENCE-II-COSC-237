import java.util.Scanner;
public class Abumere_HW_02_01 {

    /**menu:  options for
the methods implemented and an option to exit. Your program should loop until the user
chooses to exit. */
    static int menu(Scanner Console){  

        int option ;
        System.out.printf("\n%s\n%s",
    "Your options for Complex arithmetic are:", 
            "----------------------------------------"
        );
        System.out.printf("\n\t%s \n\t%s \n\t%s \n\t%s \n\t%s \n\t%s \n\t%s \n\t%s ",
    "1) Add 2 complex numbers",
            "2) Subtract 2 complex numbers",
            "3) Multiply 2 complex numbers",
            "4) Divide 2 complex numbers",
            "5) Absolute value of a complex number",
            "6) Compare 2 complex numbers",
            "0) EXIT",
            "\nPlease enter your option:"
        ); 
        try {
            option = Console.nextInt();
        }catch(java.util.InputMismatchException e){
            System.err.println("Input must be a number");
            Console.nextLine();
            return menu(Console);  
        }
            
        return option;
            
    }
    
    public static void main(String[] args) {
        final Scanner Console = new Scanner(System.in);

        for (int command = 0, option = menu(Console); option != 0; option = menu(Console)){
            switch (option){
                case 1:
                    Display_Result(
                        ComplexNumber.read(Console),
                        ComplexNumber.read(Console),
                        operation.ADD
                    );
                    break;

                case 2:
                    Display_Result(
                        ComplexNumber.read(Console),
                        ComplexNumber.read(Console),
                        operation.SUBTRACT
                    );
                    break;

                case 3:
                    Display_Result(
                        ComplexNumber.read(Console),
                        ComplexNumber.read(Console),
                        operation.MULTIPLY
                    );
                    break;

                case 4:
                    Display_Result(
                        ComplexNumber.read(Console),
                        ComplexNumber.read(Console),
                        operation.DIVIDE
                    );
                    break;

                case 5:
                    Display_ABS(ComplexNumber.read(Console));
                    break;
                
                case 6:
                    Display_Result(
                        ComplexNumber.read(Console),
                        ComplexNumber.read(Console),
                        operation.EQUALS
                    );
                    break;

                default: 
                    System.err.println("Option " + option + " doesnt exist");
                    continue;
            }
            System.out.println("Command Number " + (command += 1) + " completed.");
        }
        
        System.out.println("Testing completed");
        Console.close();
        //TEST();
    }
    
   
    static void Display_Result(ComplexNumber n1,ComplexNumber n2, operation sign){
        final String OLD_N1 = n1.toString();
        final char SYMBOL;

        final String DISPLAY = "\nFirst Complex Number is: " + OLD_N1 + 
        "\nSecond Complex Number is: " + n2.toString() + '\n';
        
        switch(sign){
            case ADD:
                n1.add(n2);
                SYMBOL = '+';
                break;

            case SUBTRACT:
                n1.subtract(n2);
                SYMBOL = '-';
                break;

            case MULTIPLY:
                n1.multiply(n2);
                SYMBOL = '*';
                break;

            case DIVIDE:
                n1.divide(n2);
                SYMBOL = '/';
                break;

            case EQUALS:
            default: //default is EQUALS/compare 2 ;returns early because it doesnt need the Result: ...
                System.out.println(
                    DISPLAY + 
                    (n1.equals(n2) ? "The complex numbers ARE equal." : "The complex numbers are NOT equal.")
                );
                System.out.println();
                return;
        }
    
        
        System.out.printf(
            DISPLAY +
            "Result: %s  %c  %s  =  %s\n\n",
            
            OLD_N1,SYMBOL, n2.toString(),
            n1.toString()
        );
    }

    /** Absolute Value case */
    static void Display_ABS(ComplexNumber n1){
        System.out.println("\nThe complex number is: " + n1.toString() + "\n" + String.format("|%s| = %.2f",n1.toString(), n1.cAbs() ) ) ;
        
        
    }
    static void TEST(){
        /*subtraction tests      
        {
            System.out.print("Expecting (1.78, 4.50) - (3.56, 8.90) = (-1.78, -4.40)");
            Display_Result(
                new ComplexNumber(1.78,4.5),
                new ComplexNumber(3.56,8.90),
                operation.SUBTRACT
            );
            
            System.out.print("Expecting (3.40, 5.60) - (1.23, 2.56) = (2.17, 3.04)");
            Display_Result(
                new ComplexNumber(3.40,5.60),
                new ComplexNumber(1.23,2.56),
                operation.SUBTRACT
            );
        }   
        */

        /*Division tests
        {
            System.out.print("Expecting (11.20, 22.10) / (1.45, 3.56) = (6.42, -0.53)");
            Display_Result(
                new ComplexNumber(11.20,22.10),
                new ComplexNumber(1.45,3.56),
                operation.DIVIDE
            );


        }
        */

        /*multiply tests
        {
            System.out.print("Expecting (2.22, 3.33) * (1.24, 2.45) = (-5.41, 9.57)");
            Display_Result(
                new ComplexNumber(2.22,3.33),
                new ComplexNumber(1.24,2.45),
                operation.MULTIPLY
            );
        }
        */

        /*equals tests
        {
            Display_Result(new ComplexNumber(), new ComplexNumber(), operation.EQUAL);
            Display_Result(new ComplexNumber(1,2), new ComplexNumber(1,3), operation.EQUAL);
        }
        */

        /*absolute value tests
        {
            
            System.out.print("Expecting |(11.10, 22.20)| = 24.82");
            Display_Result(new ComplexNumber(11.10,22.20));
        }
            */

        
    }
    
}
