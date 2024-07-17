//Lab 11 Part 1

public class Lab01 {

    /** Exercise 1 */
    static int f(int n) {
        // will make f(3) = 10
        return (n <= 0) ? 1 : f(n - 1) + 3;
    }

    // Exercise 2: f(73) = 3
    public static void f2(int n) {
        if (n > 0) {
            f(n / 5);
            System.out.println(n % 5);
        }
    }

    // Exercise 3: all will output 3 but 3.3 will output 3 \n 3
    //3.1 f(123) = 3
    public static void f3_1(int n) {
        if (n != 0)
            f(n / 10);
        System.out.println(n % 10);
    }

    //3.2 f(123) = 3
    public static void f3_2(int n) {
        System.out.println(n % 10);
        if (n != 0)
            f(n / 10);
    }

    //3.3 f(123) = 3 \n 3
    public static void f3_3(int n) {
        System.out.println(n % 10);
        if (n != 0)
        f(n / 10);
        System.out.println(n % 10);
    }

    /**Exercise 4: All calls are good calls
     * 1. (constraints) when the number is negative it will return the negative number + 1
     * otherwise it starts at 8 and adds 4 each time and will always return a multiple of 4
     * 
     * 2. f(0) is the base case and returns 0 
     * 
     * 3. f(-5) will return -4
    */
    public static int f4(int num) {
        if(num == 0)
            return 0;
        else
            return num + f(num + 1);
    }

    public static void main(String[] args) {
        final int K = -5;
        System.out.print(f4(K));
        
    }
}
