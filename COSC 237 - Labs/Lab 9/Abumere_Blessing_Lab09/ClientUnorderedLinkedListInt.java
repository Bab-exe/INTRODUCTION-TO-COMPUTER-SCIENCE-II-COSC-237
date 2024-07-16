import java.util.Scanner;
import Part2.UnorderedLinkedListInt;

public class ClientUnorderedLinkedListInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UnorderedLinkedListInt intList = new UnorderedLinkedListInt();
        UnorderedLinkedListInt tempList = new UnorderedLinkedListInt();
        int num;
        System.out.println("Enter integers (999 to stop)");
        num = Input_Int(input);
        while (num != 999) {
            intList.insertLast((Integer) num);
            num = Input_Int(input);// valid??
        }
        System.out.print("\nTesting .insertLast and .print. The original list is:");
        intList.print();
        System.out.println("\nTesting .length. The length of the list is: " +
                intList.length());
        if (!intList.isEmptyList()) {
            System.out.println("Testing .front. First element/list: " +
                    intList.front());
            System.out.println("Testing .back. Last element/list: " +
                    intList.back());
        }
        System.out.println("Testing .sum. The sum of data in all nodes is: " +
                intList.findSum());
        System.out.println("Testing .min. The smallest data in all nodes is: " +
                intList.findMin());
        System.out.print("Testing .search. Enter the number to search for/list: ");
        num = Input_Int(input); // valid??
        if (intList.search(num))
            System.out.println(num + " found in this list.");
        else
            System.out.println(num + " is not in this list.");
        System.out.print("Testing .remove. Enter the number to be deleted from list:");
        num = Input_Int(input);// valid??
        intList.deleteNode(num);
        System.out.print("Testing .toString. After deleting " + num + ", the list is: " + intList);
        System.out.println("\nThe length of the list after delete is: " + intList.length());
        // Optional: add more testing here

        //equals method
        tempList.copy(intList);
        
        System.out.println("\ntesting .equals()");
        System.out.println(
            intList.toString() + "\n" + tempList.toString() + "\n" +
            ((intList.equals(tempList)) ? "The lists are equal" : "The lists are NOT equal")
        );

        tempList.insertLast(999);

        System.out.println(
            intList.toString() + "\n" + tempList.toString() + "\n" +
            ((intList.equals(tempList)) ? "The lists are equal" : "The lists are NOT equal")
        );

    } // add methods for input validation


    /** validates input and returns input */
    static int Input_Int(Scanner input) {

        boolean bad_input = true;
       
        int number=0;
        while(bad_input){
            try {
                number = input.nextInt();
                bad_input = false;
            } catch (java.util.InputMismatchException e) {
                System.err.println("Error: Please enter an integer." );
                input.nextLine();
            }catch (Exception e){
                System.err.println(e.getMessage());
                input.nextLine();
            }
        }

        return number;
    }

}

