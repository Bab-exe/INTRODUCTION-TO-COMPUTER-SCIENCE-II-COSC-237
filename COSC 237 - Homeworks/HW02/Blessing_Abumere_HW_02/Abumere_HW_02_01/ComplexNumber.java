package Abumere_HW_02_01;

/* 
A complex ("imaginary") number has the form a + bi, where a is called
the real part, b is called the imaginary part, and i = sqrt(-1). A complex number a + bi
can be expressed as the ordered pair of real numbers (a, b).
Arithmetic operations on two complex numbers (a, b) and (c, d) are as follows:
Addition: (a, b) + (c, d) = (a + c, b + d)
Subtraction: (a, b) - (c, d) = (a - c, b - d)
Multiplication: (a, b) * (c, d) = (a * c - b * d, a * d + b * c)
Division: (a, b) / (c, d) = ((a * c + b * d)/(c2 + d2), (b * c - a * d)/(c2 + d2))
Absolute value: |(a, b)| = sqrt(a2 + b2)
 */

 
public class ComplexNumber {

    private double a,bi;

    /**Constructors for default and explicit initialization. */
    public ComplexNumber(double a, double bi) {
        this.a = a;
        this.bi = bi;
    }
    /**default 1+1i */
    public ComplexNumber(){
        this.a = 1;
        this.bi = 1;
    }

    //guessing read is for user input
    public static ComplexNumber read(java.util.Scanner Console){
        boolean complete = false; 
        ComplexNumber output = new ComplexNumber();
        
        while(!complete){
            try {
                System.out.print("Enter complex number (real imaginary):\t");
                    output.setReal(Console.nextDouble());
                    output.setImaginary( Console.nextDouble());
                    complete = true;
            }catch(java.util.InputMismatchException e){
                
                System.err.println("Input must be a number");
                Console.nextLine();
            }
        }
        return output;
    }
    
    //get
    public double getReal(){
        return this.a;
    }

    public double getImaginary(){
        return this.bi;
    }

    //set
    public void setReal(double a){
        this.a = a;
    }
    public void setImaginary(double b){
        this.bi = b;
    }

    //A method to read a complex number. Look at the sample output screen for the design required.
    
    /**A method to print a complex number as (a, b). Have 2 decimals for both.*/
    public void print(){
        System.out.print(this.toString());
    }

    //A method called getReal that returns the real part of a complex number.
    //A method called getImaginary that returns the imaginary part of a complex number.
    //Methods equal, copy, getCopy, toString.
    //Arithmetic methods to add, subtract, multiply, and divide two complex numbers.
    /**(a, b) + (c, d) = (a + c, b + d) */
    public void add(ComplexNumber n){
        this.bi = this.bi + n.bi;
        this.a = this.a + n.a;
    }

    /** (a, b) - (c, d) = (a - c, b - d) */
    public void subtract(ComplexNumber n){
        

        this.bi = this.bi - n.bi;
        this.a = this.a - n.a;

        
    }

    /** (a, b) * (c, d) = (a * c - b * d, a * d + b * c)*/
    public void multiply(ComplexNumber n){
        final double a = this.a;
        final double b = this.bi;
        final double c = n.a;
        final double d = n.bi;


        this.a = a*c - b*d;
        this.bi = a*d + b*c;
    }

    /** (a, b) / (c, d) = ((a * c + b * d)/(c^2 + d^2), (b * c - a * d)/(c^2 + d^2)) */
    public void divide(ComplexNumber n){

        final double a = this.a;
        final double b = this.bi;
        final double c = n.a;
        final double d = n.bi; 

        //divide by zero might be a problem
        this.a = (a * c + b * d)/(c*c + d*d);
        this.bi = (b * c - a * d)/(c*c + d*d);

    }

    
    
    /**A method called cAbs to implement the absolute value of a complex number.
     * |(a, b)| = sqrt(a^2 + b^2) */
    public double cAbs(){
        //sqrt(a^2) + sqrt(b^2) != sqrt(a^2 + b^2)
        return Math.sqrt(a*a + bi*bi);
        
    }

    @Override
    public String toString(){
        return String.format(
            "(%.2f, %.2f)", this.a, this.bi
        );
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof ComplexNumber){
            ComplexNumber other = (ComplexNumber) obj;

            return (
                this.a == other.a &&
                this.bi == other.bi
            );
        }

        return false;
    }

    public ComplexNumber getCopy(){
        return new ComplexNumber(this.a, this.bi);
    }
    public void copy(ComplexNumber from){
        this.a = from.a;
        this.bi = from.bi;

    }
    //To test your class write a client that has at least a function menu() with options for the methods implemented and an option to exit. Your program should loop until the user chooses to exit. In this loop you are required to use a switch statement for all possible cases (similar design as the one used for Problem#1 in Assignment#1). */
}
