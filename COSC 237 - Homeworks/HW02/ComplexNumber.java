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

    
    public double a,bi;

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





    
    //A method to read a complex number. Look at the sample output screen for the design required.
    


    /**A method to print a complex number as (a, b). Have 2 decimals for both.*/
    public void print(){
        System.out.printf("(%f, %f)",a,bi );
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
        this.bi = this.bi * n.bi - this.a * n.a;
        this.a = this.a * n.a + this.bi * n.bi;
    }

    /** (a, b) / (c, d) = ((a * c + b * d)/(c^2 + d^2), (b * c - a * d)/(c^2 + d^2)) */
    public void divide(ComplexNumber n){
        this.a = ((this.a * n.a) + (this.bi * n.bi)) / ((n.a * n.a) + (n.bi * n.bi)); 

        this.bi = ((this.bi * n.a) - (this.a * n.bi)) / ((n.a * n.a) + (n.bi * n.bi));
    }

    /**A method called cAbs to implement the absolute value of a complex number.
     * |(a, b)| = sqrt(a^2 + b^2) */
    public void cAbs(){

        //sqrt(a^2) + sqrt(b^2) != sqrt(a^2 + b^2)

        
        



    }

    //To test your class write a client that has at least a function menu() with options for the methods implemented and an option to exit. Your program should loop until the user chooses to exit. In this loop you are required to use a switch statement for all possible cases (similar design as the one used for Problem#1 in Assignment#1). */
}
