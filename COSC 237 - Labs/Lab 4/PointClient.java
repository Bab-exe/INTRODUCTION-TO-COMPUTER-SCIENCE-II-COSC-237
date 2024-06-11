import java.util.InputMismatchException;
import java.util.Scanner;
//lab 4 assignment 
/** ask: Create a client for the Point class. Be very thorough with your testing (including invalid input) and have
output similar to the sample output below:
 
­­­After declaration, constructors invoked­­­ Using toString():
First point is (0, 0)
Second point is (7, 13)
Third point is (7, 15)

Second point (7, 13) lines up vertically with third point (7, 15)
Second point (7, 13) doesn't line up horizontally with third point (7, 15)

Enter the x­coordinate for first point: retgre
Not an integer! Try again! Enter the x­coordinate for first point: 89.67
Not an integer! Try again! Enter the x­coordinate for first point: ­13
ERROR! Should be positive. Enter the x­coordinate for first point: 15
Enter the y­coordinate for first point: fwgfe
Not an integer! Try again! Enter the y­coordinate for first point: 90.6
Not an integer! Try again! Enter the y­coordinate for first point: ­32
ERROR! Should be positive. Enter the y­coordinate for first point: b
Not an integer! Try again! Enter the y­coordinate for first point: 23
First point (after call to set) is (15, 23)
Distance from origin for first point =  27.46
Distance from origin for second point =  14.76
Distance between first point and second point =  12.81
First point (after call to translate (5, 10)) is (20, 33)
Second point (after call to translate (15, 5)) is (22, 18)
­­­Call to equals: The 2 points are NOT equal.
­­­Calls to copy and print­­­ 
First point (after call to copy) is (20, 33)
Second point (after call to copy) is (20, 33)
­­­Call to equals after call to copy: The 2 points are equal. */
public class PointClient {
    public static void main (String[] args){

        Point p1 = new Point();
        Point p2 = new Point(7,13);
        Point p3 = new Point(7,15);
        

        //display
        System.out.println(
            "First point is " + p1 +
            "\nSecond point is " + p2 +
            "\nThird point is " + p3 
        );
        
        //lines up vertically & horizontally
        System.out.println(
            "\nSecond point " + p2 + 
            ((p2.isVertical(p3)) ? " lines up vertically with third point " : " DOES NOT line up vertically with third point ") +
            p3
        );

        System.out.println(
            "Second point " + p2 + 
            ((p2.isHorizontal(p3)) ? " lines up horizontally with third point " : " DOES NOT line up horizontally with third point ") +
            p3
        );

        
        //for the call to set;
        {
            Scanner input = new Scanner(System.in);
            boolean bad_x = true, bad_y = true;
            

            while(bad_x || bad_y){
                try {
                    if (bad_x){
                        System.out.print("Enter the x-coordinate for first point: "); 
                            p1.setX(input.nextInt());

                        bad_x = false;
                    }

                    if (bad_y){
                        System.out.print("Enter the y-coordinate for first point: ");
                            p1.setY(input.nextInt());
                        bad_y = false;
                    }   
                }catch(InputMismatchException e){
                    input.nextLine(); //needed for some reason; does weird stuff if not added
    
                    System.out.print("Not an integer! Try again! ");
                }catch(IllegalArgumentException e){
                    System.out.print(e.getMessage() + " \t");
                }
    
                
            }
            input.close();
        }
           
        System.out.println("\nFirst point (after call to set) is: " + p1);

        //DISTANCE part
        System.out.printf(
            "Distance from origin for first point = %.2f" +
            "\nDistance from origin for second point = %.2f" + 
            "\nDistance between first point and second point = %.2f",

            p1.distanceFromOrigin(),
            p2.distanceFromOrigin(),
            p1.distance(p2)
        );

        
        ///TRANSLATE pART
        p1.translate(5, 10);
        p2.translate(15,5);
        System.out.println(
            "\n\nFirst point (after call to translate (5, 10)) is " +  p1 +
            "\nSecond point (after call to translate (15, 5)) is " + p2
        );

        ///EQUALS
        System.out.println(
            "The 2 points are " + 
            (p1.equals(p2) ? "equal." : "NOT equal.")
        );


        ///CALLs TO COPY & print

        p2.copy(p1);
        

        System.out.print("\nFirst point (after call to copy) is ");
            p1.print();

        System.out.print("\nSecond point (after call to copy) is ");
            p2.print();

        ///EQUALS pasted
        System.out.println(
            "\nThe 2 points are " + 
            (p1.equals(p2) ? "equal." : "NOT equal.")
        );
    }
    


    
    
}
