
import Queue.QueueClass;
import Stack.LinkedStackClass;
//Client for user­defined classes
//LinkedStackClass and QueueClass
//Methods (missing here): printStack, printQueue

import java.util.*;

/*Part 1 questtion 1 prints 
    Initial stack is: 
    H G F E D C B A 
    Final stack is: 
    E C B A 
    The queue is: 
    E D D C 
*/
public class Lab10_Ex1 {

    // method definition for printStack
    // method definition for printQueue
    static <T> void printStack(final LinkedStackClass<T> STACK){
        LinkedStackClass<T> stack = new LinkedStackClass<T>();
        while (STACK.isEmptyStack() == false) {
            System.out.print(STACK.peek() + " ");
            stack.push(STACK.peek());
            STACK.pop();
        }
        while (stack.isEmptyStack() == false) {
            STACK.push(stack.peek());
            stack.pop();
        }
    }

    static <T> void printQueue(QueueClass<T> queue){
        while(queue.isEmptyQueue() == false){
            System.out.print(queue.front() + " ");
            queue.dequeue();
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
    
}