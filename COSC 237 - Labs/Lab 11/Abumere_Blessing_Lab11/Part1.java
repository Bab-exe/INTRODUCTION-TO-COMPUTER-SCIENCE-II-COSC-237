//Lab 11 Part 1

public class Part1 {

    /** Exercise 1 
    static int f(int n) {
        // will make f(3) = 10
        return (n <= 0) ? 1 : f(n - 1) + 3;
    }
*/
    // Exercise 2: f(73) = 3
  
    // Exercise 3: all will output 3 but 3.3 will output 3 \n 3
    // 3.1 f(123) = 3
    

    // 3.2 f(123) = 3
    
    // 3.3 f(123) = 3 \n 3
    
    /**
     * Exercise 4: All calls are good calls
     *
     * 1. (constraints) when the number is negative it will return the negative
     * number + 1
     * otherwise it starts at 8 and adds 4 each time and will always return a
     * multiple of 4
     * 
     * 2. f(7) return 32
     * 
     * 3. f(0) is the base case and returns 0
     * 
     * 4. f(-5) will return -4
     * 
     */
    
    /**
     * Exercise 5
     * a) the base case is when base is bigger than limit or when they are equal
     * b) the recursive case is when base is less than or equal to limit
     * c)
     * f(14,10) = 1
     * f(4,7) = 120
     * f(0,0) = 1
     */
    
    /** Exercise 6 outputs
     * DDCEBF
     */

   /* Exercise 7 
    * 1. a problem with this method is that everything eventually returns 1 
    * 2.
    * f(7) = 17 calls 
    * f(8) = 4 calls
    * f(15) = 18 calls
    * f(16) = 5 calls
   */

   /** Exercise 8 
    * f(3) = 32
   */
  

   /** Exercise 9 
    * f(36,16) = 4
   */

   /* Excerise 10 
    * f(1) = 17
   */

    /* Exercise 11
    * The calls f(0), f(5), f(10), and f(­5) will always be empty
    */
    public static void f(int x) {
        if(x > 0 && x < 10){
        System.out.print(x + " ");
        f(x + 1);
        }
    }

    /* Exercise 12
     * f(5, 10) = 15
     * and f(3,9) = 6  
     */

     /* Excerise 13 
      * f(7, 10) = 7
      * f(16, 2) = 0
      * f(15, 9) = 6
      * f(27, 4) = 3  
      * f(59,10) = 9
      It keeps subtracting x by y until y is bigger than x
     */

     /* Exercise 14 
      * f(7) outputs
      * 1 3 7
     */
  


    
    public static void main(String[] args) {   
            
    }

    

}
