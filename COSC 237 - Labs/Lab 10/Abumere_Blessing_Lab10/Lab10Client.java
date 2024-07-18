/**        PART1  
 * QUESTION 1 will output
    Initial stack is: 
    A B C D E F G H
    Final stack is:
    A B C E
    The queue is:
    E D D C
 
 * QUESTION 2 the mystery() method multiplies every value in the queue by 2
 
 *  QUESTION 3  will output
    Queue elem. = 0
    Queue elem. = 14
    Queue elem. = 22
    Queue is empty!
    Queue is empty!
    Stack elem. = 32
    Stack elements: 64 28 0 
    Queue elements: 30 
*/


import Stack.LinkedStackClass;
import Queue.QueueClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab10Client {
    
    /** 1.
     * Display the contents of a stack in reverse order (top to bottom),leaving the stack unchanged. */
    public static void printBackStack(LinkedStackClass<Integer> intStack) {
        LinkedStackClass<Integer> stack = new LinkedStackClass<Integer>();
        while (intStack.isEmptyStack() == false) {
            System.out.print(intStack.peek() + " ");
            stack.push(intStack.peek());
            intStack.pop();
        }
        while (stack.isEmptyStack() == false) {
            intStack.push(stack.peek());
            stack.pop();
        }

    }

    /** 2.  
     * Display the contents of a stack in direct order (bottom to top), leaving the stack unchanged.
     */
    public static void printStack(LinkedStackClass<Integer> STACK) {
        LinkedStackClass<Integer> stack = new LinkedStackClass<Integer>();
        
        while (STACK.isEmptyStack() == false) {
            stack.push(STACK.peek());
            STACK.pop();
        }

        while(stack.isEmptyStack() == false){
            System.out.print(stack.peek() + " ");
            STACK.push(stack.peek());
            stack.pop();
        }
        
    }

    /** 3. 
     * Find the second item in a stack, leaving the stack unchanged */
    public static Integer getSecond(LinkedStackClass<Integer> intStack) {
        final Integer first = intStack.peek();

        intStack.pop();

        if (intStack.isEmptyStack()) return null;

        final Integer second =  intStack.peek();

        intStack.push(first);
        
        return second;

    
    }

    /** 4. 
     *  Count the number of items in a stack, leaving the stack unchanged.*/
    public static int countItems(LinkedStackClass<Integer> intStack) {
        LinkedStackClass<Integer> stack = new LinkedStackClass<Integer>();
        int count = 0;
        while (intStack.isEmptyStack() == false) {
            stack.push(intStack.peek());
            intStack.pop();
            count++;
        }

        while (stack.isEmptyStack() == false) {
            intStack.push(stack.peek());
            stack.pop();
        }
        return count;
    }
        
    /** 5. 
     * Delete every occurrence of a specified item from a stack, leaving the order of the remaining items unchanged. */
    public static void removeItem(LinkedStackClass<Integer> intStack, Integer n) {
        LinkedStackClass<Integer> stack = new LinkedStackClass<Integer>();
        while(intStack.isEmptyStack() == false){
            if (intStack.peek() != n) 
                stack.push(intStack.peek());

            intStack.pop();
        }

        while (stack.isEmptyStack() == false) {
            intStack.push(stack.peek());
            stack.pop();
        }
    }
    /** 6.
     * Reverse a stack, using a queue. The original stack is lost. */
    public static void reverseStack(LinkedStackClass<Integer> STACK) {
        QueueClass<Integer> q = new QueueClass<Integer>();

        while (STACK.isEmptyStack() == false) {
            q.enqueue(STACK.peek());
            STACK.pop();
        }

        while (q.isEmptyQueue() == false) {
            STACK.push(q.front());
            q.dequeue();
        }
    
    }

    /** 7. 
     * Reverse a queue, using a stack. The original queue is lost. */
    public static void reverseQueue(QueueClass<Integer> QUEUE){
        LinkedStackClass<Integer> stack = new LinkedStackClass<Integer>();
        while (QUEUE.isEmptyQueue() == false) {
            stack.push(QUEUE.front());
            QUEUE.dequeue();
        }

        while (stack.isEmptyStack() == false) {
            QUEUE.enqueue(stack.peek());
            stack.pop();
        }
    }

    /** 8.
     * Display the contents of a queue in direct order, leaving the queue unchanged. */
    static void printQueue(QueueClass<Integer> queue) {
        QueueClass<Integer> q = new QueueClass<Integer>();

        while (queue.isEmptyQueue() == false) {
            System.out.print(queue.front() + " ");
            q.enqueue(queue.front());
            queue.dequeue();
        }

        while (q.isEmptyQueue() == false) {
            queue.enqueue(q.front());
            q.dequeue();
        }
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LinkedStackClass<Integer> stack = new LinkedStackClass<Integer>();
        QueueClass<Integer> queue = new QueueClass<Integer>();

        System.out.println("Enter integers (999 to stop):");
            Integer i;

        do {
            i = Input_Integer(input);
            stack.push(i);
        }while(i != 999);

        stack.pop(); //removes 999

        System.out.println("The original stack printed in direct order (bottom to top) is:");
            printStack(stack);

        System.out.println("\nThe stack printed in reverse order (top to bottom) is:");
            printBackStack(stack);

        System.out.printf(
            "\nThe stack stores %d items." +
            "\nThe top is: %d" +
            "\nThe second item (below top) is: %d\n",

            countItems(stack),
            stack.peek(),
            getSecond(stack)
        );

        System.out.print("Enter value to be removed from stack: ");
            final Integer ITEM = Input_Integer(input);
            removeItem(stack, ITEM);

        System.out.println("The stack after removing every occurrence of " + ITEM + " is:");
            printStack(stack);

        System.out.println("\nReversed the stack. The new stack printed in direct order is:");
            reverseStack(stack);
            printStack(stack);

        //queue = 3 6 9 12 15 18 21 24 27 30 */
        queue.enqueue(3, 6, 9, 12, 15, 18, 21, 24, 27, 30);
        System.out.println("\nThe queue is:");
            printQueue(queue);

        System.out.println("\nThe reversed queue is:");
            reverseQueue(queue);
            printQueue(queue);
        
        input.close();
    }


    static Integer Input_Integer(Scanner input){
        boolean bad_input = true;
        Integer i = null;
        while(bad_input){
            try{
                i = input.nextInt();
                bad_input = false;
            }catch(InputMismatchException e){
                System.out.println("Invalid input. Please enter an integer.");
                input.nextLine();
            }catch(Exception e){
                System.out.println("Error: " + e.getMessage());
                input.nextLine();
            }
            
        }

        return i;

        
    }

}
