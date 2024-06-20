import java.util.InputMismatchException;
import java.util.Scanner;
public class Lab5_Exercise1_Client {
    public static void main(String[] args) {
        //Testing Class 1
        Class_1 C1 = new Class_1();
        Class_2 C2 = new Class_2();
        Scanner Console = new Scanner(System.in);

        System.out.print("Class_1.print()): \t"); 
                C1.print();
        
        System.out.println();
        System.out.print("Class_1.toString()): \t");
            System.out.println(C1.toString());
        
        System.out.print("Changing Class_1 values with Class_1.set(): \t");
        {
            boolean bad_input = true;

            while(bad_input){
                try {
                    C1.set(
                        Console.nextInt(),
                        Console.nextInt()
                    );            
                }catch (InputMismatchException e){
                    System.out.println("NUMBERS ONLY: ");

                    Console.nextLine();
                    continue;
                }
            bad_input = false;
            }
        }
   
        System.out.printf(
            "Class_1.set(%d,%d) " +
            "\nNew Class_1.toString():\t %s" ,

            C1.getX(),
            C1.getY(),
            C1.toString()
        );
        
        Test_Equals(C1,Console);


        //Testing Class 2
        System.out.println("\nTesting Class 2");
        System.out.print("Class_2.print()): \t"); 
                C2.print();
        
        System.out.println();
        System.out.print("Class_2.toString()): \t");
            System.out.println(C2.toString());
        
       
        System.out.print("Changing Class_2 values with Class_2.set(): \t");
        {
            boolean bad_input = true;

            while(bad_input){
                try {
                    C2.set( 
                        Console.nextInt(),
                        Console.nextInt(),
                        Console.nextInt()
                    );
                }catch (InputMismatchException e){
                    System.out.println("NUMBERS ONLY: ");
                    Console.nextLine();
                    continue;
                }
                bad_input = false;
            }
        }

        System.out.printf(
            "Class_2.set(%d,%d,%d) " +
            "\nNew Class_2.toString():\t %s" ,

            C2.getX(),
            C2.getY(),
            C2.getZ(),
            C2.toString()
        );
        
        Test_Equals(C2,Console);
        Console.close();
    }



    static void Test_Equals(Class_1 E1, Scanner Console) {
        System.out.println("\nTesting Equals for Class_1");

        Class_1 E2 = new Class_1();
        try {
            System.out.println("Create Class_1 object to compare to :\t(" + E1.toString() + ")");
            E2 = new Class_1(
                Console.nextInt(),
                Console.nextInt()
            );

        }
        catch (InputMismatchException e){
            System.out.println("NUMBERS ONLY: ");
            Console.nextLine(); 
            Test_Equals(E1, Console);
        }
    
        System.out.printf(
            "(%s).equals(%s): %b",
            E1.toString(),
            E2.toString(),
            E1.equals(E2)
        );

        System.out.println();
        
    }

    static void Test_Equals(Class_2 E1, Scanner Console) {
        System.out.println("\nTesting Equals for Class_2");
        Class_2 E2 = new Class_2();
        try {
            System.out.println("Create Class_2 object to compare to :\t(" + E1.toString() + ")");
            E2 = new Class_2(
                Console.nextInt(),
                Console.nextInt(),
                Console.nextInt()
            );
        }
        catch (InputMismatchException e){
            System.out.println("NUMBERS ONLY: ");
            Console.nextLine(); 
            Test_Equals(E1, Console);
        }
        System.out.printf(
            "(%s).equals(%s): %b",
            E1.toString(),
            E2.toString(),
            E1.equals(E2)
        );
        System.out.println();
    }
}
