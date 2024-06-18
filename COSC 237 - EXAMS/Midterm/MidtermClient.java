/** Blessing Abumere 0780311 
 * Odd exam code so 
 * Exam code ONE
    Write Java code for the following classes and interfaces
1. [(2x)10] Interfaces StoreRentals and OnlineRentals
2. [(2x)10] Abstract classes PhysicalItems and DigitalItems.
3. [25] Exam code ONE: The Book class.
Exam code TWO: The DVD class.
4. [25] Exam code ONE: The DigitalMovie class.
Exam code TWO: The Software class.
5. [10pts] A client to test your objects similar to the sample client given in the sample midterm exam.
In any class, make sure you you write code for
+ The class header/definition
+ The default and alternative constructors
+ Getter and setter functions
+ Other required methods (e.g., toString(), equals(Object obj) ), and functions required by the abstract classes or
interfaces.
Reuse the code as much as you can (i.e., call functions in the super class if possible). You can add any extra method/variable if you
deem nessesary. Note: function toString() in any class should print out all variables in that class separated by a comma, e.g.,
“phyID = <phyID>, storeID = <storeID>, ...”
 */

public class MidtermClient {

    public static void main(String[] args) {
    
        Test_Book(new Book());

        System.out.println();
        Test_DigitalMovie(new DigitalMovie(

        ));

       
        
    }

    /** Book extends PhysicalItems which implements StoreRentals, OnlineRentals */
    static void Test_Book(Book book){
        //book tests
        System.out.println("Testing: " + book.getClass());
        System.out.println(book.toString());

        

        //PhysicalItems Tests
        System.out.println("-Physical Items-");
        book.printDueDate();
        book.printDueDateReminder();

        //OnlineRentals Tests
        System.out.println("--Online Rental--");
        book.printOnlineReceipt(1);
        book.checkOnlineAvailability(1);

        //StoreRentals Tests
        System.out.println("--Store Rental--");
        book.checkStoreAvailability(2);
        book.printStoreReceipt(2);
        
    }

    /** digital movie extends DigitalItems which implements OnlineRentals */
    static void Test_DigitalMovie(DigitalMovie digitalMovie){
        //digitalMovie tests
        System.out.println("Testing: " + digitalMovie.getClass());
        System.out.println(digitalMovie.toString());
        

        //DigitalItems Tests
        System.out.println("-Digital Items-");
        digitalMovie.printDueDate();
        digitalMovie.printDueDateReminder();

        //OnlineRentals Tests
        System.out.println("--Online Rental--");
        digitalMovie.printOnlineReceipt(3);
        digitalMovie.checkOnlineAvailability(3);
    }
}
