
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

//Client for user­defined classes
//LinkedStackClass and QueueClass
//Methods (missing here): printStack, printQueue
import Queue.QueueClass;
import Stack.LinkedStackClass;
import java.util.*;

public class Lab10_Ex1 {

    // method definition for printStack
    // method definition for printQueue
    public static <T> void printStack(LinkedStackClass<T> STACK) {
        LinkedStackClass<T> stack = new LinkedStackClass<T>();
        
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

    public static <T> void printQueue(QueueClass<T> queue) {
        QueueClass<T> q = new QueueClass<T>();

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

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedStackClass<Character> s = new LinkedStackClass<Character>();
        QueueClass<Character> q = new QueueClass<Character>(10);

        Character ch;
        for (ch = 'A'; ch <= 'H'; ch++)
            s.push(ch);
        System.out.println("Initial stack is: ");
        printStack(s);
        for (int i = 1; i <= 4; i++) {
            s.pop();
            q.enqueue(s.peek());
            s.pop();
            q.enqueue(s.peek());
            s.push(q.front());
            q.dequeue();
        }
        System.out.println("\nFinal stack is: ");
        printStack(s);
        System.out.println("\nThe queue is: ");
        printQueue(q);

        
    }

    public static void mystery(QueueClass<Integer> q) {
        LinkedStackClass<Integer> s = new LinkedStackClass<Integer>();
        while (!q.isEmptyQueue()) {
            s.push(q.front());
            q.dequeue();
        }
        while (!s.isEmptyStack()) {
            q.enqueue(2 * s.peek());
            s.pop();
        }
    }

}