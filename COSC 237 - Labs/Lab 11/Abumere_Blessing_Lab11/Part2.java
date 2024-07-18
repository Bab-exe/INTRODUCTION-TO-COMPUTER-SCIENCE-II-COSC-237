import java.util.Scanner;
import java.util.InputMismatchException;

public class Part2 {
    /** 1. A method to find the sum of digits in any integer (iterative method) */
    public static int Question1(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    /** 2. A method to find the sum of digits in any integer (recursive method)*/
    public static int Question2(int n) {
        if(n == 0) return 0;
        return n % 10 + Question2(n / 10);
    }
     
    /**3. A method to display a number in binary (iterative method) */
    public static void Question3(int n) {
        String binary = "";
        while(n > 0) {
            binary = n % 2 + binary;
            n /= 2;
        }
        System.out.println(binary);
    }


    /**4. A method to display a number in binary (recursive method)*/
    public static void Question4(int n) {
        if(n == 0) return;
        Question4(n / 2);
        System.out.print(n % 2);
    }

    /**5. A method to return the string representation of a number in any base (iterative method)*/
    public static String Question5(int n, int base) {
        String out = "";
        while(n > 0) {
            out = n % base + out;
            n /= base;
        }
        return out;
    }
    /**6. A method to return the string representation of a number in any base (recursive method)*/
    public static String Question6(int n, int base) {
        if(n == 0) return "";
        return Question6(n / base, base) + n % base;
    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        char choice = 'y';
        while(choice == 'y' || choice == 'Y') {
            int n = 0;
            while(true) {
                try {
                    System.out.print("Enter a positive integer: ");
                    n = input.nextInt();
                    if(n <= 0) throw new Exception("INVALID! Should be positive!");
                    break;
                } catch(InputMismatchException e) {
                    System.out.print("WRONG TYPE! Not a positive integer! REENTER: ");
                    input.nextLine();
                } catch(Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            int base = 0;
            while(true) {
                try {
                    System.out.print("Enter a positive integer for base: ");
                    base = input.nextInt();
                    if(base <= 0) throw new Exception("INVALID! Should be positive!");
                    break;
                } catch(InputMismatchException e) {
                    System.out.print("WRONG TYPE! Not a positive integer! REENTER: ");
                    input.nextLine();
                } catch(Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("Sum of digits for " + n + " is " + Question1(n) + " (iterative solution)");
            System.out.println("Sum of digits for " + n + " is " + Question2(n) + " (recursive solution)");
            System.out.print(n + " in binary code is ");
            Question3(n);
            System.out.print(n + " in binary code is ");
            Question4(n);
            System.out.println();
            System.out.println(n + " in base " + base + " is " + Question5(n, base) + " (iterative solution)");
            System.out.println(n + " in base " + base + " is " + Question6(n, base) + " (recursive solution)");
            System.out.print("Do you want to continue (y/Y): ");
            choice = input.next().charAt(0);
        }
        input.close();
        
        
    }
}
